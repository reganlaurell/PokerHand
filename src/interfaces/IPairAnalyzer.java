package interfaces;

import domain.AnalyzedHand;
import domain.PokerHand;

public interface IPairAnalyzer {
	boolean IsPair(PokerHand hand);
	AnalyzedHand AnalyzeAsPair(PokerHand hand);
}
