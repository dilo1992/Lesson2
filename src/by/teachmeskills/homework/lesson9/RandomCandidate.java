package by.teachmeskills.homework.lesson9;

public class RandomCandidate {
    private static int random = 0;

    public static int getRandom() {
        return random;
    }

    public static void addOneVote() {
        random++;
    }

    public static void setRandom(int random) {
        RandomCandidate.random = random;
    }
}
