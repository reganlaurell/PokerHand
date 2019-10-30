package services;

import domain.AnalyzedHand;
import domain.PokerHand;
import interfaces.IFourOfAKindAnalyzer;

public class FourOfAKindAnalyzer implements IFourOfAKindAnalyzer{

    @Override
    public boolean IsFourOfAKind(PokerHand hand) {
        return false;
    }

    @Override
    public AnalyzedHand AnalyzeAsFourOfAKind(PokerHand hand) {
        return null;
    }
    
}
