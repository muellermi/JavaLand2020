package de.muellerbruehl.jsfclass.Schule;

import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Named
@ViewScoped
public class MathExercice implements Serializable {

    public ExerciseType[] getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(ExerciseType[] selectedItems) {
        this.selectedItems = selectedItems;
    }

    ExerciseType[] selectedItems = new ExerciseType[0];

    public List<SelectItem> getExerciseItems() {
        return Arrays.stream(ExerciseType.values())
                .map(et -> new SelectItem(et, et.description()))
                .collect(Collectors.toList());
    }

    public void exerciseChoice() {
        if (selectedItems.length == 0) return;

        Random random = new Random();
        exercises.clear();
        for (int i = 0; i < 10; i++) {
            ExerciseType exerciseType = selectedItems[random.nextInt(selectedItems.length)];
            exercises.add(exerciseType.createExercise());
        }
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void checkResults() {
        for (Exercise exercise : exercises
        ) {
            exercise.checkResult();
        }
    }

    private List<Exercise> exercises = new ArrayList<>();
}
