
public class While_Q1 {

	public static void main(String[] args) {
		int i = 2;
		int j = 1;
		
		while (i < 10) {
			j = 1;
			System.out.printf("%d단\n", i);
			while (j < 10) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				j++;
			}
			i++;
		}

	}

}
