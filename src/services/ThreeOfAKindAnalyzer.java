
package services;

import domain.AnalyzedHand;
import domain.PokerHand;
import interfaces.IThreeOfAKindAnalyzer;

public class ThreeOfAKindAnalyzer implements IThreeOfAKindAnalyzer {

    @Override
    public boolean IsThreeOfAKind(PokerHand hand) {
        return false;
    }

    @Override
    public AnalyzedHand AnalyzeAsThreeOfAKind(PokerHand hand) {
        return null;
    }    
}
