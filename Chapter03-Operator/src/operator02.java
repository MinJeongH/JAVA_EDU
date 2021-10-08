
public class operator02 {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		int c=a*b;
		System.out.printf("c(%d) = a(%d)*b(%d)\n", c, a, b);
		
		int d = a*(-b);
		System.out.printf("d(%d) = a(%d)*-b(-%d)\n", d, a, b);
		
		int m3 = -3;
		int e = a*m3;
		System.out.printf("e(%d) = a(%d)*m3(%d)\n", e, a, m3);
		
		int m4 = b*-1;
		System.out.printf("m4(%d)\n", m4);
		
		int f = e*m4;
		System.out.printf("f(%d) = e(%d)*m4(%d)\n", f, e, m4);
		
		int g = c+a*b;
		System.out.printf("g(%d) = c(%d)+a(%d)*b(%d)\n", g, e, a, b);
		
		int h = (c+a)*b;
		System.out.printf("h(%d) = (c(%d)+a(%d))*b(%d)\n", h, e, a, b);



		

	}

}
