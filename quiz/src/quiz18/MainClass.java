package quiz18;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart cart = new MyCart(5000);

		Product pro3 = new Product(600, "computer");
		cart.buy(pro3);

	}
	
}
