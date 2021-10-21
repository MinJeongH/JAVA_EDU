/*
 * 쇼핑몰 구축
 * 쇼핑목록 : 
 * > 속성 : 구매자, 상품명, 단가, 수량, 금액
 * > 생성자 : 
 *  - 기본 생성자
 *  - 구매자를 파라미터로 받는 생성자
 *  - 전체 속성을 파라미터로 받는 생성자
 * > 생성자별로 생성하는 객체를 만듦
 */
package service;

public class Shopping {

	final static int PRICE_LIMIT = 10000;

	String shopper; // 구매자
	String goods; // 상품명
	int unit_price; // 단가
	int quantity; // 수량
	int price; // 금액

	Shopping() {
	}

	Shopping(String sh) {
		shopper = sh;
	}

	Shopping(String s, String g, int u, int q, int p) {
		shopper = s;
		goods = g;
		unit_price = u;
		quantity = q;
		price = p;
	}

	Shopping(String s, String g, int u, int q) {
		shopper = s;
		goods = g;
		unit_price = u;
		quantity = q;
		price = u * q;
	}

	public static void main(String[] args) {
		Shopping basic = new Shopping();
		basic.printInfo();

		Shopping Shopper_name = new Shopping("홍길동");
		Shopper_name.printInfo();

		Shopping Shop_all = new Shopping("홍이", "접시", 3000, 2);
		// Shop_all.printInfo();
		Shop_all.PrintInfo("홍이");

		boolean shoplimit = Shop_all.priceLimit();
		System.out.println("홍이의 구매금액의 한계?" + shoplimit);

		boolean gshoplimit = globalPriceLimit(Shop_all);
		System.out.println("홍이의 구매금액의 한계?" + gshoplimit);

		Shopping Shop_cal = new Shopping("길이", "책", 5000, 4);
		// Shop_cal.printInfo();
		Shop_cal.PrintInfo("길이");

		boolean shoplimit2 = Shop_cal.priceLimit();
		System.out.println("길이의 구매금액의 한계?" + shoplimit2);

		boolean gshoplimit2 = globalPriceLimit(Shop_cal);
		System.out.println("길이의 구매금액의 한계?" + gshoplimit2);
	}

	boolean priceLimit() {
		boolean limit = (this.price > PRICE_LIMIT);
		return limit;
	}

	static boolean globalPriceLimit(Shopping shop) {
		boolean limit = (shop.price > PRICE_LIMIT);
		return limit;
	}

	void printInfo() {
		System.out.printf("구매자 : %s\n", this.shopper);
		System.out.printf("상품명 : %s\n", this.goods);
		System.out.printf("단가 : %d\n", this.unit_price);
		System.out.printf("수량 : %d\n", this.quantity);
		System.out.printf("금액 : %d\n", this.price);

	}

	void PrintInfo(String title) {
		System.out.printf("<%s의 쇼핑 정보>\n", title);
		printInfo();
	}

}
