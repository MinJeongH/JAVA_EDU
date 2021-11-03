
public class Calc {
	int total;

	Calc() {
	}

	Calc(int t) {
		this.total = t;
	}

	int plus(int values) {
		this.total += values;
		return this.total;
	}

	void print() {
		System.out.print(this.total);
	}
}
