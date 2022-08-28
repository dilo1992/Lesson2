package by.teachmeskills.homework.lesson9;

import static by.teachmeskills.homework.lesson9.Voter.*;

public class AgainstAllCandidate {
    private static int againstAll = 0;

    public static int getAgainstAll() {
        return againstAll;
    }

    public static void setAgainstAll() {
        againstAll++;
    }
    public static void setAgainstAllResult(int againstAll) {
        AgainstAllCandidate.againstAll = againstAll;
    }
}
