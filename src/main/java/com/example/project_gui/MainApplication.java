package com.example.project_gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), stage.getMaxWidth(), stage.getMaxHeight());
        Image image = new Image("file:///C:/Users/j32le/Documents/МГТУ им. Н.Э. Баумана/Разработка GUI приложений/Итоговый проект/Project_GUI/src/main/resources/Images/ege.png");
        stage.getIcons().add(image);
        stage.setTitle("ЕГЭ Физика 2024");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}