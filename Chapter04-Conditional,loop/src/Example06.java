/*
 * Q6. 임의의 수에서 임의의 배수를 구하라.
 * 난수를 발생하여 임의의 수를 지정
 * 최대값 : 임의의 수는 10 이상 100 이하
 * 배수 : 2 ~ 5까지의 배수
 * 최대값의 배수보다는 커야한다.
 */
public class Example06 {
	final static int MAX_ram =  91;
	final static int MAX_ram_min = 10;
	final static int MULTI_ram =  4;
	final static int MULIT_ram_min = 2;

	public static void main(String[] args) {
		int num_max = (int)(Math.random()*MAX_ram) + MAX_ram_min;
		int num_multi = (int)(Math.random()*MULTI_ram) + MULIT_ram_min;
		
		System.out.printf("최대값 : %d\n배  수 : %d\n결  과 : ", num_max, num_multi);
		
		for(int i=1; i<=100; i++) {
			int multi_value = num_multi * i;
			if(multi_value <= num_max) {
				System.out.printf("%d ", multi_value);
			}
		}
	}

}