package memberclass.instanceclass;

public class Product {
	String pid = "P1";
	int count;

	Product() {
		System.out.println("[Product] pid = " + pid);
	}

	Product(String pid) {
		this.pid = pid;
	}

	void makeProduct(String name, int count) {
		this.count += count;
		System.out.printf("[makeProduct] name(%s), count(%d/%d)\n", name, count, this.count);
	}

	int saleProduct(String name, int count) {
		this.count -= count;
		System.out.printf("[saleProduct] name(%s), count(%d/%d)\n", name, count, this.count);
		return this.count;
	}

	class Tv {
		// 정적 필드는 선언 불가
		// static int 로 선언 불가 final 필요
		final static int PRODUCT_TV_CNT = 10;

		Tv() {
			System.out.printf("pid(%s) : Tv\n", pid);
			makeProduct("Tv", PRODUCT_TV_CNT);
		}

		Tv(int count) {
			System.out.printf("pid(%s) : Tv\n", pid);
			makeProduct("Tv", count);
		}

		int sale(int count) {
			return saleProduct("Tv", count);
		}

		// get, set 함수 사용 불가능
		/*
		 * static int getProductTvCnt() { return PRODUCT_TV_CNT; }
		 */

		// 정적 메소드 정의 불가능
	}

	class Smartphone {
		// 정적 필드는 선언 불가
		// static int 로 선언 불가 final 필요
		final static int PRODUCT_SMARTPHONE_CNT = 100;

		Smartphone() {
			System.out.printf("pid(%s) : Smartphone\n", pid);
			makeProduct("Smartphone", PRODUCT_SMARTPHONE_CNT);
		}

		Smartphone(int count) {
			System.out.printf("pid(%s) : Smartphone\n", pid);
			makeProduct("Smartphone", count);
		}

		int sale(int count) {
			return saleProduct("Smartphone", count);
		}
	}
}
