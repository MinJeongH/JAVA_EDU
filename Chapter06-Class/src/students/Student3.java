package students;

public class Student3 {
	// 멤버필드 : property(자원), field, attribute(속성)
	String sno; // 학번
	String name; // 이름
	String subject; // 학과
	String major;
	int age = 33; // 나이

	Student3() {
		this.major = "1학년";
		System.out.println("[1] 기본생성나 호출 : this = " + this);
	}

	Student3(String sno, String name) {
		System.out.printf("[2] 생성자 호출 : this(%s), sno(%s), name(%s)\n", this, sno, name);
		this.sno = sno;
		this.name = name;
	}

	Student3(String sno, String name, int age) {
		System.out.printf("[3] 생성자 호출 : this(%s), sno(%s), name(%s), age(%d)\n", this, sno, name, age);
		this.sno = sno;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Student3 noname = new Student3("1000", "홍길동");

		System.out.println("학번: " + noname.sno);
		System.out.println("이름: " + noname.name);
		System.out.println("학과: " + noname.subject);
		System.out.println("학년: " + noname.major);
		System.out.println("나이: " + noname.age);

		Student3 abc = new Student3("2000", "이사랑", 24);
		System.out.println("학번: " + abc.sno);
		System.out.println("이름: " + abc.name);
		System.out.println("학과: " + abc.subject);
		System.out.println("학년: " + abc.major);
		System.out.println("나이: " + abc.age);

		System.out.println("noname == abc ? " + (noname == abc));
	}

}
