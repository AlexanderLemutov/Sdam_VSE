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
    void electrodynamicsBtnClick(MouseEvent event) {

    }

    @FXML
    void mechanicsBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "view.fxml");
    }

    @FXML
    void molecularBtnClick(MouseEvent event) {

    }

    @FXML
    void quantumBtnClick(MouseEvent event) {

    }

    @FXML
    void returnBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "start.fxml");
    }

}
