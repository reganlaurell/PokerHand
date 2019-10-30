package interfaces;

import domain.AnalyzedHand;
import domain.PokerHand;

public interface IFullHouseAnalyzer {
	boolean IsFullHouse(PokerHand hand);
	AnalyzedHand AnalyzeAsFullHouse(PokerHand hand);
}
