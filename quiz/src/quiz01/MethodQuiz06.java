package quiz01;

public class MethodQuiz06 {

	public static void main(String[] args) {

		System.out.println("7~9의 사이의 수의 합 : " + sumNum(7, 9));
		System.out.println("9~7의 사이의 수의 합 : " + sumNum(9, 7));
		System.out.println("5~5의 사이의 수의 합 : " + sumNum(5, 5));
	}	
	
	static int sumNum(int a, int b) {
		if(a>b) {
			int sum = 0;
			for(int i=b;i<=a;i++) {
				sum += i;
			} 
			return sum;
		} else if(a<b) {
			int sum = 0;
			for(int i=a;i<=b;i++) {
				sum += i;
			}
			return sum;
		} else {
			return a;
		}
	}

}
