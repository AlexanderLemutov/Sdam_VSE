package com.example.project_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DynamikTheoryController {

    @FXML
    private Button returnButton;

    @FXML
    private ScrollPane scrollPaneTheoryDynamik;

    @FXML
    void returnBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "mechTheory.fxml");
    }
    SceneController sceneView = new SceneController();
}
