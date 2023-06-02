package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Eingabe des Passworts
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();

        scanner.close();

        // Ausgabe der eventuellen Fehlermeldung (Allgemeine Nachricht + individueller in Methoden geprüfter Fehlermeldung)
        String errorMessage = checkPasswordLength(password, 8);
        if (errorMessage.isEmpty()) {
            System.out.println("Password is strong enough. Please remember your Password.");
        } else {
            System.out.println("Please try again: " + errorMessage);
        }
    }

    // Überprüfung der Passwortlänge
    public static String checkPasswordLength(String password, int minimumLength) {
        if (password.length() < minimumLength) {
            return "Password must have at least " + minimumLength + " characters.";
        }
        return checkPasswordStrength(password);
    }

    // Überprüfung der Passwortstärke
    public static String checkPasswordStrength(String password) {
        // Überprüfung auf bekannte schwache Passwörter
        if (password.contains("123")) {
            return "Password is too weak. Please choose a more complex password.";
        }
        return checkPasswordComplexity(password);
    }
    // Überprüfung auf Großbuchstaben
    public static String checkPasswordComplexity(String password) {

        if (!checkIfCapitalLettersIncluded(password)) {
            return "Password must contain at least one uppercase character.";
        }

        if (!checkIfLowerCaseLettersIncluded(password)) {
            return "Password must contain at least one uppercase character.";
        }

        // Überprüfung auf Zahlen
        if (!checkIfNumbersIncluded(password)) {
            return "Password must contain at least one number.";
        }

        // Weitere Überprüfungen auf Passwortstärke...

        return ""; // Password strength is strong
    }

    // Überprüfung, ob Großbuchstaben enthalten sind
    public static boolean checkIfCapitalLettersIncluded(String word) {
        return word.matches(".*[A-Z].*");
    }

    public static boolean checkIfLowerCaseLettersIncluded(String word) {
        return word.matches(".*[a-z].*");
    }

    // Überprüfung, ob Zahlen enthalten sind
    public static boolean checkIfNumbersIncluded(String word) {
        return word.matches(".*[0-9].*");
    }
}
