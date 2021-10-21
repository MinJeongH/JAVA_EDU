/*
 * 2개의 2차원 배열 생성
 * a 배열은 아래와 같음
 * int[][] a = {
 * {1,2,3,4},
 * {5,6,7,8}
 * };
 * 
 * b 배열은
 * int[][] b = new int[4][2];
 * 
 * a값을 추출해서 b에 대입 시
 * 1 5
 * 2 6
 * 3 7
 * 4 8
 * 로 출력
 */
public class Array_Q4 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int[][] b = new int[4][2];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				b[i][j] = a[j][i];
				System.out.printf("[%d] ", b[i][j]);
			}
			System.out.println();
		}

	}

}
