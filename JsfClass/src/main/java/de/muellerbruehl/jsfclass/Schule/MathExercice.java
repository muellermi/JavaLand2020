package de.muellerbruehl.jsfclass.Schule;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Named
@ViewScoped
public class MathExercice implements Serializable {
    private boolean addition;
    private boolean multiplication;
    private boolean division;
    private boolean substraction;

    private Set<String> operators;

    public MathExercice() {
        operators = new HashSet<>();
    }

    public boolean isAddition() {
        return addition;
    }

    public void setAddition(boolean addition) {
        if (addition)
            operators.add("+");
        else
            operators.remove("+");
        this.addition = addition;
        listOperators();
    }

    public boolean isMultiplication() {
        return multiplication;
    }

    public void setMultiplication(boolean multiplication) {
        if (multiplication)
            operators.add("*");
        else
            operators.remove("*");
        this.multiplication = multiplication;
        listOperators();
    }

    public boolean isDivision() {
        return division;
    }

    public void setDivision(boolean division) {
        if (division)
            operators.add("/");
        else
            operators.remove("/");
        this.division = division;
        listOperators();
    }

    public boolean isSubstraction() {
        return substraction;
    }

    public void setSubstraction(boolean substraction) {
        if (substraction)
            operators.add("-");
        else
            operators.remove("-");
        this.substraction = substraction;
        listOperators();
    }

    public Set<String> getOperators() {
        return operators;
    }

    private static final Logger LOGGER = Logger.getLogger("MathExercise");
    public String listOperators(){
        String ops = operators.stream().collect(Collectors.joining(", "));

        LOGGER.log(Level.WARNING, "Operators: " + ops);
        return ops;
    }
}
