import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Passwort eingeben: ");
        String password = scanner.next();
        createPassword(password);
        //createPassword("test");
        //createPassword("passwort");
    }
    public static void createPassword(String password) {
        boolean length = passwordLength(password);
        boolean number = isThereNumber(password);
        boolean small = smallChar(password);
        boolean large = largeChar(password);
        boolean notBad = badPassword(password);

        //Analyse of Länge, Groß/Kleinschreibung, Zahlen
        if(!notBad) {
            System.out.println("Das Passwort ist schei**");
        }else {
            int count = 0;
            String answer = "";
            if (length) {
                count++;
                answer += "Länge: ok ";
            } else
                answer += "Länge: zu kurz! ";
            if (number) {
                count++;
                answer += "Nummern: ok ";
            } else
                answer += "Nummern: keine! ";
            if (small) {
                count++;
                answer += "Kleinbuchstaben: ok ";
            } else
                answer += "Kleinbuchstaben: keine! ";
            if (large) {
                count++;
                answer += "Großbuchstabe: ok ";
            } else
                answer += "Großbuchstabe: keine! ";

            switch (count) {
                case 1 -> {
                    System.out.println("passwort: schwach");
                    System.out.println(answer);
                }
                case 2 -> {
                    System.out.println("passwort: mittel");
                    System.out.println(answer);
                }
                case 3 -> {
                    System.out.println("passwort: gut");
                    System.out.println(answer);
                }
                case 4 -> {
                    System.out.println("passwort: sehr gut");
                    System.out.println(answer);
                }
                default -> {
                    System.out.println("passwort: sehr schwach");
                    System.out.println(answer);
                }
            }
        }
    }
    public static boolean badPassword(String password) {
        String[] badPass = {"123456", "passwort"};
        for (String pass : badPass) {
            if (password.equals(pass))
                return false;
        }
        return true;
    }
    public static boolean largeChar(String password) {
        /*
        char[] charArray = password.toCharArray();
        boolean large= false;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(charArray[i]))
                large = true;
        }
        return large;
         */
        return password.matches(".*[A-Z].*");
    }
    public static boolean smallChar(String password) {
        /*char[] charArray = password.toCharArray();
        boolean small= false;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isLowerCase((charArray[i])))
                small = true;
        }
        return small;

         */
        return password.matches(".*[a-z].*");
    }
    public static boolean isThereNumber(String password) {
        /*char[] charArray = password.toCharArray();
        boolean number = false;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(charArray[i]))
                number = true;
        }
        return number;
        */
        return password.matches(".*[0-9].*");
    }

    public static boolean passwordLength(String length){
        return length.length() > 5;
    }
}
