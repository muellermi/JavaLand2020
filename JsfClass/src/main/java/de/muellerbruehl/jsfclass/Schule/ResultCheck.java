package de.muellerbruehl.jsfclass.Schule;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Random;

@Named
@ViewScoped
public class ResultCheck implements Serializable {
    private int a;
    private int b;
    private int c;
    private String text;


    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String checkMultiplicationResult(int result){
        return "";
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getText() {
        return text;
    }

    public void checkResult() {

        if(op=="+") {
            if (a + b == c)
                text = "Correct";
            else
                text = "falsch! die korrekte Anwort ist :" + (a + b);
        }
        else {
            if (a - b == c)
                text = "Correct";
            else
                text = "falsch! die korrekte Anwort ist :" + (a - b);
        }

    }

    public ResultCheck() {
        Random r=new Random();

        if(true)
            op="+";
        else
            op="-";

        a=r.nextInt(15);
        if(op=="-")
            b=r.nextInt(a);
        else
            b=r.nextInt(15);
    }


    private String op;
    public String getOp() {
        return op;
    }
}
