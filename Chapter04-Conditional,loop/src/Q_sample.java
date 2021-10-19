/*
 * 태어난 해, 월, 일을 입력 받아 사주팔자를 보는 프로그램을 작성하라
 * 사주 보는 방법)
 * 세 수 (연,월,일)이 주어지면 (연 - 월 + 일), 마지막 자리 숫자가 0이면 "대박", 아니면 "그럭저럭" 출력
 */

import java.util.Scanner;

public class Q_sample {

	public static void main(String[] args) {
		
		System.out.printf("당신의 사주를 분석해 드립니다.\n생년월일을 연, 월, 일 순서로 입력 해주세요.\n");
		
		Scanner scanner = new Scanner(System.in);
		int num_year = scanner.nextInt();
		int num_month = scanner.nextInt();
		int num_day = scanner.nextInt();
		
		int num_result = num_year - num_month + num_day; 
		
		if (num_result%10 == 0) System.out.println("대박");
		else System.out.println("그럭저럭");
		}

}
