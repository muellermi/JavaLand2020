package de.muellerbruehl.jsfclass.session;

import de.muellerbruehl.jsfclass.common.Page;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@SessionScoped
@Named
public class SessionTools implements Serializable {

	private static final long serialVersionUID = 4711L;
	private static final Logger LOGGER = Logger.getLogger("SessionTools");

	private String language = FacesContext.getCurrentInstance().getExternalContext().getRequestLocale().getLanguage();

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}


	public String navigate (Page page){
		return page.url();
	}


	private String _theme = "light";

	public String getTheme() {
		return _theme;
	}

	public void setTheme(String theme) {
		_theme = theme;
	}

	public List<String> getThemes() {
		String resourcePath = obtainResourcePath();
		List<String> themes = obtainThemes(resourcePath);
		return themes;
	}

	private String obtainResourcePath() {
		ServletContext context = (ServletContext) FacesContext
				.getCurrentInstance()
				.getExternalContext()
				.getContext();
		return context.getRealPath("/resources");
	}

	private List<String> obtainThemes(String resourcePath){
		List<String> themes = new ArrayList<>();
		for (File file : new File(resourcePath).listFiles()) {
			addFilenameIfContainsCss(file, themes);
		}
		return themes;
	}

	private void addFilenameIfContainsCss(File file, List<String> themes) {
		if (!file.isDirectory()) {
			return;
		}
		try (Stream<Path> paths = Files.walk(Paths.get(file.getAbsolutePath()))) {
			boolean containsCss = paths
					.filter(Files::isRegularFile)
					.anyMatch(f -> f.toString().toLowerCase().endsWith(".css"));
			if (containsCss) {
				themes.add(file.getName());
			}
		} catch (IOException ex) {
			LOGGER.log(Level.SEVERE, null, ex);
		}
	}

	public void changeTheme(){

		FacesContext context = FacesContext.getCurrentInstance();
		NavigationHandler nav = context.getApplication().getNavigationHandler();
		nav.handleNavigation(context, null, getCurrentUrl());
		//context.responseComplete();
	}

	private String getCurrentUrl(){
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		return request.getRequestURL().toString();
	}
}
