/*
 * Q1. 아래와 같은 5가지 과목의 성적을 처리하라.
 * 국어, 영어, 수학, 과학,역사 과목은 0 - 100 사이의 점수
 * 각 과목별 점수 & 총점 & 평균
 * 배열 사용
 * 평균값은 실수 값으로 처리
 */
public class Array_Q1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		String[] strarr = {"국어", "영어", "수학", "과학", "역사"};
		int total = 0;
		float avg = 0.0f;
		
		for (int i = 0; i < 5; i++) {
			int num_ram = (int)(Math.random()*100)+1;
			arr[i] = num_ram;
			total +=arr[i];
		}
		
		avg = (float)total / arr.length;
		System.out.printf("과목별 점수는\n%s:%d, %s:%d, %s:%d, %s:%d, %s:%d\n", strarr[0], arr[0], strarr[1], arr[1], strarr[2], arr[2], strarr[3], arr[3], strarr[4], arr[4]);
		System.out.printf("총점 : %d, 평균 : %.2f 입니다.", total, avg);
		
	}

}
