package abstraction;

public class A extends Marks {
	int mark1, mark2, mark3;
	A(int m1, int m2, int m3) {
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
	}
	public float getPercentage() {
		float total = ((mark1 + mark2 +mark3)/(float)300)*100;
		return total;
	}
}