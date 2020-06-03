package quiz20;

public class Circle extends Shape {

	private int radius;
	
	public Circle(int radius) {
		super("원");
		this.radius=radius;
	}

	public double getArea() {
		return Math.PI*radius*radius;
	}

	
	
	
	
}
