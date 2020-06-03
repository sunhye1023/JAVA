package quiz22;

public abstract class Teacher {
	
	public int rice;
	public int bulgogi;
	public int yogurt;
	public int iceCream;
	public int milk;
	
	
	
	public Teacher(int rice, int bulgogi, int yogurt, int iceCream, int milk) {
		super();
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.yogurt = yogurt;
		this.iceCream = iceCream;
		this.milk = milk;
	}
	
	public abstract int calculating1();
	public abstract int calculating2();
	public abstract int calculating3();
	
}
