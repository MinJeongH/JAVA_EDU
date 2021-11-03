
public class Q6_Child extends Q6_Parent {
	private String name;

	public Q6_Child() {
		this("홍길동");
		System.out.println("Child() call");
	}

	public Q6_Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
