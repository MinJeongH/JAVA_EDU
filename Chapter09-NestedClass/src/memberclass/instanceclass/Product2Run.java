package memberclass.instanceclass;

public class Product2Run {

	public static void main(String[] args) {
		Product2 product2 = new Product2("2nd");

		/*
		 * Product2.Tv tv2 = product2.new Tv(); int totTv2 = product2.saleTV("STV", 7);
		 * 
		 * Product2.Smartphone smartphone = product2.new Smartphone(100); int totSm2 =
		 * product2.saleSmartphone("SMP", 100);
		 */

		Product2.Tv tv = product2.newTv();
		int totalTv = product2.makeTV("STV", 77);
		totalTv = product2.saleTV("STV", 7);
		System.out.printf("[STV] totaltv(%d), total(%d)\n", totalTv, tv.total());

		Product2.Tv stv = product2.tv();
		int stv_tot = product2.saleTV("STV_2", 4);
		System.out.printf("[STV_2] totaltv(%d), total(%d)\n", stv_tot, stv.total());

		Product2.Tv htv = product2.newTv();
		int htv_tot = product2.makeTV("HTV", 80);
		htv_tot = product2.saleTV("HTV", 5);
		System.out.printf("[HTV] totaltv(%d), total(%d)\n", htv_tot, htv.total());

		System.out.printf("tv == htv ? (%b)\n", (tv == htv));

		Product2.Tv tv1 = product2.new Tv(88);
		System.out.printf("tv1 : total(%d), count(%d)\n", tv1.total()); // ,product2.counttv); -> private이 안붙어있으면
																		// counttv 불러와서 출력 가능

		Product2.Smartphone smartphone = product2.newSmartphone();
		int totalSp = product2.makeSmartphone("S21", 100);
		totalSp = product2.saleSmartphone("S21", 17);
		System.out.printf("[S21] totalSp(%d), total(%d)\n", totalSp, smartphone.total());

		Product2.Smartphone ssp = product2.smartphone();
		int ssp_tot = product2.saleSmartphone("S21_2", 18);
		System.out.printf("[S21_2] totalSp(%d), total(%d)\n", ssp_tot, ssp.total());

	}

}
