package de.muellerbruehl.jsfclass.Schule;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class MathExercice implements Serializable {
    private boolean addition;
    private boolean multiplication;
    private boolean division;
    private boolean substraction;

    private List<String> operators;

    public MathExercice() {
        operators=new ArrayList<String>();
    }

    public boolean isAddition() {
        return addition;
    }

    public void setAddition(boolean addition) {
        operators.add("+");
        this.addition = addition;
    }

    public boolean isMultiplication() {
        return multiplication;
    }

    public void setMultiplication(boolean multiplication) {
        operators.add("*");
        this.multiplication = multiplication;
    }

    public boolean isDivision() {
        return division;
    }

    public void setDivision(boolean division) {
        operators.add("/");
        this.division = division;
    }

    public boolean isSubstraction() {
        return substraction;
    }

    public void setSubstraction(boolean substraction) {
        operators.add("-");
        this.substraction = substraction;
    }

    public List<String> getOperators() {
        return operators;
    }
}
