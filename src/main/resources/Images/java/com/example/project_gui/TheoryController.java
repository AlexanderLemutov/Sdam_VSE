package com.example.project_gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class TheoryController {

    @FXML
    private Button returnBtn;

    @FXML
    void returnBtnClick(ActionEvent event) throws IOException {
        switchFromTheory.switchToScene(event, "start1.fxml");
    }
    SceneController switchFromTheory = new SceneController();
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
