package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppInitializer.class.getResource("/View/MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Main Window");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void btn_add_layoutOnAction(ActionEvent actionEvent) {
    }

    public void btn_start_liveOnAction(ActionEvent actionEvent) {
    }

    public void btn_saveOnAction(ActionEvent actionEvent) {
    }

    public void btn_exitOnAction(ActionEvent actionEvent) {
    }
}