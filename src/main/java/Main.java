public class Main {
    public static void main(String[] args) {
        //String Test = checkIfKnownWeakPasswordsIncluded("123");
    }


//Methods
//==========================================

    public static int checkStringLength(String word) {
        return word.length();
    }

    public static boolean checkIfNumbersIncluded(String word) {
        return word.matches(".*[0-9].*");
    }

    public static boolean checkIfCapitalLettersIncluded(String word) {
        if (word.matches(".*[A-Z].*")) {
            return true;
        } else {
            return false;
        }
    }


    public static String checkIfKnownWeakPasswordsIncluded(String word) {
        String result = switch (word) {
            case "123" -> "Password not strong enough";
            case "1234" -> "Password not strong enough";
            case "123456" -> "Password not strong enough";
            case "12345678" -> "Password not strong enough";
            case "123456789" -> "Password not strong enough";
            case "qwerty" -> "Password not strong enough";
            default -> "Password valid";
        };
        return result;
    }


//==============================================
//weak password check with if statement
    /*
        public static String checkIfKnownWeakPasswordsIncluded(String word){
            String[] weakPasswords = {"123", "1234", "123456", "12345678", "123456789", "qwerty"};
            String result = "Check failed";
           for (int i = 0; i < weakPasswords.length; i++) {
               if (word.contains(weakPasswords[i])) {
                   result = "Password not strong enough";
                   break;
               } else {
                   result = "Password valid";
               }
           }
           return result;
        }
     */
//==============================================


}
