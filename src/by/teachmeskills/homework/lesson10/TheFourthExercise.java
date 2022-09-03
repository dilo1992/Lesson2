package by.teachmeskills.homework.lesson10;

import java.util.Scanner;

public class TheFourthExercise {
    public static void palindrome(String str) {
        String[] arr = str.toLowerCase().trim().split(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of a word that can be is palindrome: ");
        int number = scanner.nextInt();
        while (number > arr.length) {
            System.out.println("Entered number should be less length than length of phrase!");
            System.out.print("Enter the number of a word that can be is palindrome: ");
            number = scanner.nextInt();
        }
        while (arr[number - 1].length() < 3) {
            System.out.println("A word that contains is two and less chars can`t be a palindrome!");
            System.out.print("Enter the number of a word that can be is palindrome: ");
            number = scanner.nextInt();
        }
        StringBuilder sb = new StringBuilder(arr[number - 1].toString());
        if ((sb.toString()).equals(sb.reverse().toString()) == true) {
            System.out.println("It`s true. This word is palindrome!");
        } else {
            System.out.println("This word isn`t palindrome.");
        }
    }
}
