package de.muellerbruehl.jsfclass.component;

import de.muellerbruehl.jsfclass.common.Page;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

@RequestScoped
@Named
public class ValidatingBean {
    private String number;  // zur Demo als String, damit JSF nicht die automatische Validierung nutzt
    private String value;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getValue() {
        return value;
    }

    public void numberChecker(FacesContext facesContext, UIComponent uiComponent, Object value) {
        this.value = "" + value;
        try{
            number= "" + Integer.parseInt("" + value);
        }catch (NumberFormatException ex){
            throw new ValidatorException(new FacesMessage(value + " ist keine Zahl"));

        }
    }

    public String goHome(){
        return Page.Home.urlRedirect();
    }

    // Aufgabe Werte per AJAX tauschen
    private String text1;
    private String text2;

	public String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text2 = text1;
		this.text1 = "";
	}
	
	public String getText2() {
		return text2;
	}

	public void setText2(String text2) {
		this.text1 = text2;
		this.text2 = "";
	}
}
