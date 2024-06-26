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

public class MolecularPractController {

    @FXML
    private TextField answerField, answerField1, answerField2;

    @FXML
    private Button chekButton;

    @FXML
    private Button returnButton;

    @FXML
    private Button resetButton;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private Text textAnswer1, textAnswer2, textAnswer3;

    @FXML
    void initialize() {
        AnchorPane.setBottomAnchor(scrollPane, -1.5);
        List<TextField> fieldList = new ArrayList<>(Arrays.asList(answerField, answerField1, answerField2));
        List<String> correctAnswerList = new ArrayList<>(Arrays.asList("24", "0", "34"));
        List<Text> answers = new ArrayList<>(Arrays.asList(textAnswer1, textAnswer2, textAnswer3));

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
            check.reset("molecular");
        });
        chekButton.setOnAction(actionEvent -> {
            check.check("molecular");
            scrollPane.setVvalue(0);
        });
        if (userData.getUserInputMolecular() != null) {
            for (int i = 0; i < fieldList.size(); i++) {
                fieldList.get(i).setText(userData.getUserInputMolecular().get(i));
            }
            check.check("molecular");
        }
    }
}