
package services;

import domain.AnalyzedHand;
import domain.PokerHand;
import interfaces.ITwoPairAnalyzer;


public class TwoPairAnalyzer implements ITwoPairAnalyzer {

    @Override
    public boolean IsTwoPair(PokerHand hand) {
        return false;
    }

    @Override
    public AnalyzedHand AnalyzeAsTwoPair(PokerHand hand) {
        return null;
    }    
}
