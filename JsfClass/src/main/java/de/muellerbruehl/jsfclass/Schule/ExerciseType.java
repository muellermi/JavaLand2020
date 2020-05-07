package de.muellerbruehl.jsfclass.Schule;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public enum ExerciseType {
    addition("Addition",AddExercise.class),
    division("Division",DivExercise.class),
    multiplication("Multiplikation",MultiExercise.class),
    substraction("Substraktion",SubExercise.class)
    ;

    private Class<? extends Exercise> exerciseClass;

    private String description;
    ExerciseType(String description,Class<? extends Exercise> exerciseClass) {
        this.description =description;
        this.exerciseClass=exerciseClass;
    }

    public String description() {
        return description;
    }

    public Exercise createExercise() {
        try {
            return exerciseClass.getConstructor().newInstance();
        } catch (Exception ex) {
            return new AddExercise();
        }
    }
}
