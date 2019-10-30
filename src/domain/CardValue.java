package domain;

public enum CardValue {
	King(13),
	Queen(12),
	Jack(11),
	Ten(10),
	Nine(9),
	Eight(8),
	Seven(7),
	Six(6),
	Five(5),
	Four(4),
	Three(3),
	Two(2),
	Ace(14); //ace is special

	private final int value;
	
	CardValue(final int v){ value = v; }
	
	public int GetValue() {return value;}
}
