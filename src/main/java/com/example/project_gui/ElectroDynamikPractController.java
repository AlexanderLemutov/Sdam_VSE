package com.example.project_gui;

import java.io.IOException;
import java.util.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import static com.example.project_gui.Check.userData;

public class ElectroDynamikPractController {

    @FXML
    private TextField answerField, answerField1, answerField2, answerField3, answerField4;

    @FXML
    private Button chekButton;

    @FXML
    private Button returnButton;

    @FXML
    private Button resetButton;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private Text textAnswer1, textAnswer2, textAnswer3, textAnswer4, textAnswer5;

    @FXML
    void initialize() {
        AnchorPane.setBottomAnchor(scrollPane, -1.5);
        List<TextField> fieldList = new ArrayList<>(Arrays.asList(answerField, answerField1, answerField2, answerField3, answerField4));
        List<String> correctAnswerList = new ArrayList<>(Arrays.asList("1.2", "600", "25", "13", "4"));
        List<Text> answers = new ArrayList<>(Arrays.asList(textAnswer1, textAnswer2, textAnswer3, textAnswer4, textAnswer5));

        Check check = new Check(fieldList, correctAnswerList, answers);
        SceneController sceneView = new SceneController();
        returnButton.setOnAction(actionEvent -> {
            try {
                sceneView.switchToScene(actionEvent,"pract.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        resetButton.setOnAction(actionEvent -> {
            check.reset("electroDynamik");
        });
        chekButton.setOnAction(actionEvent -> {
            check.check("electroDynamik");
            scrollPane.setVvalue(0);
        });
        if (userData.getUserInputElectroDynamik() != null) {
            for (int i = 0; i < fieldList.size(); i++) {
                fieldList.get(i).setText(userData.getUserInputElectroDynamik().get(i));
            }
            check.check("electroDynamik");
        }
    }
}