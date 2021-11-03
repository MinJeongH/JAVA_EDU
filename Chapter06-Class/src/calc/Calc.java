/*
 * 계산기(정수)
 * 사칙연산 : + - * / %
 * 출력
 */
package calc;

public class Calc {
	double total;

	Calc() {
	}

	Calc(double t) {
		this.total = t;
	}

	void clear() {
		this.total = 0;
	}

	double sum(double[] values) {
		for (double val : values) {
			this.total += val;
		}
		return this.total;
	}

	double sums(double... values) {
		for (double val : values) {
			this.total += val;
		}
		return this.total;
	}

	double plus(double val) {
		this.total += val;
		return this.total;
	}

	double minus(double val) {
		this.total -= val;
		return this.total;
	}

	double multiple(double val) {
		this.total *= val;
		return this.total;
	}

	double divide(double val) {
		this.total /= val;
		return this.total;
	}

	double mod(double val) {
		this.total %= val;
		return this.total;
	}

	double exaponent(double b, double exp) {
		this.total = Math.pow(b, exp);
		return this.total;
	}

	double squareRoot(double num) {
		this.total = Math.sqrt(num);
		return this.total;
	}

	double total() {
		return this.total;
	}

	void printResult() {
		System.out.printf("total = %.3f\n", this.total);
	}
}
