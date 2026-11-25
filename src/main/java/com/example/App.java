package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello!");
        Scene scene = new Scene(label, 500, 600);

        stage.setScene(scene);
        stage.show();
        // Later:
        label.setText("A different message");

    }

    public static void main(String[] args) {
        launch(args);
    }
}
