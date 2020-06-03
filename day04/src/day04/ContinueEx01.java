package day04;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			
			if(i%2==0) {
				continue; //출력이 아닐 때(짝수일 때) 다음반복문(증감식)으로 돌아간다
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("---------------------------");
		
		int i=1;
		while(i<=10) {
			
			if(i%2==0) {
				i++;
				continue; //i++로 가는 것이 아니라 조건문으로 가기때문에 i값의 증감이 없다 -> 위에 i++생성
			}
			
			System.out.println(i);
			
			i++;
		}
		
		
//		int i=0;
//		while(i<=10) {
//
//			i++; //반복문이 익숙해졌을 때 사용하기
//			
//			if(i%2==0) {
//				continue;
//			}
//			
//			System.out.println(i);
//			
//		}
		
		
		
		
		
		
	}
}
