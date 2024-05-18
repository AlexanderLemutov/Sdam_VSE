package com.example.project_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class KinematikTheoryController {

    @FXML
    private Button returnBtn;

    @FXML
    void returnBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "mechTheory.fxml");
    }

    SceneController sceneView = new SceneController();

}
