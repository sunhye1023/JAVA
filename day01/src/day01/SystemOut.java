package day01;
/**
 * 
 * @author KG ITBANK
 *
 */
public class SystemOut {

	public static void main(String[] args) {
		// main을 작성한 후, ctrl + space를 누르면 실행 함수가 자동 생성
		/*
		 * 코드실행 단축키 ctrl + f11
		 * 
		 * sysout을 작성한 후 ctrl + space를 누르면 println()메서드 자동 생성
		 * 
		 * 
		 * 정렬 : ctrl + a, ctrl + i
		 * 코드를 옮길 때 : alt + 방향키
		 * 동일한 이름을 바꿀 때  : alt + shift + r
		 * 
		 * 
		 */

		// 개행을 포함 println()
		System.out.println("안녕하세요"); // println은 마지막에 자동으로 줄바꿈을 해준다
		System.out.println("반가워요");

		// 개행이 없는 print()
		System.out.print("줄바꿈이 없음\n");

		// 형식지정 출력문 printf()
		/*
		 * \n 줄바꿈
		 * \t tab정렬
		 * %d 정수를 입력받는다
		 * %s 문자열을 입력받는다
		 * %f 실수값을 입력받는다
		 * 실수서식문자에서 %.xf형식으로 소수점의 자릿수를 표현한다
		 */

		System.out.printf("안녕하세요 제 이름은 %s이고 오늘날짜는 %d월 %d일 입니다\n", "홍길동", 3, 23); // %s -> 문자   %d -> 정수
		System.out.printf("파이 값은 %f\n", 3.14); // %f -> 실수(지정된 자릿수 까지 표시되어 나타난다) 
		System.out.printf("파이 값은 %.2f\n", 3.14); // 소수점 두 번째자리까지 표시되어 나타난다

		System.out.printf("%d*%d=%d \t%d*%d=%d\n", 2, 1, 2, 2, 2, 4 ); // \t -> 정렬을 나타내는 표기문자중 하나


	}
}
