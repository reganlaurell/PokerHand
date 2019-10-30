package domain;
import java.util.ArrayList;
import java.util.List;

public class PokerHand {
	
	private final List<Card> _cards = new ArrayList<Card>();
	
	public PokerHand(List<Card> cards) { 
		for(Card card : cards) { _cards.add(card); }
	}
	public PokerHand(Card... cards) { 
		for(Card card : cards) { _cards.add(card); }
	}
	
	public List<Card> GetCards() { return _cards; }
}
