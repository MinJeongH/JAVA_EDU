
public class Q6_Parent {
	public String nation;

	public Q6_Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}

	public Q6_Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
