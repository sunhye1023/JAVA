package exception.throws_;

public class ThrowsEx02MainClass {

	public static void main(String[] args) {
		
		try {
			ThrowsEx02 ex = new ThrowsEx02();			
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다");
		}
		
		
	}
}
