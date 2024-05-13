package com.example.project_gui;

import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button kinematikButton;

    @FXML
    private Button dynamikButton;

    @FXML
    private Button statikButton;

    private SceneController sceneView;

    @FXML
    void initialize() {
        sceneView = new SceneController();
        kinematikButton.setOnAction(actionEvent -> {
            try {
                sceneView.switchToScene(actionEvent, "viewKinematik.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        dynamikButton.setOnAction(actionEvent -> {
            try {
                sceneView.switchToScene(actionEvent, "viewDynamik.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        statikButton.setOnAction(actionEvent -> {
            try {
                sceneView.switchToScene(actionEvent, "viewStatik.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    @FXML
    void returnBtnClick(ActionEvent event) throws IOException {
        switchFromTheory.switchToScene(event, "start1.fxml");
    }
    SceneController switchFromTheory = new SceneController();
}