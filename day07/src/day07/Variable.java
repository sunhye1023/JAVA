package day07;

public class Variable {

	//멤버변수 : 초기화하지 않으면 자동으로 초기화
	int a;
	//int a; 값을 바꾸는 작업을 할 수 없다
	//a=10;  메인안에서 해줘야한다
	
	//메서드 선언
	void printNumber(int c) {
		
		int b = 1; //int b;->지역변수는 사용할 수 없다
		System.out.println("멤버변수 : " + a);
		System.out.println("지역변수 : " + b);
		System.out.println("매개변수 : " + c);
		
	}
	
	
	
}
