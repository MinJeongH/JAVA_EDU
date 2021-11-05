package memberclass.staticclass.student;

public class StudentScoreRun {

	public static void main(String[] args) {
		Student student = new Student("우등생", "01033355456", 17);
		Student student2 = new Student("이등생", "0106945721", 15);

		Student.Score s1 = new Student.Score(student, 70, 80, 90);
		Student.Score s2 = new Student.Score(student, 95, 98, 90);
		Student.Score s3 = new Student.Score(student2, 55, 46, 67);

		s1.print("중간");
		s2.print("기말");
		s3.print("중간");

	}

}
