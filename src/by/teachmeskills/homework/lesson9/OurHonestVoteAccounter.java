package by.teachmeskills.homework.lesson9;

import java.util.Arrays;
import java.util.Random;

import static by.teachmeskills.homework.lesson9.AgainstAllCandidate.*;
import static by.teachmeskills.homework.lesson9.OfficialCandidate.*;
import static by.teachmeskills.homework.lesson9.IllegalCandidate.*;
import static by.teachmeskills.homework.lesson9.RandomCandidate.*;

public class OurHonestVoteAccounter {
    private static int[][] voters;
    private static int quantity;

    public OurHonestVoteAccounter() {
    }

    public static void createVotersList(int quantity) {
        OurHonestVoteAccounter.quantity = quantity;
        voters = new int[quantity][2];
        for (int i = 0; i < quantity; i++) {
            voters[i][0] = i + 1;
            voters[i][1] = new Random().nextInt(1, 100);
        }
    }

    public static void printVotersList() {
        for (int i = 0; i <= voters.length - 1; i++) {
            System.out.println(Arrays.toString(voters[i]));
        }
    }

    public static void votingResults() {
        for (int i = 0; i < getQuantity(); i++) {
            if (getVotersAdherence(i) <= 25) {
                OfficialCandidate.addOneVote();
            }
            if (getVotersAdherence(i) > 25 && getVotersAdherence(i) <= 50) {
                IllegalCandidate.addOneVote();
            }
            if (getVotersAdherence(i) > 50 && getVotersAdherence(i) <= 75) {
                RandomCandidate.addOneVote();
            }
            if (getVotersAdherence(i) > 75 && getVotersAdherence(i) <= 100) {
                AgainstAllCandidate.addOneVote();
            }
        }
        System.out.println("Voting results before changes: Official candidate: " + getOfficial() +
                " ,illegal candidate: " + getIllegal() + " ,random candidate: " + getRandom() +
                " ,against all candidates: " + getAgainstAll());
    }

    public static void votingResultsAfterChanges() {
        setOfficial(getOfficial() + (int) Math.round(0.9 * getAgainstAll()));
        setAgainstAll((int) Math.round(0.1 * getAgainstAll()));
        System.out.println("Voting results after changes: Official candidate: " + getOfficial() +
                " ,illegal candidate: " + getIllegal() + " ,random candidate: " + getRandom() +
                " ,against all candidates: " + getAgainstAll());
    }

    public static int getVotersAdherence(int i) {
        return voters[i][1];
    }

    public static void setVoters(int[][] voters) {
        OurHonestVoteAccounter.voters = voters;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        OurHonestVoteAccounter.quantity = quantity;
    }
}

