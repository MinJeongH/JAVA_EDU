package Example_Question;

public class ShopService {
	private static ShopService service;

	private ShopService() {
	}

	public static ShopService getInstance() {
		return service;
	}
}
