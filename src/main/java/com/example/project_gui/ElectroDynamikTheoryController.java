package com.example.project_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ElectroDynamikTheoryController {

    @FXML
    private Button returnButton;

    @FXML
    void returnBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "theory.fxml");
    }
    SceneController sceneView = new SceneController();
}
