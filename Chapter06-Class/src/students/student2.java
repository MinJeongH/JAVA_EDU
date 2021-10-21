package students;

public class student2 {
	// 멤버필드 : property(자원), field, attribute(속성)
	String sno = "1453356"; // 학번
	String name = "홍길동"; // 이름
	String subject = "사회학과"; // 학과
	int age = 33; // 나이

	public static void main(String[] args) {
		student2 noname = new student2();
		System.out.println("학번: " + noname.sno);
		System.out.println("이름: " + noname.name);
		System.out.println("학과: " + noname.subject);
		System.out.println("나이: " + noname.age);

		student2 abc = new student2();
		System.out.println("학번: " + abc.sno);
		System.out.println("이름: " + abc.name);
		System.out.println("학과: " + abc.subject);
		System.out.println("나이: " + abc.age);

		System.out.println("noname == abc ? " + (noname == abc));
	}

}
