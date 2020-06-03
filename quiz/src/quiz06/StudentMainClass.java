package quiz06;

public class StudentMainClass {

	public static void main(String[] args) {
		
		Student stu1 = new Student("홍길동", 1, 95, 78, 87);
		stu1.info();
		System.out.println("합계:" + stu1.getTotal());
		System.out.println(stu1.getAvg());
		
		Student stu2 = new Student("홍길자", 2, 34, 98,65);
		stu2.info();
		System.out.println("합계:" + stu2.getTotal());
		System.out.println("평균:" + stu2.getAvg());
		
	}
}
