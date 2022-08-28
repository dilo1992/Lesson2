package by.teachmeskills.homework.lesson9;

import static by.teachmeskills.homework.lesson9.Voter.*;
import static by.teachmeskills.homework.lesson9.AgainstAllCandidate.*;
import static by.teachmeskills.homework.lesson9.OfficialCandidate.*;
import static by.teachmeskills.homework.lesson9.IllegalCandidate.*;
import static by.teachmeskills.homework.lesson9.RandomCandidate.*;

public class OurHonestVoteAccounter {

    public OurHonestVoteAccounter() {
    }

    public static void votingResults() {
        for (int i = 0; i < getQuantity(); i++) {
            if (getVoters(i) <= 25) {
                OfficialCandidate.setOfficial();
            }
            if (getVoters(i) > 25 && getVoters(i) <= 50) {
                IllegalCandidate.setIllegal();
            }
            if (getVoters(i) > 50 && getVoters(i) <= 75) {
                RandomCandidate.setRandom();
            }
            if (getVoters(i) > 75 && getVoters(i) <= 100) {
                AgainstAllCandidate.setAgainstAll();
            }
        }
        System.out.println("Voting results before changes: Official candidate: " + getOfficial() +
                " ,illegal candidate: " + getIllegal() + " ,random candidate: " + getRandom() +
                " ,against all candidates: " + getAgainstAll());
    }

    public static void votingResultsAfterChanges() {
        setOfficialResult(getOfficial() + (int) Math.round(0.9 * getAgainstAll()));
        setAgainstAllResult((int) Math.round(0.1 * getAgainstAll()));
        System.out.println("Voting results after changes: Official candidate: " + getOfficial() +
                " ,illegal candidate: " + getIllegal() + " ,random candidate: " + getRandom() +
                " ,against all candidates: " + getAgainstAll());
    }

//Math.max(Math.max(getAgainstAll(),getIllegal()),Math.max(getOfficial(),getRandom())))
}
