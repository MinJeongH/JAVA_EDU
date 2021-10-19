/*
 * Q3_10*10의 2차원 배열 생성
 * 9*9에 1부터 81까지 순사척으로 1씩 증가한 값을 넣어라
 * 각행, 열의 합을 구해라
 * 가로에는 각 행의 9열에 넣어라
 * 세로에는 각 열의 9행에 넣어라
 */
public class Array_Q3 {

	final static int NUMBER = 10;
	
	public static void main(String[] args) {
		int[][] arr = new int[NUMBER][NUMBER];
		int num = 1;
		
		for (int i = 0; i < NUMBER-1; i++) {
			for (int j = 0; j < NUMBER-1; j++) {
				arr[i][j] = num++;
			}
		}
		
		for (int i = 0; i < NUMBER-1; i++) {
			for (int j = 0; j < NUMBER-1; j++) {
				arr[NUMBER-1][j] += arr[i][j];
				arr[j][NUMBER-1] += arr[j][i];
			}
		}
		
		for (int i = 0; i <= NUMBER-1; i++) {
			for (int j = 0; j <= NUMBER-1; j++) {
				System.out.printf("배열[%d][%d] = %d\n", i, j, arr[i][j]);
			}
		}
	}

}
