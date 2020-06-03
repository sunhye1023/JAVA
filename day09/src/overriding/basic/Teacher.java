package overriding.basic;

public class Teacher extends Person { //sub클래스

	String subject;
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}

}
