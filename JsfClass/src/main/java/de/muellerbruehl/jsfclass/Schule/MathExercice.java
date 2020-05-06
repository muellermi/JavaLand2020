package de.muellerbruehl.jsfclass.Schule;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class MathExercice implements Serializable {
    private boolean addition;
    private boolean multiplication;
    private boolean division;
    private boolean substraction;


    public boolean isAddition() {
        return addition;
    }

    public void setAddition(boolean addition) {
        this.addition = addition;
    }

    public boolean isMultiplication() {
        return multiplication;
    }

    public void setMultiplication(boolean multiplication) {
        this.multiplication = multiplication;
    }

    public boolean isDivision() {
        return division;
    }

    public void setDivision(boolean division) {
        this.division = division;
    }

    public boolean isSubstraction() {
        return substraction;
    }

    public void setSubstraction(boolean substraction) {
        this.substraction = substraction;
    }
}
