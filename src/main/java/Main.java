public class Main {
    static boolean passwordContainsNumber(String p) {
        char[] chars = p.toCharArray();
        boolean flag = false;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                flag = true;
            }
        }
        return flag;
    }

    static boolean PasswordLessThan2CapitalLetters(String p) {
        char[] ch = p.toCharArray();
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                if (Character.isUpperCase(ch[i])) {
                    ++count;
                }
            }
            if (count > 1) {
                flag = true;
            }
        }
        return flag;
    }

    static boolean passwordValidation(String p) {
        if (p.length() < 8) {
            System.out.println("Password too short, must be greater than 8 characters");
            return false;
        } else if (passwordContainsNumber(p)) {
            System.out.println("password cannot contain numbers");
            return false;
        } else if (PasswordLessThan2CapitalLetters(p)) {
            System.out.println("Passwords cannot contain more than 1 uppercases");
            return false;
        } else if (p.equals("password") || p.equals("abcdefgh")) {
            System.out.println("Bad password choice");
            return false;
        } else {
            System.out.println("Success");
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(PasswordLessThan2CapitalLetters("HEllloweoroorjf"));
        passwordValidation("Slytherininin");
    }
}
