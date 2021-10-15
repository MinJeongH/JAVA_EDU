
public class Example04 {

	final static int MAX_NUMBER = 100;
	
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 0; i<=MAX_NUMBER; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.printf("계산 결과값은 %d입니다.", sum);

	}

}
