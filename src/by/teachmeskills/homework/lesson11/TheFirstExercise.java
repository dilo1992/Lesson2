package by.teachmeskills.homework.lesson11;

public class TheFirstExercise {

    public static void charOccurrence(String str) throws NumberOfDocumentNotSatisfyExeption {
        String charOccurrence = str.toLowerCase();
        if (charOccurrence.contains("abc") != true) {
            throw new NumberOfDocumentNotSatisfyExeption();
        }
        else System.out.println(true);
    }

    public static void startNumberCheck(String str) throws NumberOfDocumentNotSatisfyExeption {
        if (str.startsWith("555") != true) {
            throw new NumberOfDocumentNotSatisfyExeption();
        }
        else System.out.println(true);
    }

    public static void endNumberCheck(String str) throws NumberOfDocumentNotSatisfyExeption {
        String endNumberCheck = str.toLowerCase();
        if (endNumberCheck.endsWith("1a2b") != true) {
            throw new NumberOfDocumentNotSatisfyExeption();
        }
        else System.out.println(true);
    }
}
