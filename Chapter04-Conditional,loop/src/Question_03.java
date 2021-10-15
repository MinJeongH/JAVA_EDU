/*
 * for 문을 이용하여 1부터 100까지의 정수 중 3의 배수의 총 합을 구하라
 */
public class Question_03 {

	final static int NUM_MIN = 1;
	final static int NUM_MAX = 100;
	final static int NUM_MULTI = 3;
	
	public static void main(String[] args) {
		int sum = 0;
		
		for(int num =NUM_MIN; num<=NUM_MAX; num++) {
			if(num % NUM_MULTI == 0) {
				sum += num;
			}
		}
		System.out.printf("%d부터 %d까지의 정수 중 %d의 배수의 총 합은 %d입니다.\n", NUM_MIN, NUM_MAX, NUM_MULTI, sum);
	}

}
