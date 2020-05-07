package de.muellerbruehl.jsfclass.Schule;


public class AddExercise extends Exercise {


    @Override
    public int expectedResult() {
        return firstNumber() + secondNumber();
    }

    @Override
    public String operator() {
        return "+";
    }

}
