package quiz41;

public class ThreadQuiz01 implements Runnable {
	
	public void run() {
		
		System.out.println("음악을 15초간 재생합니다");
		
		for(int i=1;i<=15;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("음악이 종료되었습니다");
	}

}
