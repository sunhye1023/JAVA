package quiz03;

public class MainClass {

	public static void main(String[] args) {
		//현실에 찾아볼 수 있는 물건, 생각해서 클래스로 표현 2개 이상
		//멤버변수 2개이상, 메서드 3개이상
		//생성해서 사용
		
		Goods g1 = new Goods();
		g1.name = "노트북1";
		g1.color = "그레이";
		g1.price = 170;
		g1.info();
		g1.name();
		g1.color();
		g1.price();
		
		
	}
	
}
