package by.teachmeskills.homework.lesson10;

public class TheFifthExercise {
    public static void doublingLetters(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            String doubleStr = String.valueOf(str.charAt(i)) + str.charAt(i);
            str2 = str2 + doubleStr;
        }
        System.out.println(str2);
    }
}
