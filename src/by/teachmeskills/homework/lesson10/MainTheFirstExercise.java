package by.teachmeskills.homework.lesson10;

import java.util.Scanner;

import static by.teachmeskills.homework.lesson10.TheFirstExercise.*;

public class MainTheFirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You`re need enter the number of a document " +
                "(xxxx-yyy-xxxx-yyy-xyxy, where X is letter, Y is number). Your number is: ");
        String str = scanner.nextLine();
        digitOutput(str);
        letterToStar(str);
        lettersToLowerCase(str);
        lettersToUpperWithStringBuilder(str);
        charOccurrence(str);
        startNumberCheck(str);
        endNumberCheck(str);
    }
}
