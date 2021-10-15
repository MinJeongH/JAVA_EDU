
public class ForContinue01 {

	public static void main(String[] args) {
		int sum = 0;
		for(int num =0; num<= 10; num++) {
			if(num % 2 ==0) {
				continue;
			}
			
			sum += num;
			System.out.printf("num = %d, sum = %d\n", num, sum);	
		}

	}

}
