package services;
import domain.AnalyzedHand;
import domain.PokerHand;
import interfaces.*;

public class HandAnalyzer implements IHandAnalyzer {

	private final IStraightFlushAnalyzer _straightFlushAnalyzer;
        private final IFourOfAKindAnalyzer _fourOfAKindAnalyzer;
        private final IFullHouseAnalyzer _fullHouseAnalyzer;
        private final IFlushAnalyzer _flushAnalyzer;
        private final IStraightAnalyzer _straightAnalyzer;
        private final IThreeOfAKindAnalyzer _threeOfAKindAnalyzer;
        private final ITwoPairAnalyzer _twoPairAnalyzer;
        private final IPairAnalyzer _pairAnalyzer;
        private final IHighCardAnalyzer _highCardAnalyzer;
	
	public HandAnalyzer(IStraightFlushAnalyzer straightFlushAnalyzer, IFourOfAKindAnalyzer fourOfAKindAnalyzer,
            IFullHouseAnalyzer fullHouseAnalyzer, IFlushAnalyzer flushAnalyzer, IStraightAnalyzer straightAnalyzer,
            IThreeOfAKindAnalyzer threeOfAKindAnalyzer, ITwoPairAnalyzer twoPairAnalyzer,
            IPairAnalyzer pairAnalyzer, IHighCardAnalyzer highCardAnalyzer) {
		_straightFlushAnalyzer = straightFlushAnalyzer;
                _fourOfAKindAnalyzer = fourOfAKindAnalyzer;
                _fullHouseAnalyzer = fullHouseAnalyzer;
                _flushAnalyzer = flushAnalyzer;
                _straightAnalyzer = straightAnalyzer;
                _threeOfAKindAnalyzer = threeOfAKindAnalyzer;
                _twoPairAnalyzer = twoPairAnalyzer;
                _pairAnalyzer = pairAnalyzer;
                _highCardAnalyzer = highCardAnalyzer;
	}
	
	@Override
	public AnalyzedHand Analyze(PokerHand hand) {
            return null;
	}
	
}
