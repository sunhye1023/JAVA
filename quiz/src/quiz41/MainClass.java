package quiz41;

public class MainClass {
	
	public static void main(String[] args) {
		
		//2개의 객체, 스레드 2개 (독릭접으로 각각 실행)
		
		ThreadQuiz01 tq1 = new ThreadQuiz01();
		ThreadQuiz02 tq2 = new ThreadQuiz02();
		Thread t1 = new Thread(tq1);
		Thread t2 = new Thread(tq2);

		t1.start();
		t2.start();
	}
}
