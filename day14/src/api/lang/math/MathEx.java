package api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		
		double d1 = Math.random();
		System.out.println(d1);
		
		double d2 = Math.ceil(1.1); //올림
		System.out.println(d2);
		
		double d3 = Math.floor(1.5); //내림
		System.out.println(d3);
		
		double d4 = Math.round(1.5); //반올림
		System.out.println(d4);
		
		int max = Math.max(11, 21); //큰 수
		System.out.println(max);
		
	}
}
