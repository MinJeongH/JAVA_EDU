package memberclass.instanceclass.student;

public class StudentScoreRun {

	public static void main(String[] args) {
		Student student = new Student("우등생", "01033355456", 17);
		student.info();

		Student.Score s1 = student.new Score(70, 80, 90);
		System.out.printf(" > 총점 : %d\n > 평균 : %f\n", s1.total(), s1.avg());

		// student.info(s1);
		s1.print();

		Student.Score s2 = student.new Score(95, 98, 90);
		// student.info(s2);
		s2.print();

		Student student2 = new Student("이등생", "0106945721", 15);
		Student.Score s3 = student2.new Score(55, 46, 67);
		// student2.info(s3);
		s3.print();

	}

}
