package calc;

public class Calc_Question {

	int total;
	int[][] arrayTotal = new int[100][2];
	int count;

	Calc_Question() {
	}

	Calc_Question(int t) {
		this.total = t;
	}

	void clear() {
		this.total = 0;
		this.count = 0;
	}

	Calc_Question(int cO, int cV) {
		int calOp = cO;
		int calVal = cV;
		for (int i = 0; i < arrayTotal.length; i++) {
			arrayTotal[i][0] = calOp;
			arrayTotal[i][1] = calVal;
			switch (calOp) {
			case 0:
				this.plus(calVal);
				System.out.printf("+ [%d]", calVal);
				break;
			case 1:
				this.minus(calVal);
				System.out.printf("- [%d]", calVal);
				break;
			case 2:
				this.multiple(calVal);
				System.out.printf("* [%d]", calVal);
				break;
			case 3:
				this.division(calVal);
				System.out.printf("/ [%d]", calVal);
				break;
			}
		}
	}

	int plus(int value) {
		this.total += value;
		return this.total;
	}

	int minus(int value) {
		this.total -= value;
		return this.total;
	}

	int multiple(int value) {
		this.total *= value;
		return this.total;
	}

	int division(int value) {
		this.total /= value;
		return this.total;
	}

	int sum(int[] value) {
		for (int val : value) {
			this.total += val;
		}
		return this.total;
	}
}
