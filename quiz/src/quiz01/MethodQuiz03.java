package quiz01;

public class MethodQuiz03 {
//quiz18
	public static void main(String[] args) {
	
		String str = java(7);
		System.out.print(str);
		
	}
	
	static String java(int a) {
		String str = "";
		for(int i=1;i<=a;i++) {
			str = (i%2==1)? (str+="자") : (str+="바");
		}
		
		return str;
	}
	
	
	
}
