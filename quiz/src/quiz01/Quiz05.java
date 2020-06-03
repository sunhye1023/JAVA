package quiz01;

public class Quiz05 {

	public static void main(String[] args) {
		
		//-5~5까지 랜덤값을 만들고 0이라면 0출력 양수라면 양수, 음수라면 음수 출력
		
		int r = (int)(Math.random() * 11) -5;
		System.out.println("랜덤값:" + r);
		
		String result = r == 0 ? "0출력" : r > 0  ? "양수" : "음수";
		System.out.println(result);
		
	}
}
