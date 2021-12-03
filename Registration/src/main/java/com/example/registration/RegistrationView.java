package com.example.registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationView {
    private String email;
    private String password;

    public RegistrationView(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void printAll() {
        System.out.println(email);
        System.out.println(password);
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

}
