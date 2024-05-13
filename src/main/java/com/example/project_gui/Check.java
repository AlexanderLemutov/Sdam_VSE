package com.example.project_gui;

import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Check {

    private final List<TextField> answerArray;
    private final List<String> correctAnswers;

    public Check(List<TextField> answerArray, List<String> correctAnswers) {
        this.answerArray = answerArray;
        this.correctAnswers = correctAnswers;
    }
    private final ArrayList<String> userList = new ArrayList<>();
    public static UserData userData = new UserData();

    public void check(String key) {
        for (int i = 0; i < answerArray.size(); i++) {
            TextField textField = answerArray.get(i);
            String userInput = textField.getText();
            String correctAnswer = correctAnswers.get(i);
            try {
                if (Double.parseDouble(userInput) == Double.parseDouble(correctAnswer)) {
                    textField.setStyle("-fx-border-color: green; -fx-border-width: 2px; -fx-border-radius: 5;");
                    userList.add(userInput);
                } else {
                    textField.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 5;");
                    userList.add(userInput);
                }
            } catch (NumberFormatException e) {
                textField.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 5;");
                userList.add(userInput);
            }
        }
        if (Objects.equals(key, "kinematik")) {
            userData.setUserInputKinematik(userList);
        } else if (Objects.equals(key, "dynamik")) {
            userData.setUserInputDynamik(userList);
        } else if (Objects.equals(key, "statik")) {
            userData.setUserInputStatik(userList);
        }
    }
}