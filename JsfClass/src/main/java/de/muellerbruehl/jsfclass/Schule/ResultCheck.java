//package de.muellerbruehl.jsfclass.Schule;
//
//import javax.faces.view.ViewScoped;
//import javax.inject.Inject;
//import javax.inject.Named;
//import java.io.Serializable;
//import java.util.Random;
//
//@Named
//@ViewScoped
//public class ResultCheck implements Serializable {
//
//    //<editor-fold desc="firstInput property">
//
//    public int getFirstNumber() {
//        return exercise.getFirstNumber();
//    }
//    //</editor-fold>
//
//    //<editor-fold desc="secondInput property">
//    public int getSecondNumber() {
//        return exercise.getSecondNumber();
//    }
//
//    //</editor-fold>
//
//    //<editor-fold desc="result property">
//    private int result;
//
//    public int getResult() {
//        return result;
//    }
//
//    public void setResult(int result) {
//        this.result = result;
//    }
//    //</editor-fold>
//
//    //<editor-fold desc="message property (get only)">
//    private String message;
//
//    public String getMessage() {
//        return message;
//    }
//    //</editor-fold>
//
//    MathExercice mathExercice;
//
//    public String checkMultiplicationResult(int result) {
//        return "";
//    }
//
//    public String getOp() {
//        return exercise.getOperator();
//    }
//
//    @Inject
//    public void operatorChoice(MathExercice mathExercice) {
//
//        this.mathExercice = mathExercice;
//        Random random = new Random();
////        List<String> operators = new ArrayList<>(mathExercice.getOperators());
////        int select = random.nextInt(operators.size());
////        String op = operators.get(select);
////        switch (op){
////            case "+": exercise = new AddExercise();break;
////            case "-": exercise = new SubExercise();break;
////            case "*": exercise = new MultiExercise();break;
////            case "/": exercise= new DivExercise();break;
////        }
//    }
//
//    public void checkResult() {
//        if (exercise.expectedResult() == result) {
//            message = "Correct";
//        } else {
//            message = "falsch! die korrekte Anwort ist :" + exercise.expectedResult();
//        }
//    }
//
//    private Exercise exercise;
//
//}
