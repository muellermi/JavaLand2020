package de.muellerbruehl.jsfclass.Schule;

import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Random;

@Named
@ViewScoped
public class GrundSchule implements Serializable {
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

    public GrundSchule()
    {
        Random r=new Random();

        if(r.nextInt(2)==1)
            op="+";
        else
        op="-";

        a=r.nextInt(15);
        if(op=="-")
        b=r.nextInt(a);
        else
            b=r.nextInt(15);
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

    private String op;
    public String getOp() {
        return op;
    }
}
