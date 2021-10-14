

public class sample {

   public static void main(String[] args) {
      int score = 88;
      char grade = 'X';
      
      if(score >= 0 && score <= 100) { //점수가 0부터 100사이만 처리
         if(score >= 90) {
            grade = 'A';   
         }
         else if (score>=80) {
            grade = 'B';
         }
         else if (score>=70) {
            grade = 'C';
         }
         else if (score>=60) {
            grade = 'D';   
         }
         else {
            grade = 'F';
         }
      }
      
      //System.out.printf("점수(%d)의 등급은 (%c)입니다."); 
      //System.out.printf("점수(%d)의 등급은 %s.", score, (grade == 'X') ? "범위를 넘어섰습니다" : (grade + "입니다"));
      
      
      String gstr = (grade + "입니다");
      String msg = String.format("점수(%d)의 등급은 %s", 
            score, (grade == 'X') ? "범위를 넘어섰습니다" : gstr);
         System.out.println(msg);
      }
   }

      
      



