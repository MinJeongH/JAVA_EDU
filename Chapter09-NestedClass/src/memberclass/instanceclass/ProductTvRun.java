package memberclass.instanceclass;

public class ProductTvRun {

	public static void main(String[] args) {
		Product product = new Product("가전");

		Product.Tv tv = product.new Tv(Product.Tv.PRODUCT_TV_CNT);
		tv.sale(3);

		Product.Smartphone smartphone = product.new Smartphone();
		smartphone.sale(80);

	}

}
