package day06;

public class MethodEx03 {

	public static void main(String[] args) {
		
		/*
		 * 반환유형(return type)
		 * 1. 반환유형은 메서드가 실행한 결과를 동려주는 값에 대한 type입니다
		 * 2. 반환유형이 있는 메서드는 호출구문이 하나의 값이 되기 때문에 다른 메서드의 매개값으로도 사용됩니다
		 *    ex) println( 메서드호출 )
		 *    
		 * 3. 반환값이 없는 경우는 반환유형 자리에 void라고 적습니다
		 * 4. 모든 메서드를 return을 만나면 강제 종료 됩니다
		 *    그렇기 때문에 return아래에 코드를 작성할 수 없습니다
		 */
		
		int result = add(add(1, 2), add(2, 3));
		//돌아오는 값이 정수이기 때문에 add(add(1,2), 5 )형식으로 사용할 수 있다 ()안에서 부터 해석한다 -> 1,2를 실행한 후, 3을 받는다 그리고 3, 5를 실행하면 8을 받는다
		System.out.println("결과 : " + result);
		
		System.out.println(add(1, 2));
		
		//void형 메서드는 return값이 없기 때문에 단순히 호출만 가능하다
		//System.out.println(sub(5, 2));
		//int result2 = sub(3, 1);
		sub(5,2);
		multi();
		
		noReturn("똑똑이");
		
	} //메인 끝
	
	static int add(int a, int b) {
		return a+b;
	}
	
	//반환유형이 없는 메서드
	static void sub(int a, int b) { //return이라는 돌아오는 값이 없기 때문에 호출만 할 수 있다(실행만 해준다)
		System.out.println(a + "-" + b + "=" + (a-b));
	}
	
	//반환유형이 없고, 매개변수도 없는 메서드
	static void multi() {
		System.out.println("5 x 3 = 15");
		return; //호출만은 가능하다
	}
	
	static void noReturn(String s) {
		
		if(s.equals("똑똑이")) {
			System.out.println("똑똑한 사람");
			return; //종료
		}
		
		System.out.println(s + "문자열이 아니고 똑똑이를 입력하세요");
		
	}
	
	
}
