package domain;

public class AnalyzedHand {
	public Combination Combination;
	public CardValue HighCardVal1;
	public CardValue HighCardVal2;
	public CardValue HighCardVal3;
	
	public int GetValue() {
		int combinationValue = Combination.GetValue();
		int highCardValue1 = HighCardVal1 != null ? HighCardVal1.GetValue() : 0;
		int highCardValue2 = HighCardVal2 != null ? HighCardVal2.GetValue() : 0;
		int highCardValue3 = HighCardVal3 != null ? HighCardVal3.GetValue() : 0;
		
		return (combinationValue * 15 * 15 * 15)
				+ (highCardValue1 * 15 * 15)
				+ (highCardValue2 * 15)
				+ highCardValue3;
	}
}
