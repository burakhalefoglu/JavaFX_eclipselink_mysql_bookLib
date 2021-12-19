package com.sakarya.viewjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class KutupApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(KutupApplication.class.getResource("kutup.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Sakarya University Java Lesson Project 2");
        stage.setScene(scene);
        stage.show();

        com.sakarya.viewjavafx.KutupController controller = fxmlLoader.getController();
        controller.startApp();
    }

    public static void main(String[] args) {
        launch();
    }
}