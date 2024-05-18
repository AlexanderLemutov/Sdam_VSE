package com.example.project_gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class TheoryController {

    SceneController sceneView = new SceneController();

    @FXML
    private Button returnBtn;

    @FXML
    void returnBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "start.fxml");
    }
    @FXML
    void electrodynamicsBtnClick(MouseEvent event) {

    }

    @FXML
    void mechanicsBtnClick(MouseEvent event) {

    }

    @FXML
    void molecularBtnClick(MouseEvent event) {

    }

    @FXML
    void quantumBtnClick(MouseEvent event) {

    }
}
