package de.muellerbruehl.jsfclass.Schule;

public class SubExercise extends Exercise {
    @Override
    public int expectedResult() {
        return getFirstNumber()- getSecondNumber();
    }

    @Override
    public String getOperator() {
        return "-";
    }
}
