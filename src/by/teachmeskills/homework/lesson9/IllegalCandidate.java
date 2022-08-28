package by.teachmeskills.homework.lesson9;

public class IllegalCandidate {
    private static int illegal = 0;

    public static int getIllegal() {
        return illegal;
    }

    public static void addOneVote() {
        illegal++;
    }

    public static void setIllegal(int illegal) {
        IllegalCandidate.illegal = illegal;
    }
}
