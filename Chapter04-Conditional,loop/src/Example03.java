/*
 * [Q3. 1 - 100까지 1씩 증가하는 수의 총합을 구해라
 * - 10단위로 주간 결과를 출력
 * - 총 합은 맨 마지막에 한번만 출력
 */
public class Example03 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for ( i = 1; i <= 100; i++) {
			sum += i;
			if ( (i%10 == 0) && ( i<100)) {
				System.out.printf("1부터 %d까지의 중간 계산값은 %d입니다.\n", i, sum);
			}
/*			else if (i == 100) {
				System.out.printf("1부터 %d까지의 결과값은 %d입니다.\n", i, sum);
			}*/
		}
		System.out.printf("1부터 %d까지의 결과값은 %d입니다.\n", i-1, sum);
	}

}
