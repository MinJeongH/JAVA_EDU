
public class StringPlus {

	public static void main(String[] args) {
		String hello = "hello";
		String world  = "world";
		String helloworld = hello + "," + world + "!";
		
		System.out.println(hello);
		System.out.println(world);
		System.out.println(helloworld);
		
		String java = "Java";
		String ver = "Ver";
		String version = "";
		
		System.out.printf("version=(%s)\n", version);
		
		version = java + " ";
		version = version + ver;
		version = version + "." + 99;
		
		System.out.printf(version);
		
		

	}

}
