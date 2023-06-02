public class Main {
    public static void main(String[] args){

    }

    public static int checkStringLength(String word){
        return word.length();
    }

    public static boolean checkIfNumbersIncluded(String word){
        return word.matches(".*[0-9].*");
    }

    public static boolean checkIfCapitalLettersIncluded(String word){
        if (word.matches(".*[A-Z].*")){
            return true;
        }else {
            return false;
        }
    }

}
