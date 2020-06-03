package modi.constructor.pac1;

public class A {

	//멤버변수
	A a1 = new A(1);
	A a2 = new A(true);
	A a3 = new A("hi");
	
	//생성자
	public A(int i) {}
	A(boolean b) {}
	private A(String s) {}
	
	//같은 클래스안에서는 전부 다 사용할 수 있습니다
	
}
