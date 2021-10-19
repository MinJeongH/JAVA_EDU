/*
 * Q2. 계단식 배열 생성
 * m = 1 ~ 10 1씩 증가
 * n = 1 ~ m 1씩 증가
 * 배열 m*n 을 만들어 m*n의 값을 넣어 출력
 * 각 배열의 행은 m, 열은 n만큼
 */
public class Array_Q2 {

	public static void main(String[] args) {
		for (int m = 1; m <= 10; m++) {			
			for (int n = 1; n <= m; n++) {
				int[][] arr = new int[m][n];
				arr[m-1][n-1] = m * n;
				System.out.printf("arr[%d][%d] = %d\n", m, n, arr[m-1][n-1]);
				int mn = arr[m-1][n-1];
				for (int star = 0; star < mn; star++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			System.out.println("------------------");
		}
	}

}
