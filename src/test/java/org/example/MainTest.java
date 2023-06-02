package org.example;

import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void yield7_whenCheckingLengthAufgabe() {
        String input = "Aufgabe";

        int actual = Main.checkStringLength(input);
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void yieldtrue_whenCheckingNumberAufgabe1() {
        String input = "Aufgabe1";

        boolean actual = Main.checkIfNumbersIncluded(input);
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void yieldtfalse_whenCheckingNumberAufgabe() {
        String input = "Aufgabe";

        boolean actual = Main.checkIfNumbersIncluded(input);
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void yieldtrue_whenCheckingCapitalWelt() {
        String input = "Welt";

        boolean actual = Main.checkIfCapitalLettersIncluded(input);
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void yieldnotStrong_whenCheckingWeakPasswordqwerty() {
        String input = "qwerty";

        String actual = Main.checkIfKnownWeakPasswordsIncluded(input);
        String expected = "Password not strong enough";

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void yieldnotStrong_whenCheckingWeakPassword123() {
        String input = "123";

        String actual = Main.checkIfKnownWeakPasswordsIncluded(input);
        String expected = "Password not strong enough";

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void yieldnotStrong_whenCheckingWeakPassword12345678() {
        String input = "12345678";

        String actual = Main.checkIfKnownWeakPasswordsIncluded(input);
        String expected = "Password not strong enough";

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void yieldvalid_whenCheckingWeakPasswordsdhE33() {
        String input = "sdhE33";

        String actual = Main.checkIfKnownWeakPasswordsIncluded(input);
        String expected = "Password valid";

        Assertions.assertEquals(actual, expected);
    }

}
