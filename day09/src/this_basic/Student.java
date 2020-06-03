package this_basic;

public class Student extends Person { //sub클래스

	String studentId;
	
	//this키워드를 이용해서 name, age, studentId를 초기화하는 생성자
	Student(String name, int age, String studentId){
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
	
}
