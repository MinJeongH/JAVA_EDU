
public class While_Q3 {
	
	final static int MIN_MULTI = 2;
	final static int MAX_MULTI = 9;
	final static int BREAK_VALUE = 30;
	

	public static void main(String[] args) {
		int i = MIN_MULTI;
		
		MultiBreak : for(; i <= MAX_MULTI; ) {
			System.out.printf("%d단\n", i);
			
			int j = 1;
			
			while (j <= MAX_MULTI ) {
				int ij = i*j;
				if(ij > BREAK_VALUE) {
					break MultiBreak;
				}
				System.out.printf("%d * %d = %d\n", i, j, ij);
				j++;
			}
			i++;
		}
		System.out.println("The End");
	}

}
