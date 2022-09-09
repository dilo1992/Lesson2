package by.teachmeskills.homework.lesson11;

public class NumberOfDocumentNotSatisfyException extends Exception {
    public NumberOfDocumentNotSatisfyException(int i) {
        super("Entered data don`t satisfy the condition of document");
        if (i == 1) System.out.println("Try to find this phrase with another document");
        if (i == 2) System.out.println("Try to find this numbers with another document");
        if (i == 3) System.out.println("Try to find this ending with another document");
    }
}
