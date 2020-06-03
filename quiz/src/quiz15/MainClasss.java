package quiz15;

import java.util.Arrays;
import java.util.Scanner;

public class MainClasss {

	public static void main(String[] args) {
		
	System.out.println("----------문제1----------");
	/* 문제1
	 * 1. 클래스 Users를 생성하세요
	 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
	 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
	 * 4. main에서 Users객체를  생성 후  
	 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
	 */
	
	Users u1 = new Users();
	u1.setName("홍길동");
	u1.setRrn(123123);
	u1.setAge(20);
	System.out.println("이름:" + u1.getName() + ", 번호:" + u1.getRrn() + ", 나이:" + u1.getAge());
	
	System.out.println("----------문제2----------");
	/* 문제2
	 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
	 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
	 * 3. User배열에 두 객체를 저장하세요.
		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
		 * ex) Users[] arr = new Users[2];
	 */
	
	Users[] arr = new Users[2];
	Users u2 = new Users("김길동", 456456, 30);
	arr[0]=u1;
	arr[1]=u2;
	for(Users u : arr) {
		System.out.println("이름:" + u.getName()+ ", 번호:" + u.getRrn()+ ", 나이:" + u.getAge());
	}

	System.out.println("----------문제3----------");
	/* 문제 3
	 * 1. 5개의 크기를 갖는 Users배열을 선언하세요.
	 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
	 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
	 * 4. while문 안에서 User객체를 User배열에 저장하세요.
	 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
	 */
	
	Scanner sc = new Scanner(System.in);
	
	Users[] arr1 = new Users[5];
	
	int i=0;
	while(i<arr1.length) {
		System.out.print("이름");
		String name = sc.next();
		System.out.print("번호");
		int rrn = sc.nextInt();
		System.out.print("나이");
		int age = sc.nextInt();
		
		Users u3 = new Users(name, rrn, age);
		u3.setName(name);
		u3.setRrn(rrn);
		u3.setAge(age);
		
		arr1[i]=u3;
		
		System.out.println(Arrays.toString(arr1));
		
	}
	
	
	}
}
