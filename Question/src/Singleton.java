
public class Singleton {

	public static void main(String[] args) {
		singleton.run();
	}

	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	static Singleton getInstance() {
		return singleton;
	}

	void run() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println("(s1 == s2)?" + (s1 == s2));
	}
}
