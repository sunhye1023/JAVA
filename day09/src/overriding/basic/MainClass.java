package overriding.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "홍길동";
		s.age = 20;
		s.studentId = "190430";
		System.out.println(s.info());
	
		Teacher t = new Teacher();
		t.name = "홍길자";
		t.age = 37;
		t.subject = "수학";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.name = "이순신";
		e.age = 53;
		e.department = "회계부";
		System.out.println(e.info());
		
	}
}
