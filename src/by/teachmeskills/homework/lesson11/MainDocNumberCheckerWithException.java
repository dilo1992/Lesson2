package by.teachmeskills.homework.lesson11;

import java.util.Scanner;

import static by.teachmeskills.homework.lesson11.DocNumberCheckerWithException.*;

public class MainDocNumberCheckerWithException {
    public static void main(String[] args) throws NumberOfDocumentNotSatisfyException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You`re need enter the number of a document " +
                "(xxxx-yyy-xxxx-yyy-xyxy, where X is letter, Y is number). Your number is: ");
        String str = scanner.nextLine();

        try {
            printCharOccurrence(str);
        } catch (NumberOfDocumentNotSatisfyException e) {
            e.printStackTrace();
        }

        try {
            printStartNumberCheck(str);
        } catch (NumberOfDocumentNotSatisfyException e) {
            e.printStackTrace();
        }

        try {
            printEndNumberCheck(str);
        } catch (NumberOfDocumentNotSatisfyException e) {
            e.printStackTrace();
        }
    }
}
