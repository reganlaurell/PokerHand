package helpers;
import java.util.List;

import domain.Card;
import domain.CardValue;
import domain.PokerHand;

public class HandSorter {

	public static PokerHand SortByValue(PokerHand hand) {
		List<Card> cards = hand.GetCards();
		
		cards.sort((a, b) ->
			a.Value.GetValue() > b.Value.GetValue() ? +1
			: a.Value.GetValue() < b.Value.GetValue() ? -1
			: 0);
		
		return new PokerHand(cards);		
	}
	
	public static PokerHand SortByValueAceLow(PokerHand hand) {
		List<Card> cards = hand.GetCards();
		
		cards.sort((a, b) ->
			AceLowValue(a) > AceLowValue(b) ? +1
			: AceLowValue(a) < AceLowValue(b) ? -1
			: 0);
		
		return new PokerHand(cards);		
	}
	
	private static int AceLowValue(Card card) {
		if (card.Value == CardValue.Ace) {
			return 1;
		} else {
			return card.Value.GetValue();
		}
	}
	
}
