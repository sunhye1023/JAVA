package poly.basic3;

public class Mother extends Person{
	
	//생략
	Mother(){
		super("홍길동", 35); //부모클래스에 기본생성자가 없으면 Error -> 강제연결
	}

}
