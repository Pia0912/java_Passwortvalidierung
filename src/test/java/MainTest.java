import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void yieldLength7_whenPuttingInAufgabe(){
        String input = "Aufgabe";

        int actual = Main.checkStringLength(input);
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

     @Test
    void yieldtrue_whenPuttingInAufgabe1(){
        String input = "Aufgabe1";

        boolean actual = Main.checkIfNumbersIncluded(input);
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    void yieldtfalse_whenPuttingInAufgabe(){
        String input = "Aufgabe";

        boolean actual = Main.checkIfNumbersIncluded(input);
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void yieldtrue_whenPuttinginWelt(){
        String input = "Welt";

        boolean actual = Main.checkIfCapitalLettersIncluded(input);
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

}
