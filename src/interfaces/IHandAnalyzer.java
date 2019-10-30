package interfaces;
import domain.AnalyzedHand;
import domain.PokerHand;

public interface IHandAnalyzer {
	AnalyzedHand Analyze(PokerHand hand);
}
