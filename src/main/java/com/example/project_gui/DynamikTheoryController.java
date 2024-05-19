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
    void initialize(){
        AnchorPane.setBottomAnchor(scrollPaneTheoryDynamik, -1.5);
        SceneController sceneView = new SceneController();
        returnButton.setOnAction(actionEvent -> {
            try {
                sceneView.switchToScene(actionEvent,"mechTheory.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    SceneController sceneView = new SceneController();
}
