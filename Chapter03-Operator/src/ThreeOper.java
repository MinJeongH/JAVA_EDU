
public class ThreeOper {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
	
		boolean c = (a > b) ? true : false;
		System.out.printf("a = %d, b = %d, c = %b\n", a, b, c);
		
		String s = (a<b) ? "small" : "big";
		System.out.printf("a = %d, b = %d, s = %s\n", a, b, s);
		
		int x = (a > b) ? a-b : b-a;
		System.out.printf("a = %d, b = %d, x = %d\n", a, b, x);
		
	}

}
