package quiz20;

public class MainClass {

	public static void main(String[] args) {
		
		Shape r = new Rect(7);
		System.out.println(r.getName());
		System.out.println(r.getArea());
		
		Shape c = new Circle(3);
		System.out.println(c.getName());
		System.out.println(c.getArea());
		
	}
}
