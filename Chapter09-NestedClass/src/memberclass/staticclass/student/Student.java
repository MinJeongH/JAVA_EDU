package memberclass.staticclass.student;

public class Student {
	String name;
	String tel;
	int age;

	static class Score {
		static float AVG_MAX_COUNT = 3.0f;
		int kor, eng, math;
		private Student student;

		Score(Student student) {
		}

		Score(Student student, int k, int e, int m) {
			this.student = student;
			this.kor = k;
			this.eng = e;
			this.math = m;
		}

		int total() {
			return this.kor + this.eng + this.math;
		}

		float avg() {
			return (this.kor + this.eng + this.math) / AVG_MAX_COUNT;
		}

		static float avgcount() {
			return AVG_MAX_COUNT;
		}

		void print(String title) {
			System.out.printf("*Student: name(%s), tel(%s), age(%d)\n", student.name, student.tel, student.age);

			System.out.printf("[%s]\n > 국어 : %d\n > 수학 : %d\n > 영어 : %d\n", title, this.kor, this.math, this.eng);
			System.out.printf(" > 총점 : %d\n > 평균 : %f\n\n", total(), avg());
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
