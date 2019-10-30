package services;

import domain.AnalyzedHand;
import domain.PokerHand;
import interfaces.IFlushAnalyzer;

public class FlushAnalyzer implements IFlushAnalyzer {

    @Override
    public boolean IsFlush(PokerHand hand) {
        return false;
    }

    @Override
    public AnalyzedHand AnalyzeAsFlush(PokerHand hand) {
        return null;
    }
    
}
