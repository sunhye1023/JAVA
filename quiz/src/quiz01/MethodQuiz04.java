package quiz01;

public class MethodQuiz04 {
//quiz19
	public static void main(String[] args) {
		
		System.out.println(method(5));
	}
	
	static int method(int a) {
		int sum = 0;
		for(int i=1;i<=a;i++) {
			if(a%i==0)
				sum+=i;
		}
		return sum;
	}
	
}
