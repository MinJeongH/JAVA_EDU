public class Q9 {
	static final int MAX_RANDOM_COUNT = 100;

	int[] values = new int[MAX_RANDOM_COUNT];

	Q9() {
		int cnt = 0;

		while (true) {
			if (cnt > MAX_RANDOM_COUNT - 1) {
				break;
			}

			values[cnt++] = (int) (Math.random() * MAX_RANDOM_COUNT);
		}
	}

	void print() {
		for (int cnt = 0; cnt < MAX_RANDOM_COUNT; cnt++) {
			System.out.printf("value[%d][%d]\n", cnt, values[cnt]);
		}
	}

	public static void main(String[] args) {
		Q9 q9 = new Q9();
		q9.print();
	}

}
