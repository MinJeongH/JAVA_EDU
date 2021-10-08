/*
 * 할당 연산자 =
 * 왼 = 오
 * 왼쪽에는 반드시 변수
 * 오른쪽에는 연산식
 * 오른쪽의 연산식의 쳐리 결과를 왼쪽으로 할당
 * 왼쪽에 있던 변수의 값은 사라지고 오른쪽에 있는 할당되는 값으로 대체
 */
public class AssignOper {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.printf("y(%d)\n", y);
		
		int z = y = x;
		System.out.printf("x(%d), y(%d), z(%d)\n", x, y, z);
		
		float f = 3.1234f;
		float g = z = (int)f;
		System.out.printf("f(%f), g(%f), z(%d)\n", f, g, z);
		
	}

}
