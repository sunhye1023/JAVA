package generic.basic03;

public class MainClass {

	public static void main(String[] args) {
		
	Course<Student> course = new Course<>();
	
	course.setNum("1");
	course.setStudent(new Student("홍길동", 20));
	
	
	//사용
	ITBank itbank = new ITBank();
	itbank.info(course);
	
	Course<Student> s = itbank.get();
	Student t = s.getStudent();
	System.out.println(itbank.get().getStudent().getAge());
	System.out.println(itbank.get().getStudent().getName());
	System.out.println(itbank.get().getNum());
	System.out.println(itbank.get());
	
	
	}
	
}
