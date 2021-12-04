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

    @ParameterizedTest
    @ValueSource(strings = {"", "fl@we", "ay!a2"})

    public void invalidPasswordLength(String passwordTest) {
        RegistrationView tester = new RegistrationView("ayladarkleaf@gmail.com", passwordTest);
        assertFalse(tester.validLength());
    }

    @ParameterizedTest
    @ValueSource(strings = {"flowridia&8", "9ayla!leaf"})

    public void validPasswordLength(String passwordTest) {
        RegistrationView tester = new RegistrationView("ayladarkleaf@gmail.com", passwordTest);
        assertTrue(tester.validLength());
    }

    @ParameterizedTest
    @ValueSource(strings = {"@^1572@&5!", "@^685186@!$^"})

    public void noLetters(String passwordTest) {
        RegistrationView tester = new RegistrationView("ayladarkleaf@gmail.com", passwordTest);
        assertFalse(tester.hasLetter());
    }

    @ParameterizedTest
    @ValueSource(strings = {"flowridia&8", "9ayla!leaf"})

    public void validLetters(String passwordTest) {
        RegistrationView tester = new RegistrationView("ayladarkleaf@gmail.com", passwordTest);
        assertTrue(tester.hasLetter());
    }

    @ParameterizedTest
    @ValueSource(strings = {"flowridia&!", "@^ayla!leaf"})

    public void noNumbers(String passwordTest) {
        RegistrationView tester = new RegistrationView("ayladarkleaf@gmail.com", passwordTest);
        assertFalse(tester.hasNumber());
    }

    @ParameterizedTest
    @ValueSource(strings = {"flowridia&1", "99ayla!leaf"})

    public void validNumbers(String passwordTest) {
        RegistrationView tester = new RegistrationView("ayladarkleaf@gmail.com", passwordTest);
        assertTrue(tester.hasNumber());
    }

    @ParameterizedTest
    @ValueSource(strings = {"flowridia65", "99ayla5leaf"})

    public void noSymbols(String passwordTest) {
        RegistrationView tester = new RegistrationView("ayladarkleaf@gmail.com", passwordTest);
        assertFalse(tester.hasSymbol());
    }

    @ParameterizedTest
    @ValueSource(strings = {"flowridia&8", "99ayla!leaf"})

    public void validSymbols(String passwordTest) {
        RegistrationView tester = new RegistrationView("ayladarkleaf@gmail.com", passwordTest);
        assertTrue(tester.hasSymbol());
    }
}