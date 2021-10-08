
public class CompareOper {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
		
		boolean eq = (a == b);
		boolean ne = (a != b);
		boolean gt = (a > b);
		boolean ge = (a >= b);
		boolean lt = (c < b);
		boolean le = (b <= c);
		
		System.out.printf("eq(%b) = 'a==b', ne(%b) = 'a!=b', gt(%b) = 'a>b',\n"
				+ "ge(%b) = 'a>=b', lt(%b) = 'c<b', le(%b) = 'b<=c'\n", eq, ne, gt, ge, lt, le);
		
		
		

	}

}
