package quiz01;

public class Quiz12 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "니하오", "#$%"};
		
		/*
		 * Math.random()을 이용해서 0~3랜덤수를 발생시킵니다
		 * 해당 랜덤수를 배열의 index에 적용
		 * 선택된 단어가 한국어,영어,중국어 인지 처리해주세요
		 */
		
		int num = (int)(Math.random() * arr.length);

		System.out.println("랜덤수:" + num);
		
		switch(num) {
		case 0:
			System.out.println("안녕");
			break;
		case 1:
			System.out.println("hello");
			break;
		case 2:
			System.out.println("니하오");
			break;
		case 3:
			System.out.println("#$%");
			break;
		}
		
	}
}
