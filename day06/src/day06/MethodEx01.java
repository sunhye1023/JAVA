package day06;

public class MethodEx01 {

	public static void main(String[] args) {
		
		/*
		 * 메서드는 메서드 내부에 선언할 수 없습니다
		 * main밖에, 클래스 안 어디서든 선언할 수 있습니다
		 */
		
		//calSum(); Error(값은 있지만 출력은 되지 않는다) -> 출력문 안에 입력한다
		System.out.println("1~100까지 합 : " + calSum()); //sum이라는 결과를 calSum이 그대로 돌려받는다
		
		int result = calSum(); //실행결과 sum이 돌아온다 -> result 변수에 저장해준다
		System.out.println("1~100까지 합 : " + result );
		
		String result2 = randomStr(); //실행결과 randomStr에 str이 돌아온다
		System.out.println("결과 : " + result2);
		 
		String result3 = randomStr2();
		System.out.println("결과 : " + result3); //randomStr2()->Math.random()->str->randomStr2() ...
		
	} //메인 끝
	
	static int calSum() { //int타입, calSum이름,()매개변수  { } -> 사용할 때는 calSum()이름을 사용한다
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		return sum; //타입int에 맞게 설정해준다(sum->sum,0->0 이 돌아간다)
	}
	
	static String randomStr() {
		
		String str = "";
		for(char c = 'A'; c <='Z'; c++) {
			str += c;
		}
		
		return str; //문자열(String)에 맞춰준다
	}
	
	static String randomStr2() {
		double d = Math.random();
		
		String str = "";
		if(d > 0.66) {
			str = "가위";
			//return "가위";
		} else if(d > 0.33) {
			str = "바위";
			//return "바위";
		} else {
			str = "보";
			//return "보";
		}
		// if else if else 구문에서는 위처럼 return으로 값을 실행 할 수 있다
		
		return str;
	}
	
	

	
}
