package quiz10;

public class Computer extends Calculator {

	//Calculator의 기능이 생략
	
	double circle(int a) {
		return (int)((a*a*Math.PI)*100)/100.0;
	}
	
	//오버로딩
	double rect(double a) {
		return a*a;
	}
	
	double rect(double a, double b) {
		return a*b;
	}
	
	double rect(double a, double b, double c) {
		return (int)((2*(a*b+b*c+c*a))*100)/100.0;
	}
	
}
