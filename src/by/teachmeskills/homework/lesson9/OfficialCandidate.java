package by.teachmeskills.homework.lesson9;

public class OfficialCandidate {
    private static int official = 0;

    public static int getOfficial() {
        return official;
    }

    public static void addOneVote() {
        official++;
    }

    public static void setOfficial(int official) {
        OfficialCandidate.official = official;
    }
}
