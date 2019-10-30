package interfaces;
import domain.PokerHand;

public interface IHandComparer {
	int Compare(PokerHand hand1, PokerHand hand2);
}
