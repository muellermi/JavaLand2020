package de.muellerbruehl.jsfclass.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("firstLetterIsUpperCaseValidator")
public class FirstLetterIsUpperCaseValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) throws ValidatorException {
        String name = (String) value;
        String firstLetter = name.substring(0, 1);
        if (!firstLetter.toUpperCase().equals(firstLetter)){
            throw new ValidatorException(new FacesMessage("Erster Buchstabe muss groß sein"));
        }
    }
}
