package quiz09;

public class CalculatorMainClass {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(1);
		System.out.println("cal의 누적값:" + cal.result);
		cal.add(2,3);
		System.out.println("cal의 누적값:" + cal.result);
		cal.add(1,2,3);
		System.out.println("cal의 누적값:" + cal.result);
	}
}
