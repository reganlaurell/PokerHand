package interfaces;

import domain.AnalyzedHand;
import domain.PokerHand;

public interface IThreeOfAKindAnalyzer {
	boolean IsThreeOfAKind(PokerHand hand);
	AnalyzedHand AnalyzeAsThreeOfAKind(PokerHand hand);
}
