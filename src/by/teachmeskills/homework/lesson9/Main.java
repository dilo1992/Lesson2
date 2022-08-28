package by.teachmeskills.homework.lesson9;

import static by.teachmeskills.homework.lesson9.Voter.*;
import static by.teachmeskills.homework.lesson9.OurHonestVoteAccounter.*;

public class Main {
    public static void main(String[] args) {
        createVoters(100);
        printVoters();
        votingResults();
        votingResultsAfterChanges();
    }
}
