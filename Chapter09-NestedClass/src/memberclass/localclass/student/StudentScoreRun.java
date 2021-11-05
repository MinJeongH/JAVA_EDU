package memberclass.localclass.student;

public class StudentScoreRun {

	public static void main(String[] args) {
		Student student = new Student("우등생", "01033355456", 17);
		student.print("중간고사");
		student.printScore(70, 80, 90);
		System.out.print("-----------------\n");
		printScore(65, 40, 90);
	}

	public static void printScore(int k, int e, int m) {
		/*
		 * this.kor = k; this.eng = e; this.math = m;
		 */

		class Score {
			int kor, eng, math;
			int total;
			float avg;

			Score(int k, int e, int m) {
				this.kor = k;
				this.eng = e;
				this.math = m;
				this.total = this.kor + this.eng + this.math;
				this.avg = this.total / 3.0f;
			}

			void print() {
				System.out.printf(" > 국어 : %d\n > 수학 : %d\n > 영어 : %d\n\n", this.kor, this.math, this.eng);
				System.out.printf(" > 총점 : %d\n", this.total);
				System.out.printf(" > 평균 : %f\n", this.avg);
			}
		}

		Score score = new Score(k, e, m);
		score.print();
	}
}
