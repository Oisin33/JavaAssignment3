package com.example.registration;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class RegistrationApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException{
        primaryStage.setTitle("Registration");

        FXMLLoader registrationFXML = new FXMLLoader(RegistrationApplication.class.getResource("RegistrationGUI.fxml"));
        Scene scene = new Scene(registrationFXML.load(), 500, 350);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}