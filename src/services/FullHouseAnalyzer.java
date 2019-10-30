package services;

import domain.AnalyzedHand;
import domain.PokerHand;
import interfaces.IFullHouseAnalyzer;

public class FullHouseAnalyzer implements IFullHouseAnalyzer {

    @Override
    public boolean IsFullHouse(PokerHand hand) {
        return false;
    }

    @Override
    public AnalyzedHand AnalyzeAsFullHouse(PokerHand hand) {
        return null;
    }
    
}
