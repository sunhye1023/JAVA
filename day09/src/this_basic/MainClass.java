package this_basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길자", 20);
		Person p2 = new Person("홍길동");
		Person p3 = new Person();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		Employee e = new Employee("홍길순", 20, "회계");
		System.out.println(e.info());
		
		
		
		
		
		
		
//		System.out.println(p1.info());
//		System.out.println(p2.info());
//		System.out.println(p3.info());
		
		
		
		
	}
}
