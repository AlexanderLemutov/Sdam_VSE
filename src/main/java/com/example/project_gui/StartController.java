package com.example.project_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class StartController {

    @FXML
    private Button exitBtn;

    @FXML
    private Button practiceBtn;

    @FXML
    private Button theoryBtn;

    @FXML
    void exitBtnClick(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void practiceBtnClick(ActionEvent event) throws IOException {
        switchFromStart.switchToScene(event, "view.fxml");
    }

    @FXML
    void theoryBtnClick(ActionEvent event) throws IOException {
        switchFromStart.switchToScene(event, "theory.fxml");

    }

    SceneController switchFromStart = new SceneController();

}