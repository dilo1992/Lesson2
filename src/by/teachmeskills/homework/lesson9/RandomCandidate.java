package by.teachmeskills.homework.lesson9;

public class RandomCandidate {
    private static int random = 0;

    public static int getRandom() {
        return random;
    }

    public static int setRandom() {
        return random++;
    }

    public static void setRandomResult(int random) {
        RandomCandidate.random = random;
    }
}
