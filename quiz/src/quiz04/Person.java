package quiz04;

public class Person {

	String name;
	int age;
	int tall;

	//기본생성자
	Person(){
		
	}
	
	Person(String pName, int pAge, int pTall) {
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키" + tall);
	}
	
	
}
