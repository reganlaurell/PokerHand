package services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import domain.AnalyzedHand;
import domain.CardValue;
import domain.Combination;
import domain.PokerHand;
import interfaces.IHandAnalyzer;
import interfaces.IHandComparer;

public class HandComparerTest {

	private IHandComparer _handComparer;

	private IHandAnalyzer _handAnalyzerMock;
	
	@Before
	public void Before_each_test() {
		_handAnalyzerMock = Mockito.mock(IHandAnalyzer.class);
		_handComparer = new HandComparer(_handAnalyzerMock);
	}
	
	@Test
	public void Should_return_negative_number_if_hand_a_is_less_than_hand_b() {
		PokerHand handA = new PokerHand();
		PokerHand handB = new PokerHand();
		
		
		Mockito.when(_handAnalyzerMock.Analyze(handA)).thenReturn(smallerHand());
		Mockito.when(_handAnalyzerMock.Analyze(handB)).thenReturn(largerHand());
		
		int comparison = _handComparer.Compare(handA, handB);
		
		Assert.assertEquals(-1, comparison);
		
	}
	
	@Test
	public void Should_return_positive_number_if_hand_a_is_greater_than_hand_b() {
		PokerHand handA = new PokerHand();
		PokerHand handB = new PokerHand();
		
		Mockito.when(_handAnalyzerMock.Analyze(handA)).thenReturn(largerHand());
		Mockito.when(_handAnalyzerMock.Analyze(handB)).thenReturn(smallerHand());
		
		int comparison = _handComparer.Compare(handA, handB);
		
		Assert.assertEquals(+1, comparison);
	}
	
	@Test
	public void Should_return_zero_if_hand_a_is_equal_to_hand_b() {
		PokerHand handA = new PokerHand();
		PokerHand handB = new PokerHand();
		
		Mockito.when(_handAnalyzerMock.Analyze(handA)).thenReturn(largerHand());
		Mockito.when(_handAnalyzerMock.Analyze(handB)).thenReturn(largerHand());
		
		int comparison = _handComparer.Compare(handA, handB);
		
		Assert.assertEquals(0, comparison);
	}
	
	private AnalyzedHand largerHand() {
		AnalyzedHand larger = new AnalyzedHand();
		larger.Combination = Combination.Straight;
		larger.HighCardVal1 = CardValue.Eight;
		return larger;
	}
	
	private AnalyzedHand smallerHand() {
		AnalyzedHand smaller = new AnalyzedHand();
		smaller.Combination = Combination.TwoPair;
		smaller.HighCardVal1 = CardValue.Ace;
		smaller.HighCardVal2 = CardValue.Seven;
		smaller.HighCardVal3 = CardValue.Two;
		return smaller;
	}
	
}
