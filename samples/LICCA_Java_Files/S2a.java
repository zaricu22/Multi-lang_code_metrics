public class S2a {
	public void sumProd(int n) {
		float s = 0.0f;//C1
		float p = 1.0f;
		int j;
		for (j = 1; j <= n; j++) {
			s = s + j;
			p = p * j;
			foo(s, p);
		}
	}
	void foo (float sum, float prod) {}
}