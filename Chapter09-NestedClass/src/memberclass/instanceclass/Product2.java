package memberclass.instanceclass;

public class Product2 {
	private String pid = "P2";
	private int counttv;
	private int countsp;

	private Tv tv;
	private Smartphone smartaphone;

	Product2() {
		System.out.println("[Product] pid = " + pid);
	}

	Product2(String pid) {
		this.pid = pid;
	}

	Tv newTv() {
		this.tv = new Tv();
		return this.tv;
	}

	Tv tv() {
		if (this.tv != null) {
			return this.tv;
		}

		return newTv();
		// return this.tv;
	}

	Smartphone newSmartphone() {
		this.smartaphone = new Smartphone();
		return this.smartaphone;
	}

	Smartphone smartphone() {
		if (this.smartaphone != null) {
			return this.smartaphone;
		}

		return newSmartphone();
		// return this.smartaphone;
	}

	int makeTV(String name, int count) {
		// this.counttv = 0;
		this.counttv += count;
		System.out.printf("[makeTV] name(%s), count(%d/%d)\n", name, count, this.counttv);
		return tv.make(count);
	}

	int makeSmartphone(String name, int count) {
		this.countsp += count;
		System.out.printf("[makeSmartPhone] name(%s), count(%d/%d)\n", name, count, this.countsp);
		return smartaphone.make(count);
	}

	int saleTV(String name, int count) {
		this.counttv -= count;
		System.out.printf("[saleTV] name(%s), count(%d/%d)\n", name, count, this.counttv);
		return tv.sale(count);
	}

	int saleSmartphone(String name, int count) {
		this.countsp -= count;
		System.out.printf("[saleSmartphone] name(%s), count(%d/%d)\n", name, count, this.countsp);
		return smartaphone.sale(count);
	}

	class Tv {
		// 정적 필드는 선언 불가
		// static int 로 선언 불가 final 필요
		final static int PRODUCT_TV_CNT = 10;
		int total;

		Tv() {
			System.out.printf("pid(%s) : Tv\n", pid);
		}

		Tv(int count) {
			this.total = count;
			System.out.printf("pid(%s) : Tv\n", pid);
		}

		int sale(int count) {
			this.total -= count;
			return this.total;
		}

		int make(int count) {
			this.total += count;
			return this.total;
		}

		int total() {
			return this.total;
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
		int total;

		Smartphone() {
			System.out.printf("pid(%s) : Smartphone\n", pid);
		}

		Smartphone(int count) {
			this.total = count;
			System.out.printf("pid(%s) : Smartphone\n", pid);
		}

		int sale(int count) {
			this.total -= count;
			return this.total;
		}

		int make(int count) {
			this.total += count;
			return this.total;
		}

		int total() {
			return this.total;
		}
	}
}
