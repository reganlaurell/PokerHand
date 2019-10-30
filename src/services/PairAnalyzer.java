package services;

import domain.AnalyzedHand;
import domain.PokerHand;
import interfaces.IPairAnalyzer;

public class PairAnalyzer implements IPairAnalyzer {

    @Override
    public boolean IsPair(PokerHand hand) {
        return false;
    }

    @Override
    public AnalyzedHand AnalyzeAsPair(PokerHand hand) {
        return null;
    }

}
