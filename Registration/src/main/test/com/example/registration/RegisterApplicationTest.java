package com.example.registration;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterApplicationTest {

    @ParameterizedTest
    @ValueSource(strings = {"", "flowridia", "@gmail.com", "flowr idia@gmail.com"})

    public void InvalidEmail(String emailTest) {
        RegistrationView tester = new RegistrationView(emailTest, "Ayla46856");
        assertFalse(tester.validEmail());
    }

    @ParameterizedTest
    @ValueSource(strings = {"flowridiadarkleaf@gmail.com", "ayladarkleaf@gmail.com"})

    public void ValidEmail(String emailTest) {
        RegistrationView tester = new RegistrationView(emailTest, "Ayla46856");
        assertTrue(tester.validEmail());
    }


}