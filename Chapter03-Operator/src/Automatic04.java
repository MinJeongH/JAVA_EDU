
public class Automatic04 {

	public static void main(String[] args) {
		int a  = 10;
		int b = 3;
		int c = a/b;
		int d =a%b;
				
		System.out.printf("c(%d) = a(%d) / b(%d)\n", c, a, b);
		System.out.printf("d(%d) = a(%d) %% b(%d)\n", d, a, b);
		
		int e = a - (a / b * b);
		System.out.printf("e(%d)\n", e);
		
		int n1 = a/b;
		int n2 = n1*b;
		int n3 = a-n2;
		System.out.printf("나머지 : n1(%d), n2(%d), n3(%d)\n", n1, n2, n3);
		
		int x = 100 * 2 -10 % 3;
		System.out.printf("x(%d) = 100 * 2 - 10 %% 3 \n", x);
	}

}
