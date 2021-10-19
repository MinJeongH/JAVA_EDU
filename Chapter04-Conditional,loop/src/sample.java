/*
태어난 해, 월, 일을 입력받아 사주팔자를 보는 프로그램을 작성하시오.

사주를 보는 방법)

세 수(년,월,일)가 주어지면,  (년 - 월 + 일)에 마지막 숫자가 0이면 "대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력하세요.
*/


import java.util.Scanner;
import java.io.IOException;

   public class sample {

      public static void main(String[] args ) throws IOException {
         boolean good = true;
         int zero = 0;
         int KeyCode = 0;
         
         Scanner scanner = new Scanner(System.in);
         
         while(good) {
            System.out.printf("--------------------------------\n");
            System.out.printf("당신의 사주는 대박? 별로?\n");
            System.out.println("--------------------------------\n");
            System.out.print("당신의 생년월일 중 생년을 입력하세요 :\n");
            
         }
         
         int num_year = scanner.nextInt();         
         
         if (num_year >= 0) {
        	 zero += num_year;
        	 System.out.print("당신의 생월은?\n");
        	 int num_month = scanner.nextInt();
        	 
        	 if (num_month >=0) {
        		 zero -= num_month;
        		 System.out.print("당신의 생일은?\n");
        		 int num_day = scanner.nextInt();
        		 
        		 if (num_day >= 0) {
        			 int result1 = 0;
        			 result1 -= num_day;
        			 System.out.print("당신의 사주를 분석하고 있습니다.\n계속 진행하려면 Enter 키를 눌러주세요.\n");
        			 int result2 = result1 += num_day;
        			 
        			 KeyCode = System.in.read();
        			 
        			 if (KeyCode == 13 || KeyCode == 10) {
	        			 if (result2 % 10 == 0  ) {
	        				 int result3 = (result2) / 10;
	        				 
	        				 if (result3 == 0) {
	        					 System.out.println("당신의 사주는 대박");
	        					 }
	        				 else {
	        					 System.out.println("당신의 사주는 별로");
	        					 }
	        				 }
	        			 }
        			 }
        		 }
        	 }
         scanner.close();
         }
      }