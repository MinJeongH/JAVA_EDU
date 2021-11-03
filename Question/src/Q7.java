
public class Q7 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int cnt = 0; cnt < array.length; cnt++) {
			if (max < array[cnt]) {
				max = array[cnt];
			}
		}
		System.out.printf("주어진 배열의 최대값은 %d 입니다.", max);
	}
}
