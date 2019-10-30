package domain;

public enum Combination {
	StraightFlush(9),
	FourOfAKind(8),
	FullHouse(7),
	Flush(6),
	Straight(5),
	ThreeOfAKind(4),
	TwoPair(3),
	Pair(2),
	HighCard(1);
	
	private final int value;
	
	Combination(final int v){ value = v; }
	
	public int GetValue() {return value;}
}
