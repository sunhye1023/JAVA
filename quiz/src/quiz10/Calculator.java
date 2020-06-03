package quiz10;

public class Calculator {

	double result;
	double pi;
	
	double add(int a) {
		return result += a;
	}
	
	double sub(int a) {
		return result -= a;
	}
	
	double mulit(int a) {
		return result *= a;
	}
	
	double div(int a) {
		return result /= a;
	}
	
	double circle(int a) {
		pi=3.14;
		return result += (int)((a*a*pi)*100)/100.0;
	}
	
}
