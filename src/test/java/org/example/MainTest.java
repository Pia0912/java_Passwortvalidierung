package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class MainTest {
    @Test
    void testCheckPasswordLength() {
        //Given int number = 2;

        //When
        String actual = Main.checkPasswordStrength("pia234", 8);

        //Then
        String expected = "Password must have at least 8 characters.";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCheckPasswordStrength() {
        //Given int number = 2;

        //When
        String actual = Main.checkPasswordStrength("Piapiapia", 8);

        //Then
        String expected = "Password must contain at least one number. ";

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testCheckPasswordStrength1() {
        //Given int number = 2;

        //When
        String actual = Main.checkPasswordStrength("pia2345678", 8);

        //Then
        String expected = "Password must contain at least one uppercase letter. ";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCheckPasswordStrength2() {
        //Given int number = 2;

        //When
        String actual = Main.checkPasswordStrength("PIA2345678", 8);

        //Then
        String expected = "Password must contain at least one lowercase letter. ";

        Assertions.assertEquals(expected, actual);
    }
}
