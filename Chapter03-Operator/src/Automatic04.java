
public class Automatic04 {

	public static void main(String[] args) {
		int a  = 10;
		int b = 3;
		int c = a/b;
		int d =a%b;
				
		System.out.printf("c(%d) = a(%d) / b(%d)\n", c, a, b);
		System.out.printf("d(%d) = a(%d) %% b(%d)\n", d, a, b);
		
		int e = a - (b * c);
		System.out.printf("e(%d)\n", e);
		

	}

}
