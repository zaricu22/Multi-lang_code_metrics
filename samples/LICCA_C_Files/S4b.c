void foo(float sum, float prod) {}
void main(int n) {
	float sum = 0.0;//C1
	float prod = 1.0;
	int i;
	for (i = 1; i <= n; i++) {
		prod = prod * i;
		sum = sum + i;
		foo(sum, prod);
	}
}