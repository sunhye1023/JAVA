package api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		String name = p1.getName();
		
		System.out.println(p1.toString());
		
		Person p2 = new Person("홍길동");
		
		System.out.println(p1.equals(p2));
		
		p1 = null;
		p2 = null;
		System.gc();
		
		
	}
}
