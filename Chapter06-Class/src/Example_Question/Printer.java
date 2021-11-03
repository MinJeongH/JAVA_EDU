package Example_Question;

public class Printer {
	static int number;
	static double dnumber;
	static String content;
	static boolean tf;

	static void println(int n) {
		// this.number = n;
		System.out.println("입력된 값은 " + n);// this.number);
	}

	static void println(double dn) {
		// this.dnumber = dn;
		System.out.println("입력된 값은 " + dn);// this.dnumber);
	}

	static void println(String c) {
//		this.content = c;
		System.out.println("입력된 값은 " + c);// this.content);
	}

	static void println(boolean tf) {
//		this.tf = tf;
		System.out.println("입력된 값은 " + tf);// this.tf);
	}

}
