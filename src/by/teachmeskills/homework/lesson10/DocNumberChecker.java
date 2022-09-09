package by.teachmeskills.homework.lesson10;

public class DocNumberChecker {

    public static void printDigits(String str) {
        String[] digitBlockArr = str.split("-");
        System.out.println((digitBlockArr[0]) + (digitBlockArr[2]));
    }

    public static void printStarViceLetters(String str) {
        System.out.println(str.replace(str.substring(5, 8), "***").
                replace(str.substring(14, 17), "***"));
    }

    public static void printLettersToLowerCase(String str) {
        String[] lettersToLowerCaseArr = str.toLowerCase().split("-");
        System.out.println(String.valueOf(lettersToLowerCaseArr[1]) + "/" + String.valueOf(lettersToLowerCaseArr[3]) +
                "/" + String.valueOf(lettersToLowerCaseArr[4]).charAt(1) + "/" +
                String.valueOf(lettersToLowerCaseArr[4]).charAt(3));
    }

    public static void printLettersToUpperCase(String str) {
        String lettersToUpperWithStringBuilder = str;
        lettersToUpperWithStringBuilder = lettersToUpperWithStringBuilder.toUpperCase();
        StringBuilder sb = new StringBuilder(lettersToUpperWithStringBuilder);
        System.out.println("Letters: " + sb.substring(5, 8) + "/" + sb.substring(14, 17) + "/" +
                sb.charAt(19) + "/" + sb.charAt(21));
    }

    public static void printCharOccurrence(String str) {
        String charOccurrence = str.toLowerCase();
        System.out.println(charOccurrence.contains("abc"));
    }

    public static void printStartNumberCheck(String str) {
        System.out.println(str.startsWith("555"));
    }

    public static void printEndNumberCheck(String str) {
        String endNumberCheck = str.toLowerCase();
        System.out.println(endNumberCheck.endsWith("1a2b"));
    }
}
