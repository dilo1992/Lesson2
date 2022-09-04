package by.teachmeskills.homework.lesson10;

public class MinQuantitySymbols {
    public static void printMinSymbols(String str) {
        str = str.trim();
        String[] arr = str.split(" ");
        StringBuilder restr = new StringBuilder("" + str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                restr.append(str.charAt(i));
            }
        }
        String[] arr2 = restr.toString().split(" ");
        String letter = arr2[0];
        String letter2 = arr[0];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].length() < letter.length()) {
                letter = arr2[i];
                letter2 = arr[i];
            }
        }
        System.out.println("A minimal size phrase of the string is: " + letter2);
    }
}