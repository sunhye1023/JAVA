package this_basic;

public class Teacher extends Person { //sub클래스

	String subject;
	
	Teacher(String name, int age, String subject){
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}

}
