package quiz01;

public class Quiz02 {
	//Quiz01
	public static void main(String[] args) {
		
		int i = (int)(Math.random() * 100) + 1;
		System.out.println("랜덤수는:" +i);
		
		String result = i % 2 == 0 ? "짝수": "홀수";
		System.out.println("3항 연산의 결과:" + result);
	}
	
}
