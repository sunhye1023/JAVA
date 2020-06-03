package quiz01;

public class MethodQuiz05 {
//quiz20
	public static void main(String[] args) {

		System.out.println("소수의 개수 : " + primeNum(10));
		
	}
	
	static int primeNum(int a) {
		int prime = 0;
		for(int i=1;i<=a;i++) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0)
					count++;
				if(count>2) break;
			}
			
			if(count==2)
				prime++;
		}
		
		return prime;
	}
	
}