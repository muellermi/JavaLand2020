package de.muellerbruehl.jsfclass.Schule;


import java.util.Random;

public abstract class Exercise {

    private final int firstNumber;
    private final int secondNumber;
    //<editor-fold desc="result property">
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    //</editor-fold>
    //<editor-fold desc="message property (get only)">
    private String message;

    public String getMessage() {
        return message;
    }
    //</editor-fold>


    public void checkResult() {
        if (expectedResult() == result) {
            message = "Correct";
        } else {
            message = "falsch! die korrekte Anwort ist :" + expectedResult();
        }
    }

    public Exercise() {
        Random r = new Random();
        firstNumber = r.nextInt(15);
        secondNumber = 1 + r.nextInt(15);
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public abstract int expectedResult();

    public abstract String getOperator();

}
