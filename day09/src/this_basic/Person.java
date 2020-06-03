package this_basic;

public class Person { //super클래스

	String name;
	int age;
	
	//생성자
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
//	Person(String name){
//		this.name = name;
//		this.age = 1;
//		System.out.println(this);
//	}
	
	Person(String name){
		this(name, 1);
	}
	
//	Person(){
//		this.name = "이름x";
//		this.age = 1;
//		System.out.println(this);
//	}
	
	Person(){
		this("이름x", 1);
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
	
}
