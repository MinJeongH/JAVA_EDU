package Example_Question;

public class MemberService {
	String id;
	String password;

	boolean login(String i, String p) {
		this.id = i;
		this.password = p;
		if (i == "hong" && p == "12345") {
			return true;
		} else {
			return false;
		}
	}

	void logout(String i) {
		this.id = i;
		System.out.println("로그아웃 되었습니다.");
	}
}
