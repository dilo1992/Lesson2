package by.teachmeskills.homework.lesson11;

public class DocNumberCheckerWithException {

    public static void printCharOccurrence(String str) throws NumberOfDocumentNotSatisfyException {
        String charOccurrence = str.toLowerCase();
        if (charOccurrence.contains("abc") != true) {
            int i = 1;
            throw new NumberOfDocumentNotSatisfyException(i);
        } else System.out.println(true);
    }

    public static void printStartNumberCheck(String str) throws NumberOfDocumentNotSatisfyException {
        if (str.startsWith("555") != true) {
            int i = 2;
            throw new NumberOfDocumentNotSatisfyException(i);
        } else System.out.println(true);
    }

    public static void printEndNumberCheck(String str) throws NumberOfDocumentNotSatisfyException {
        String endNumberCheck = str.toLowerCase();
        if (endNumberCheck.endsWith("1a2b") != true) {
            int i = 3;
            throw new NumberOfDocumentNotSatisfyException(i);
        } else System.out.println(true);
    }
}
