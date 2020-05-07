package de.muellerbruehl.jsfclass.Schule;


public class AddExercise extends Exercise {


    @Override
    public int expectedResult() {
        return getFirstNumber() + getSecondNumber();
    }

    @Override
    public String getOperator() {
        return "+";
    }

}
