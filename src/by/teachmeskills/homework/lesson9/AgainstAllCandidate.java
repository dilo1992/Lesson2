package by.teachmeskills.homework.lesson9;

public class AgainstAllCandidate {
    private static int againstAll = 0;

    public static int getAgainstAll() {
        return againstAll;
    }

    public static void addOneVote() {
        againstAll++;
    }
    public static void setAgainstAll(int againstAll) {
        AgainstAllCandidate.againstAll = againstAll;
    }
}
