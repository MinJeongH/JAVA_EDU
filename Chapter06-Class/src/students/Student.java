package students;

public class Student {
	// 멤버필드 : property(자원), field, attribute(속성)
	String sno; // 학번
	String name; // 이름
	String subject; // 학과
	int age; // 나이

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("학번: " + student.sno);
		System.out.println("이름: " + student.name);
		System.out.println("학과: " + student.subject);
		System.out.println("나이: " + student.age);

		Student abc = new Student();
		System.out.println("학번: " + abc.sno);
		System.out.println("이름: " + abc.name);
		System.out.println("학과: " + abc.subject);
		System.out.println("나이: " + abc.age);

	}

}
