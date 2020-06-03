package final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("325143", "박대한");
//		p1.nation = "미국";
//		p1.ssn = "346324";
//		p1.name = "박대환";
		
		System.out.println("국가: " + p1.nation);
		System.out.println("주민번호: " + p1.ssn);
		System.out.println("이름: " + p1.name);
		
		Person p2 = new Person("678923", "박민국");
		
		
	}
}
