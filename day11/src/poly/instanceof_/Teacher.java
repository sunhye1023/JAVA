package poly.instanceof_;

public class Teacher extends Person { //sub클래스

	String subject;
	
	Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}
	
	String info() {
		return super.info() + ", 과목:" + subject;
		//부모클래스의 info()를 호출한다(오버라이딩)
	}

}
