/*
 * 산술연산자
 * + - * / %
 */
public class Automatic {

	public static void main(String[] args) {
		int a  = 10;
		int b = 20;
		int c = a+b;
		System.out.printf("c(%d) = a(%d) + b(%d)\n", c, a, b);
		
		int d = c-40;
		System.out.printf("d(%d) = c(%d) + (%d)\n", d, c, 40);
		
		int e = a+b+c+d;
		System.out.printf("e(%d) = a(%d) + b(%d) + c(%d) + d(%d)\n", e, a, b, c, d);
		
		int g = a-b+c;
		
		
	}

}
