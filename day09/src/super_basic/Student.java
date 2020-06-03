package super_basic;

public class Student extends Person { //sub클래스

	String studentId;

	Student(String name, int age, String studentId){
		super(name, age); //생략
		this.studentId = studentId;
	}

	String info() {
		return super.info() + ", 학번:" + studentId;
	}

}
