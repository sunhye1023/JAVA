package quiz28;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. 주민번호 13자리를 입력받습니다
		 * 2. 주민번호는 -를 포함해서 받을 수 있습니다
		 * 3. 13자리가 아니라면 다시 입력받습니다
		 * 4. 남자인지 여자인지 구분해서 출력해주세요
		 */

		Scanner scan = new Scanner(System.in);

		a : while(true) {
			System.out.print("주민번호를 입력하세요> ");
			String ssn = scan.nextLine();
			ssn=ssn.replace("-", "");
			if(ssn.length()!=13) {
				System.out.println("다시 입력해주세요");
				continue a;
			} else {

				switch(ssn.charAt(6)) {
				case '1':
				case '3':
					System.out.println("남자");
					break;
				case '2':
				case '4':
					System.out.println("여자");
					break;
				default:
					System.out.println("주민번호가 잘못입력되었습니다");
					continue a;
				}

			}


		}




	}


}
