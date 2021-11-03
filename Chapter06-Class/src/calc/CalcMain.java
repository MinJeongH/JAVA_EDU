package calc;

public class CalcMain {

	// Calc calc = new Calc();
	Calc calc;

	CalcMain() {
		calc = new Calc();
	}

	public static void main(String[] args) {
		CalcMain calc = new CalcMain();
		calc.step1();

		calc.step2();

		calc.step3();

	}

	void step1() {
		// Calc calc = new Calc();
		System.out.println("step1");
		calc.plus(10);
		calc.minus(5);
		calc.multiple(4);
		calc.divide(3);
		double total_main = calc.mod(4);
		double total_c = calc.total();
		calc.printResult();
		calc.clear();
		calc.exaponent(5, 2);
		calc.printResult();
		calc.clear();
		calc.squareRoot(16);
		calc.printResult();

		System.out.printf("total_main = %.3f, total_c = %.3f\n", total_main, total_c);
	}

	void step2() {
		System.out.println("step2");
		calc.plus(20);
		calc.printResult();

		calc.clear();
		calc.exaponent(4, 3);
		calc.printResult();
	}

	void step3() {

		System.out.println("step3");
		calc.clear();

		double[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		calc.sum(values);
		calc.printResult();

		calc.sum(new double[] { 1, 2, 3, 4, 5 });
		calc.printResult();

		calc.sums(2, 4, 6, 8, 10);
		calc.printResult();
	}

}
