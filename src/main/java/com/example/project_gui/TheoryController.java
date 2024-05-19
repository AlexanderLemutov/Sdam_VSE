package com.example.project_gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class TheoryController {

    SceneController sceneView = new SceneController();

    @FXML
    private Button electroDnBtnTheoryStart;

    @FXML
    private Button mechBtnTheoryStart;

    @FXML
    private Button molecularBtnTheoryStart;

    @FXML
    private Button quantBtnTheoryStart;

    @FXML
    private Button returnBtn;

    @FXML
    void returnBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "start.fxml");
    }

    @FXML
    void electrodynamicsBtnClick(ActionEvent event) {

    }

    @FXML
    void mechanicsBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "mechTheory.fxml");
    }

    @FXML
    void molecularBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "molecularTheory.fxml");
    }

    @FXML
    void quantumBtnClick(ActionEvent event) {

    }

}
