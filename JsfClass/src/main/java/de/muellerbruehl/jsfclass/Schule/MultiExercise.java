package de.muellerbruehl.jsfclass.Schule;

public class MultiExercise extends Exercise {
    @Override
    public int expectedResult() {
        return getFirstNumber()* getSecondNumber();
    }

    @Override
    public String getOperator() {
        return "*";
    }
}
