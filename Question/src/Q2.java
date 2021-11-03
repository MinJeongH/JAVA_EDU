
public class Q2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int num = 0; num <= 99; num++) {
			if (num % 2 != 0) {
				sum += num;
			}
		}
		System.out.printf("0 ~ 99 사이의 홀수의 합은 %d 입니다.", sum);
	}
}
