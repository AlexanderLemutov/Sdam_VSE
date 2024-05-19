package com.example.project_gui;

import java.io.IOException;
import java.util.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import static com.example.project_gui.Check.userData;

public class MolecularPractController {

    @FXML
    private TextField answerField, answerField1, answerField2;

    @FXML
    private Button chekButton;

    @FXML
    private Button returnButton;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    void initialize() {
        AnchorPane.setBottomAnchor(scrollPane, -1.5);
        List<TextField> fieldList = new ArrayList<>(Arrays.asList(answerField, answerField1, answerField2));
        List<String> correctAnswerList = new ArrayList<>(Arrays.asList("24", "0", "34"));

        Check check = new Check(fieldList, correctAnswerList);
        SceneController sceneView = new SceneController();
        returnButton.setOnAction(actionEvent -> {
            try {
                sceneView.switchToScene(actionEvent,"pract.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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