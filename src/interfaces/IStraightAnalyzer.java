package interfaces;

import domain.AnalyzedHand;
import domain.PokerHand;

public interface IStraightAnalyzer {
	boolean IsStraight(PokerHand hand);
	AnalyzedHand AnalyzeAsStraight(PokerHand hand);
}
