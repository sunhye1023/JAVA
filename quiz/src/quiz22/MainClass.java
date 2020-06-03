package quiz22;

public class MainClass {

	public static void main(String[] args) {
		
		Teacher c1 = new Child(Price.RICE, Price.BULGOGI, Price.YOGURT, Price.ICECREAM, Price.MILK);
		
		System.out.println(c1.calculating1());
		System.out.println(c1.calculating2());
		System.out.println(c1.calculating3());
		
		
	}
}
