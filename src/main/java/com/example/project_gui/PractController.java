package com.example.project_gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class PractController {

    SceneController sceneView = new SceneController();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button returnBtn;

    @FXML
    void electrodynamicsBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "viewElectroDynamik.fxml");

    }

    @FXML
    void mechanicsBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "view.fxml");
    }

    @FXML
    void molecularBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "viewMolecular.fxml");
    }

    @FXML
    void quantumBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "viewQuantum.fxml");
    }

    @FXML
    void returnBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "start.fxml");
    }

}
