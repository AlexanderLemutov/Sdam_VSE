package com.example.project_gui;

import java.io.IOException;
import java.util.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import static com.example.project_gui.Check.userData;

public class QuantumPractController {

    @FXML
    private TextField answerField, answerField1, answerField2, answerField3, answerField4, answerField5;

    @FXML
    private Button chekButton;

    @FXML
    private Button resetButton;

    @FXML
    private Button returnButton;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    void initialize() {
        AnchorPane.setBottomAnchor(scrollPane, -1.5);
        List<TextField> fieldList = new ArrayList<>(Arrays.asList(answerField, answerField1, answerField2, answerField3, answerField4, answerField5));
        List<String> correctAnswerList = new ArrayList<>(Arrays.asList("29", "2", "50", "25", "92", "11"));

        Check check = new Check(fieldList, correctAnswerList);
        SceneController sceneView = new SceneController();
        returnButton.setOnAction(actionEvent -> {
            try {
                sceneView.switchToScene(actionEvent,"pract.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        resetButton.setOnAction(actionEvent -> {
            check.reset("quantum");
        });
        chekButton.setOnAction(actionEvent -> {
            check.check("quantum");
            scrollPane.setVvalue(0);
        });


        if (userData.getUserInputQuantum() != null) {
            for (int i = 0; i < fieldList.size(); i++) {
                fieldList.get(i).setText(userData.getUserInputQuantum().get(i));
            }
            check.check("quantum");
        }
    }
}