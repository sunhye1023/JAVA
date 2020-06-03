package this_basic;

public class Employee extends Person { //sub클래스

	String department;
	
	Employee(String name, int age, String department){
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
	
}
