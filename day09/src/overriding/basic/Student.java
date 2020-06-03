package overriding.basic;

public class Student extends Person { //sub클래스

	String studentId;
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
	
}
