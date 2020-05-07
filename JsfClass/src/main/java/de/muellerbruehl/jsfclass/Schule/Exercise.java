package de.muellerbruehl.jsfclass.Schule;


import java.util.Random;

public abstract class Exercise {

    private final int firstNumber;
    private final int secondNumber;

    public Exercise() {
        Random r = new Random();
        firstNumber = r.nextInt(15);
        secondNumber = r.nextInt(15);
    }

    public int firstNumber() {
        return firstNumber;
    }

    public int secondNumber() {
        return secondNumber;
    }

    public abstract int expectedResult();
    public abstract String operator();

}
