/*
 * Q. score는 0 ~ 100 의 임의의 값
 * A : 90 이상
 * B : 80 이상
 * C : 70 이상
 * D : 60 이상
 * F : 50 이상
 * A ~ F 까지 출력
*/

public class ThreeOper2 {

	public static void main(String[] args) {
				int score = 12;
				
				char grade= (score >= 90) ? 'A' : ((score >= 80) ? 'B' : ((score >= 70) ? 'C' : ((score >= 60) ? 'D' : 'F')));
				System.out.printf("score(%d), grade(%c)\n", score, grade);

	}

}
