package interfaces;

import domain.AnalyzedHand;
import domain.PokerHand;

public interface IFourOfAKindAnalyzer {
	boolean IsFourOfAKind(PokerHand hand);
	AnalyzedHand AnalyzeAsFourOfAKind(PokerHand hand);
}
