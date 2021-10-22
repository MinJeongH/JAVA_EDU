package students;

public class Studentmain {

	public static void main(String[] args) {
		School school = new School("서울과기대", "1910년", "서울 노원구 공릉동", "02-154-5867");

		Student_03 student = new Student_03("1234", "홍길동", "기계공학", "3학년", school);

		student.printStudent();
		System.out.println("****************************");

		Student_03 student2 = new Student_03("1234", "홍길동", "기계공학", "3학년", school);
		// Student_03 student2 = new Student_03(student);

		student2.setSchool(new School("서울대", "1960", "서울시 관악구", "02-493-5843"));
		student2.printStudent();

		School school2 = student2.getSchool();
		school2.setTelno("02-4982-5893");
		System.out.println("****************************");
		student2.printStudent();

	}

}
