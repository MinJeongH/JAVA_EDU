package students;

public class School {
	String name;
	String buildyear;
	String address;
	String telno;

	School() {

	}

	public School(String n, String b, String a, String t) {
		this.name = n;
		this.buildyear = b;
		this.address = a;
		this.telno = t;
	}

	void setTelno(String t) {
		this.telno = t;
	}

	public void printSchool() {
		System.out.println("<학교정보>");
		System.out.printf("학교이름 : %s\n", this.name);
		System.out.printf("학교설립연도 : %s\n", this.buildyear);
		System.out.printf("학교주소 : %s\n", this.address);
		System.out.printf("학교전화번호 : %s\n", this.telno);
	}
}
