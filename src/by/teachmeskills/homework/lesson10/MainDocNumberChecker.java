package by.teachmeskills.homework.lesson10;

import java.util.Scanner;

import static by.teachmeskills.homework.lesson10.DocNumberChecker.*;

public class MainDocNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You`re need enter the number of a document " +
                "(xxxx-yyy-xxxx-yyy-xyxy, where X is letter, Y is number). Your number is: ");
        String str = scanner.nextLine();
        printDigits(str);
        printStarViceLetters(str);
        printLettersToLowerCase(str);
        printLettersToUpperCase(str);
        printCharOccurrence(str);
        printStartNumberCheck(str);
        printEndNumberCheck(str);
    }
}
