
public class SingleOper {

	public static void main(String[] args) {
		int pp = 0;
		pp++;
		
		System.out.println("pp=" + pp);
		
		++pp;
		System.out.println("pp=" + pp);
		
		int p1 = pp++;
		System.out.printf("p1 = %d, pp = %d\n", p1, pp);
		
		int p2 = ++pp;
		System.out.printf("p2 = %d, pp = %d\n", p2, pp);
		
		
		System.out.printf("pp = %d\n", pp++);
		System.out.printf("pp = %d & %d\n", pp++, pp);
		System.out.printf("pp = %d & %d\n", ++pp, pp);
		
		pp--;

		System.out.printf("pp = %d\n", pp);
		System.out.printf("pp = %d & %d\n", pp--, pp);
		System.out.printf("pp = %d & %d\n", --pp, pp);
		
		
		int x1 = 10;
		int x2 = 10;
		int y1 =x1++ + --x2;
		System.out.printf("x1 = %d, x2 = %d, y1 = %d\n", x1, x2, y1);
		
		int y2 =++x1 + ++x2;
		System.out.printf("x1 = %d, x2 = %d, y2 = %d\n", x1, x2, y2);
		
		
		
	}

}
