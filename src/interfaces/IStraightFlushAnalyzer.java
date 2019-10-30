package interfaces;
import domain.AnalyzedHand;
import domain.PokerHand;

public interface IStraightFlushAnalyzer {
	boolean IsStraightFlush(PokerHand hand);
	AnalyzedHand AnalyzeAsStraightFlush(PokerHand hand);
}
