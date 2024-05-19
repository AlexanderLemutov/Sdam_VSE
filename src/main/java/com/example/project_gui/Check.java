package com.example.project_gui;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Check {

    private final List<TextField> answerArray;
    private final List<String> correctAnswers;
    private final List<Text> answers;

    public Check(List<TextField> answerArray, List<String> correctAnswers, List<Text> answers) {
        this.answerArray = answerArray;
        this.correctAnswers = correctAnswers;
        this.answers = answers;

    }
    private final ArrayList<String> userList = new ArrayList<>();
    public static UserData userData = new UserData();

    public void check(String key) {
        for (int i = 0; i < answerArray.size(); i++) {
            TextField textField = answerArray.get(i);
            String userInput = textField.getText();
            String correctAnswer = correctAnswers.get(i);
            Text answer = answers.get(i);
            try {
                if (Double.parseDouble(userInput) == Double.parseDouble(correctAnswer)) {
                    textField.setStyle("-fx-border-color: green; -fx-border-width: 2px; -fx-border-radius: 5;");
                    userList.add(userInput);
                } else {
                    textField.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 5;");
                    userList.add(userInput);
                    answer.setOpacity(1);
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
        } else if (Objects.equals(key, "molecular")) {
            userData.setUserInputMolecular(userList);
        } else if (Objects.equals(key, "electroDynamik")) {
            userData.setUserInputElectroDynamik(userList);
        } else if (Objects.equals(key, "quantum")) {
            userData.setUserInputQuantum(userList);
        }
    }

    public void reset(String key) {
        for (int i = 0; i < answerArray.size(); i++) {
            TextField textField = answerArray.get(i);
            textField.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-border-radius: 5;");
            textField.setText("");
            Text answer = answers.get(i);
            answer.setOpacity(0);
            }
        if (Objects.equals(key, "kinematik")) {
            userData.setUserInputKinematik(null);
        } else if (Objects.equals(key, "dynamik")) {
            userData.setUserInputDynamik(null);
        } else if (Objects.equals(key, "statik")) {
            userData.setUserInputStatik(null);
        } else if (Objects.equals(key, "molecular")) {
            userData.setUserInputMolecular(null);
        } else if (Objects.equals(key, "electroDynamik")) {
            userData.setUserInputElectroDynamik(null);
        } else if (Objects.equals(key, "quantum")) {
            userData.setUserInputQuantum(null);
        }
    }
}