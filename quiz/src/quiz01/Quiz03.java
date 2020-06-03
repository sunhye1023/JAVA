package quiz01;

public class Quiz03 {
	//Quiz02
	public static void main(String[] args) {
		
		int n = (int)(Math.random() * 11 ) -5;
		System.out.println("랜덤값:" + n);
		
		int m = n *= (-1);
		System.out.println("절대값은:" + m);
		
	}
}
