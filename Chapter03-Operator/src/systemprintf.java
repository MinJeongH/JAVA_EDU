
public class systemprintf {

	public static void main(String[] args) {
		String name = "홍길동";
		int n = 12345;
		float f = 3.12433f;
		double d = 0.1234455566667;
		float e = 0.1234e4f;
		boolean tf = true;
		
		System.out.printf("String : (%s)\n", name);

		System.out.printf("Decimal : (%d)\n", n);
		System.out.printf("Decimal : 8진수(0%o)\n", n);
		System.out.printf("Decimal : 16진수(0x%x)\n", n);
		
		System.out.printf("Float : (%f)\n", f);
		System.out.printf("Double : (%f)\n", d);
		System.out.printf("Exponent : (%e)\n", f);
		System.out.printf("Exponent : (%e)\n", d);
		System.out.printf("Exponent : (%e)\n", e);

		
		System.out.printf("Boolean : (%b)\n", tf);

	}

}