package overriding.basic;

public class Employee extends Person { //sub클래스

	String department;
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
	
}
