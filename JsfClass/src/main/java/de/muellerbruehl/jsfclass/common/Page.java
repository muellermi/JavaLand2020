package de.muellerbruehl.jsfclass.common;

import java.util.HashMap;
import java.util.Map;

public enum Page {
	  Home("/index"),
	  LabeledText("/component/labeledText"),
	  Validate("/component/validate"),
	  Ajax("/playground/ajax"),
	  Bill("/table/bill"),
	  Schule("/schule/grundSchule"),
	  Mathe_Uebung("/schule/mathe_Uebung")

	  ;

	  private Page(String url) {
	    _url = url;
	  }
	  private final String _url;

	  public String url() {
	    return _url + ".xhtml";
	  }

	  public String urlRedirect() {
	    return _url + ".xhtml?faces-redirect=true";
	  }

	  private static Map<String, String> pages;

	  public static Map<String, String> getPages() {
	    if (pages == null) {
	      pages = new HashMap<>();
	      for (Page page : Page.values()) {
	        pages.put(page.name(), page.url());
	      }
	    }
	    return pages;
	  }
	}

