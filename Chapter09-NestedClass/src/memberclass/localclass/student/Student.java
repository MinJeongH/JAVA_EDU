package memberclass.localclass.student;

public class Student {
	final static float AVG_MAX_COUNT = 3.0f;

	String name;
	String tel;
	int age;
	int kor, eng, math;

	Student() {
	}

	Student(String n, String t, int a) {
		this.name = n;
		this.tel = t;
		this.age = a;
	}

	void info() {
		System.out.printf("Student: name(%s), tel(%s), age(%d)\n", this.name, this.tel, this.age);
	}

	void printScore(int k, int e, int m) {
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
				this.avg = this.total / AVG_MAX_COUNT;
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

	void print(String title) {
		System.out.printf("*Student: name(%s), tel(%s), age(%d)\n[%s]\n", this.name, this.tel, this.age, title);
	}
}
