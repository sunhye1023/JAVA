package static_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 1. 녹색, 빨강색 계산기를 각각 생성
		 * 2. 계산기 색상을 확인하세요
		 * 3. add(int a)메서드를 추가합니다
		 * 4. 계산기 result값도 각각 확인
		 * 5. pi와 circle() 사용해서 원의 넓이를 구하세요
		 */
		
		Calculator green = new Calculator();
		green.setColor("녹색");
		System.out.println(green.getColor());
		Calculator red = new Calculator();
		red.setColor("빨강");
		System.out.println(red.getColor());
		green.add(7);
		System.out.println(green.getResult());
		green.add(3);
		System.out.println(green.getResult());
		red.add(5);
		System.out.println(red.getResult());
		
		System.out.println(Calculator.pi*4*4);
		System.out.println(Calculator.circle(4));
		
		
	}
}
