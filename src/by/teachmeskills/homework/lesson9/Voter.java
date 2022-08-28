package by.teachmeskills.homework.lesson9;

import java.util.Arrays;
import java.util.Random;

public class Voter {
    private static int[][] voters;
    private static int quantity;

    public Voter() {
    }

    public static void createVoters(int quantity) {
        Voter.quantity=quantity;
        voters = new int[quantity][2];
        for (int i = 0; i < quantity; i++) {
            voters[i][0] = i + 1;
            voters[i][1] = new Random().nextInt(1, 100);
        }
    }

    public static void printVoters() {
        for (int i = 0; i <= voters.length - 1; i++) {
            System.out.println(Arrays.toString(voters[i]));
        }
    }

    public static int getVoters(int i) {
        return voters[i][1];
    }

    public static void setVoters(int[][] voters) {
        Voter.voters = voters;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Voter.quantity = quantity;
    }
}
