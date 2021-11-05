package memberclass.instanceclass.student;

public class Student {
	String name;
	String tel;
	int age;

	class Score {
		int kor, eng, math;

		Score() {
		}

		Score(int k, int e, int m) {
			this.kor = k;
			this.eng = e;
			this.math = m;
		}

		int total() {
			return this.kor + this.eng + this.math;
		}

		float avg() {
			return (this.kor + this.eng + this.math) / 3.0f;
		}

		void print() {
			System.out.printf("#Student: name(%s), tel(%s), age(%d)\n", Student.this.name, Student.this.tel,
					Student.this.age);

			System.out.printf(" > #총점 : %d\n > #평균 : %f\n", total(), avg());
		}
	}

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

	/*
	 * void info(Score score) {
	 * System.out.printf("Student: name(%s), tel(%s), age(%d)\n", Student.this.name,
	 * Student.this.tel, Student.this.age);
	 * 
	 * System.out.printf(" > 총점 : %d\n > 평균 : %f\n", score.total(), score.avg()); }
	 */
}
