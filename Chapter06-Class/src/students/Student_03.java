package students;

public class Student_03 {

	String sno;
	String name;
	String subject;
	String major;

	School school;

	Student_03() {
	}

	public Student_03(String sno, String name, String subject, String major) {
		this.sno = sno;
		this.name = name;
		this.subject = subject;
		this.major = major;
	}

	public Student_03(String sno, String name, String subject, String major, School school) {
		this.sno = sno;
		this.name = name;
		this.subject = subject;
		this.major = major;
		this.school = school;
	}

	/*
	 * public Student_03(Student_03 student) { this.sno = sno; this.name = name;
	 * this.subject = subject; this.major = major; this.school = school; }
	 */

	School getSchool() {
		return this.school;
	}

	void setSchool(School school) {
		this.school = school;
	}

	public void printStudent() {
		System.out.println("<학생정보>");

		if (this.sno == null) {
			System.out.println("학생정보가 비어 있습니다.");
			return;
		}
		System.out.printf("학번 : %s\n", this.sno);
		System.out.printf("이름 : %s\n", this.name);
		System.out.printf("학과 : %s\n", this.subject);
		System.out.printf("학년 : %s\n", this.major);
		System.out.println("------------------------");

		if (this.school == null) {
			System.out.println("학교 정보가 없습니다.");
			return;
		}
		this.school.printSchool();
	}
}
