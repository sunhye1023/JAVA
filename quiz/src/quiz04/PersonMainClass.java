package quiz04;

public class PersonMainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 40, 170);
		p1.info();

		System.out.println("-------");

		Person p2 = new Person();
		p2.name = "김길동";
		p2.age = 20;
		p2.tall = 180;
		p2.info();
		
		
		
		
	}
	
}
