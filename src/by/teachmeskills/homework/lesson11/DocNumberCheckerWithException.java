package by.teachmeskills.homework.lesson11;

public class DocNumberCheckerWithException {

    public static void printCharOccurrence(String str) throws NumberOfDocumentNotSatisfyException {
        String charOccurrence = str.toLowerCase();
        if (charOccurrence.contains("abc") != true) {
            throw new NumberOfDocumentNotSatisfyException();
        } else System.out.println(true);
    }

    public static void printStartNumberCheck(String str) throws NumberOfDocumentNotSatisfyException {
        if (str.startsWith("555") != true) {
            throw new NumberOfDocumentNotSatisfyException();
        } else System.out.println(true);
    }

    public static void printEndNumberCheck(String str) throws NumberOfDocumentNotSatisfyException {
        String endNumberCheck = str.toLowerCase();
        if (endNumberCheck.endsWith("1a2b") != true) {
            throw new NumberOfDocumentNotSatisfyException();
        } else System.out.println(true);
    }
}
