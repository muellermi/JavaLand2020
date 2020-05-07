package de.muellerbruehl.jsfclass.Schule;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.Random;

@Named
@ViewScoped
public class ResultCheck implements Serializable {

    //<editor-fold desc="firstInput property">
    private int firstInput;

    public int getFirstInput() {
        return firstInput;
    }

    public void setFirstInput(int firstInput) {
        this.firstInput = firstInput;
    }
    //</editor-fold>

    //<editor-fold desc="secondInput property">
    private int secondInput;

    public int getSecondInput() {
        return secondInput;
    }

    public void setSecondInput(int secondInput) {
        this.secondInput = secondInput;
    }
    //</editor-fold>

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

    MathExercice mathExercice;

    public String checkMultiplicationResult(int result) {
        return "";
    }

    @Inject
    public void operatorChoice(MathExercice mathExercice){

        this.mathExercice=mathExercice;
        Random random=new Random();
        List<String> operators=mathExercice.getOperators();
        int select=random.nextInt(operators.size());
        op=operators.get(select);
    }

    public void checkResult() {


        if (op == "+") {
            if (firstInput + secondInput == result)
                message = "Correct";
            else
                message = "falsch! die korrekte Anwort ist :" + (firstInput + secondInput);
        } else {
            if (firstInput - secondInput == result)
                message = "Correct";
            else
                message = "falsch! die korrekte Anwort ist :" + (firstInput - secondInput);
        }

    }

    public ResultCheck() {
        Random r = new Random();

        firstInput = r.nextInt(15);
        if (op == "-" || op == "/")
            secondInput = r.nextInt(firstInput);
        else
            secondInput = r.nextInt(15);
    }


    private String op;

    public void setOp(String op) {
        this.op = op;
    }

    public String getOp() {
        return op;
    }
}
