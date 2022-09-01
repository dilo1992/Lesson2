package by.teachmeskills.homework.lesson10;

public class TheFirstExercise {

    public static void digitOutput(String str) {
        String digitBlock = str;
        String[] digitBlockArr = digitBlock.split("-");
        System.out.println(String.valueOf(digitBlockArr[0]) + String.valueOf(digitBlockArr[2]));
    }

    public static void letterToStar(String str) {
        String letterToStar = str;
        letterToStar = letterToStar.replace(letterToStar.substring(5, 8), "***").
                replace(letterToStar.substring(14, 17), "***");
        System.out.println(letterToStar);
    }

    public static void lettersToLowerCase(String str) {
        String lettersToLowerCase = str;
        String[] lettersToLowerCaseArr = lettersToLowerCase.split("-");
        System.out.println(String.valueOf(lettersToLowerCaseArr[1]).toLowerCase() + "/"
                + String.valueOf(lettersToLowerCaseArr[3]).toLowerCase() +
                "/" + String.valueOf(lettersToLowerCaseArr[4]).toLowerCase().charAt(1) + "/" +
                String.valueOf(lettersToLowerCaseArr[4]).toLowerCase().charAt(3));
    }

    public static void lettersToUpperWithStringBuilder(String str) {
        String lettersToUpperWithStringBuilder = str;
        lettersToUpperWithStringBuilder = lettersToUpperWithStringBuilder.toUpperCase();
        StringBuilder sb = new StringBuilder(lettersToUpperWithStringBuilder);
        System.out.println("Letters: "+sb.substring(5,8)+"/"+sb.substring(14,17)+"/"+
                sb.charAt(19)+"/"+sb.charAt(21));
        }
}
