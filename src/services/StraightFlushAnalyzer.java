package services;

import domain.AnalyzedHand;
import domain.PokerHand;
import interfaces.IStraightFlushAnalyzer;

public class StraightFlushAnalyzer implements IStraightFlushAnalyzer {

	@Override
	public boolean IsStraightFlush(PokerHand hand) {
		return false;
	}
	
	@Override
	public AnalyzedHand AnalyzeAsStraightFlush(PokerHand hand) {
            return null;
	}
}
