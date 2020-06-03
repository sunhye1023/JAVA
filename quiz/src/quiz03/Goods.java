package quiz03;

public class Goods {

	String name;
	int price;
	String color;
	
	void name() {
		System.out.println(name + "제품");
	}

	void color() {
		System.out.println(color + "색상");
	}
	
	void price() {
		System.out.println(price + "가격");
	}
	
	void info() {
		System.out.println("=====제품 정보=====");
		System.out.println("제품명 : " + name);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price + "만원");
	}
	
}
