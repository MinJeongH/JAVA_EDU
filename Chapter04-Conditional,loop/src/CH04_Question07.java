
import java.util.Scanner;

public class CH04_Question07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		int num_ent = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("| 1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("-------------------------------------");
			System.out.println("선택> ");	
			
			num_ent = scanner.nextInt();
			
			if (num_ent == 1) {
				System.out.println("입금액>");
				int money = scanner.nextInt();
				balance += money;
			}
			else if (num_ent == 2) {
				System.out.println("출금액>");
				int money = scanner.nextInt();
				balance -= money;				
			}
			else if (num_ent == 3) {
				System.out.printf("현재 잔고는 %d 입니다.\n", balance);	
			}
			else if (num_ent == 4) {
				run = false;
			}
			else {
				System.out.printf("1~4 사이의 값을 입력해주십시오.\n");
			}
		}
		
		scanner.close();
		
		System.out.println("프로그램 종료");

	}

}
