package poly.basic3;

public class Person { //super클래스

	String name;
	int age;
	
	//생성자
	Person(String name, int age){
		this.name = name;
		this.age = age;
		//System.out.println(this.info()); 학번을 출력하기 전에 한번 저장이 되기때문에 작성하지 않아도된다 
	}
	
	
	Person(String name){
		this(name, 1);
	}

	
//	Person(){
//		this("이름x", 1);
//	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
	
}
