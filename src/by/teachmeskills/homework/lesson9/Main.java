package by.teachmeskills.homework.lesson9;

import static by.teachmeskills.homework.lesson9.OurHonestVoteAccounter.*;

public class Main {
    public static void main(String[] args) {
        createVotersList(100);
        printVotersList();
        votingResults();
        votingResultsAfterChanges();
    }
}
