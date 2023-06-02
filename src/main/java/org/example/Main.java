package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
 //Eingabe des Passworts
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();

        scanner.close();

//Ausgabe der eventuellen Fehlermeldung (Allgemeine Nachricht + individueller in Methoden geprüfter error Message)
        String errorMessage = checkPasswordStrength(password, 8);
        if (errorMessage.isEmpty()) {
            System.out.println("Password is strong enough.");
        } else {
            System.out.println("Please try again " + errorMessage);
        }
    }

    // 1 Methoden Check mit Strings
    // -> ob Passwort lang genug ist
    public static String checkPasswordStrength(String password, int minimumLength) {
        if (password.length() < minimumLength) {
            return "Password must have at least " + minimumLength + " characters.";
        }
    // automatischer Error, wenn Passwort vordefinierten entspricht
        if (password.equals("passwort123")) {
            return "Password is a weak password. Please choose a stronger password.";
        }
        if (password.equals("passwort")) {
            return "Password is a weak password. Please choose a stronger password.";
        }
        if (password.equals("1234567")) {
            return "Password is a weak password. Please choose a stronger password.";
        }

        return checkPasswordComplexity(password);
    }

    // Check, ob Passwort mindestens eine Zahl, einen Großbuchstabe und einen Kleinbuchstabe enthält
    public static String checkPasswordComplexity(String password) {
        boolean hasNumber = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;

        char[] passwordArray = password.toCharArray();
        int passwordLength = passwordArray.length;

        for (int i = 0; i < passwordLength; i++) {
            char characters = passwordArray[i];
            if (Character.isDigit(characters)) {
                hasNumber = true;
            } else if (Character.isUpperCase(characters)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(characters)) {
                hasLowercase = true;
            }
        }


            StringBuilder errorMessage = new StringBuilder();
            if (!hasNumber) {
                errorMessage.append("Password must contain at least one number. ");
            }

            if (!hasUppercase) {
                errorMessage.append("Password must contain at least one uppercase letter. ");
            }

            if (!hasLowercase) {
                errorMessage.append("Password must contain at least one lowercase letter. ");
            }

            return errorMessage.toString();
        }
}


