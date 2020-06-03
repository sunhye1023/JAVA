package quiz27;

import java.util.Scanner;

public class Calculator {

	/*
	 * 1. 정수 2개를 받습니다
	 * 2. 입력된 값이 정수라면 합계를 반환해주면 됩니다
	 * 3. 예외가 발생할 수 있는 상황이라면 메서드를 종료하고 예외 메시지를 전달해주면 됩니다
	 * 4. scan.close()를 적절하게 처리해주세요
	 */


	public int input() throws Exception {
		
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("정수입력> ");
			int a = scan.nextInt();
			System.out.print("정수입력> ");
			int b = scan.nextInt();
			int sum = a + b;
			return sum;
			
		} catch (Exception e) {
			throw new Exception("숫자 값을 입력해주세요");
		
		} finally {
			scan.close();
		}

	}

}



