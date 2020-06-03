package day01;

public class IdentifierEx {

	public static void main(String[] args) {
		
		int age = 27; // =을 기준으로 우측데이터를 해석한 후, 최종적인 결과를 좌측데이터에 대입한다
		int Age = 28;
		
		System.out.println(age);
		System.out.println(Age);
		
		int phonenumber = 4; // X
		int phoneNumber = 10; // 좋은 방식
//		int phone number = 20;	// ctrl + / -> 빠른 주석
		
		// 키워드로는 이름을 지을 수 없다
//		int public = 3;
//		int class = 4;
		
		
	}
	
}
