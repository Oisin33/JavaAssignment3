package com.example.registration;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class RegistrationController {
    public TextField emailForm = new TextField();
    public PasswordField passwordForm = new PasswordField();
    public Button registrationButton = new Button("Register");
    public Label response;

    public void registration() {
        RegistrationView createUser = new RegistrationView(emailForm.getText(), passwordForm.getText());

        if (!createUser.validEmail()) {
            response.setTextFill(Color.FIREBRICK);
            response.setText("Invalid Email");
        }

        else if (!createUser.validLength()) {
            response.setTextFill(Color.FIREBRICK);
            response.setText("Password must be minimum 7 characters");
        }

        else if (!createUser.hasLetter()) {
            response.setTextFill(Color.FIREBRICK);
            response.setText("Password must have at least 1 letter");
        }

        else if (!createUser.hasNumber()) {
            response.setTextFill(Color.FIREBRICK);
            response.setText("Password must have at least 1 number");
        }

        else {
            response.setTextFill(Color.MEDIUMSPRINGGREEN);
            response.setText("Registration Complete");
        }
    }
}
