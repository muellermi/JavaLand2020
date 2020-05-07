package de.muellerbruehl.jsfclass.playground;

import de.muellerbruehl.jsfclass.common.Page;
import de.muellerbruehl.jsfclass.session.SessionTools;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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


    private int a;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private int b;
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    private int c;
    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getUmfang(){
        return a+b+c;
    }

    //<editor-fold desc="alter property">
    private int alter;

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
    //</editor-fold>

    //<editor-fold desc="hausNr property">
    private int hausNr;
    public int getHausNr() {
        return hausNr;
    }

    public void setHausNr(int hausNr) {
        this.hausNr = hausNr;
    }
    //</editor-fold>

    public List<SelectItem> getPageItems() {
        return Arrays.stream(Page.values()).map(p -> new SelectItem(p.name(), p.url())).collect(Collectors.toList());
    }

    private String[] selectedItems = {"Home"};

    public String[] getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(String[] selectedItems) {
        this.selectedItems = selectedItems;
    }
    public String getSelection(){
        return Arrays.stream(selectedItems).collect(Collectors.joining(", "));
    }
}
