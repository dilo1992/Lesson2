package by.teachmeskills.homework.lesson11;

import java.util.Scanner;

import static by.teachmeskills.homework.lesson11.TheFirstExercise.*;

public class MainTheFirstExercise {
    public static void main(String[] args) throws NumberOfDocumentNotSatisfyTheCondition {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You`re need enter the number of a document " +
                "(xxxx-yyy-xxxx-yyy-xyxy, where X is letter, Y is number). Your number is: ");
        String str = scanner.nextLine();

        try {
            charOccurrence(str);
        } catch (NumberOfDocumentNotSatisfyTheCondition e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Try to find this phrase with another document");
        }

        try {
            startNumberCheck(str);
        } catch (NumberOfDocumentNotSatisfyTheCondition e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Try to find this numbers with another document");
        }

        try {
            endNumberCheck(str);
        } catch (NumberOfDocumentNotSatisfyTheCondition e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("try to find this ending with another document");
        }
    }
}
