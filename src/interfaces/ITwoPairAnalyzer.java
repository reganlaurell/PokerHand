package interfaces;

import domain.AnalyzedHand;
import domain.PokerHand;

public interface ITwoPairAnalyzer {
	boolean IsTwoPair(PokerHand hand);
	AnalyzedHand AnalyzeAsTwoPair(PokerHand hand);
}
