package com.example.project_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class MechTheoryController {

    @FXML
    private AnchorPane anchor;

    @FXML
    private Text chooseText;

    @FXML
    private Button dynamikButton;

    @FXML
    private Text dynamikText;

    @FXML
    private ImageView dynamikView;

    @FXML
    private Button kinematikButton;

    @FXML
    private Text kinematikText;

    @FXML
    private ImageView kinematikView;

    @FXML
    private Button returnBtn;

    @FXML
    private Button statikButton;

    @FXML
    private Text statikText;

    @FXML
    private ImageView statikView;

    @FXML
    void dynamikBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "dynamikTheory.fxml");
    }

    @FXML
    void kinematikBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "kinematikTheory.fxml");
    }

    @FXML
    void returnBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "theory.fxml");
    }

    @FXML
    void statikBtnClick(ActionEvent event) throws IOException {
        sceneView.switchToScene(event, "viewStatik.fxml");
    }

    SceneController sceneView = new SceneController();

}
