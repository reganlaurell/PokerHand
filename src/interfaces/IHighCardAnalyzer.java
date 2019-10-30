package interfaces;

import domain.AnalyzedHand;
import domain.PokerHand;

public interface IHighCardAnalyzer {
	AnalyzedHand AnalyzeAsHighCard(PokerHand hand);
}
