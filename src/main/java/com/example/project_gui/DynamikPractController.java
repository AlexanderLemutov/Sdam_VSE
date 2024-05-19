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

public class DynamikPractController {

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private TextField answerField, answerField1, answerField2, answerField3, answerField4;

    @FXML
    private Button chekButton;

    @FXML
    private Button returnButton;

    @FXML
    private Button resetButton;

    @FXML
    private Text textAnswer1, textAnswer2, textAnswer3, textAnswer4, textAnswer5;



    @FXML
    void initialize() {
        AnchorPane.setBottomAnchor(scrollPane, -1.5);
        List<TextField> fieldList = new ArrayList<>(Arrays.asList(answerField, answerField1, answerField2, answerField3, answerField4));
        List<String> correctAnswerList = new ArrayList<>(Arrays.asList("10", "2", "2", "0.5", "20"));
        List<Text> answers = new ArrayList<>(Arrays.asList(textAnswer1, textAnswer2, textAnswer3, textAnswer4, textAnswer5));

        Check check = new Check(fieldList, correctAnswerList, answers);
        SceneController sceneView = new SceneController();
        returnButton.setOnAction(actionEvent -> {
            try {
                sceneView.switchToScene(actionEvent,"view.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        resetButton.setOnAction(actionEvent -> {
            check.reset("dynamik");
        });
        chekButton.setOnAction(actionEvent -> {
            check.check("dynamik");
            scrollPane.setVvalue(0);
        });
        if (userData.getUserInputDynamik() != null) {
            for (int i = 0; i < fieldList.size(); i++) {
                fieldList.get(i).setText(userData.getUserInputDynamik().get(i));
            }
            check.check("dynamik");
        }
    }
}