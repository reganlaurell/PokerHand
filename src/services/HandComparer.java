package services;
import domain.AnalyzedHand;
import domain.PokerHand;
import interfaces.IHandAnalyzer;
import interfaces.IHandComparer;

public class HandComparer implements IHandComparer {

	private IHandAnalyzer _handAnalyzer;
	
	public HandComparer(IHandAnalyzer handAnalyzer) {
		_handAnalyzer = handAnalyzer;
	}
	
	@Override
	public int Compare(PokerHand hand1, PokerHand hand2) {
		AnalyzedHand analyzedHand1  = _handAnalyzer.Analyze(hand1);
		AnalyzedHand analyzedHand2  = _handAnalyzer.Analyze(hand2);
		
		if (analyzedHand1.GetValue() > analyzedHand2.GetValue()) {return 1;}
		else if (analyzedHand1.GetValue() < analyzedHand2.GetValue()) { return -1; }
		return 0;
	}	
}
