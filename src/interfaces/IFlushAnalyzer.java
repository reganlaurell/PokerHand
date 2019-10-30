package interfaces;

import domain.AnalyzedHand;
import domain.PokerHand;

public interface IFlushAnalyzer {
	boolean IsFlush(PokerHand hand);
	AnalyzedHand AnalyzeAsFlush(PokerHand hand);
}
