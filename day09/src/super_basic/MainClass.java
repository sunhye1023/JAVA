package super_basic;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 20, "123");
		
		System.out.println(s.info());
		
		
		Teacher t = new Teacher("홍길자", 43, "수학");
		
		System.out.println(t.info());
	}
}
