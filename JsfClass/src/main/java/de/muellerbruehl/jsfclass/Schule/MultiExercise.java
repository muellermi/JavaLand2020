package de.muellerbruehl.jsfclass.Schule;

public class MultiExercise extends Exercise {
    @Override
    public int expectedResult() {
        return firstNumber()* secondNumber();
    }

    @Override
    public String operator() {
        return "*";
    }
}
