
package services;

import domain.AnalyzedHand;
import domain.PokerHand;
import interfaces.IStraightAnalyzer;

public class StraightAnalyzer implements IStraightAnalyzer {

    @Override
    public boolean IsStraight(PokerHand hand) {
        return false;
    }

    @Override
    public AnalyzedHand AnalyzeAsStraight(PokerHand hand) {
        return null;
    }
    
}
