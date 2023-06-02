import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MainTest {
    @ParameterizedTest
    @CsvSource(
            value = {
                    "abc; false",
                    "abcde; false",
                    "abcdefg; true",
                    "DG53gfds; true",
            },
            delimiter = ';'
    )
    void compare_length(String password, boolean expected){
        Assertions.assertEquals(expected, Main.passwordLength(password));
    }
    @ParameterizedTest
    @CsvSource(
            value = {
                    "abc1; true",
                    "assde; false",
                    "3e4rSD; true",
            },
            delimiter = ';'
    )
    void areThereNumbers(String password, boolean expected){
        Assertions.assertEquals(expected, Main.isThereNumber(password));
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "abc1; true",
                    "ADFGE3; false",
                    "3e4rSD; true",
            },
            delimiter = ';'
    )
    void areThereSmallChars(String password, boolean expected){
        Assertions.assertEquals(expected, Main.smallChar(password));
    }
    @ParameterizedTest
    @CsvSource(
            value = {
                    "abc1; false",
                    "ADFGE3; true",
                    "3e4rSD; true",
                    "fdgh456fdf5; false"
            },
            delimiter = ';'
    )
    void areThereLargeChars(String password, boolean expected){
        Assertions.assertEquals(expected, Main.largeChar(password));
    }
    @ParameterizedTest
    @CsvSource(
            value = {
                    "passwort; false",
                    "ADFGE3; true",
                    "3e4rSD; true",
                    "123456; false",
            },
            delimiter = ';'
    )
    void badPassword(String password, boolean expected){
        Assertions.assertEquals(expected, Main.badPassword(password));
    }
}
