package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class MainTest {
    @Test
    void testCheckPasswordLength() {
        //Given int number = 2;

        //When
        String actual = Main.checkPasswordLength("pia234", 8);

        //Then
        String expected = "Password must have at least 8 characters.";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCheckPasswordStrength1() {
        //Given int number = 2;

        //When
        String actual = Main.checkPasswordStrength("Pia123");

        //Then
        String expected = "Password is too weak. Please choose a more complex password.";

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testCheckPasswordComplexity() {
        //Given int number = 2;

        //When
        String actual = Main.checkPasswordComplexity("pia123");

        //Then
        String expected = "Password must contain at least one uppercase character.";

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testCheckPasswordComplexity2() {
        //Given int number = 2;

        //When
        String actual = Main.checkPasswordComplexity("PIAPIA123");

        //Then
        String expected = "Password must contain at least one lowercase character.";

        Assertions.assertEquals(expected, actual);
    }
}
