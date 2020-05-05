package de.muellerbruehl.jsfclass.playground;

import de.muellerbruehl.jsfclass.session.SessionTools;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ApplicationScoped
public class JsfKurs implements Serializable {

    private SessionTools sessionTools;

    @Inject
    public JsfKurs(SessionTools sessionTools){
        this.sessionTools = sessionTools;
        firstName = sessionTools.getTheme();
    }

    //<editor-fold desc="Property LastName">
    private String lastName = "Nobody";
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //</editor-fold>

    //<editor-fold desc="Property FirstName">
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //</editor-fold>

    private boolean button1 = true;
    public boolean getButton1() {
        return button1;
    }

    public void setButton1(boolean button1) {
        this.button1 = button1;
    }

    public void toggleButton(){
        button1 = !button1;
    }
}
