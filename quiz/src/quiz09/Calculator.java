package quiz09;

public class Calculator {

	int result;
	//여기에 오버로딩
	
	void add(int a){
		result += a;
	}

	void add(int a, int b) {
		result += a + b;
	}	
	
	void add(int a, int b, int c) {
		result += a + b + c;
	}	
	
}
