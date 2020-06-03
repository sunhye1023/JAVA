package quiz22;

public class Child extends Teacher {

	public Child(int rice, int bulgogi, int yogurt, int iceCream, int milk) {
		super(rice, bulgogi, yogurt, iceCream, milk);
	}

	public int calculating1() {
		return rice + bulgogi + yogurt;
	}
	
	
	public int calculating2() {
		return rice + bulgogi;
	}
	
	public int calculating3() {
		return rice + bulgogi + milk + iceCream;
	}
	
	
}
