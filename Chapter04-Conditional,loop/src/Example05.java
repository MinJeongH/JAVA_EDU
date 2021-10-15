
public class Example05 {

	final static int MAX_NUMBER = 100;
	final static int MAX_SUM  = MAX_NUMBER * (MAX_NUMBER +1) / 2;
	
	public static void main(String[] args) {
		int sum_odd = 0;
		int sum_even = 0;
		
		for (int i = 0; i<=MAX_NUMBER; i++) {
			if (i % 2 == 0) {
				sum_even += i;
			}
			else if (i % 2 == 1) {
				sum_odd += i;
			}
		}
		System.out.printf("1부터 %d까지의 홀수의 합은 %d입니다.\n", MAX_NUMBER, sum_odd);
		System.out.printf("1부터 %d까지의 짝수의 합은 %d입니다.\n", MAX_NUMBER, sum_even);
		System.out.printf("전체 합은 %d입니다.\n", MAX_SUM);

	}

}
