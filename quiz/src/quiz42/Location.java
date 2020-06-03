package quiz42;

import java.util.Random;

public class Location extends Thread {

	int end = 100; //개표끝
	int sum = 0; //개표율
	Random r = new Random();
	StringBuilder sb = new StringBuilder();

	public void run() {
		 
		while(true) {

			int num = r.nextInt(10)+1;
			sum+=num;

			if(end>sum) { //개표율이 100미만
				for(int i=1;i<=sum;i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName()+"개표율" + sum + "% : " + sb);
				
			} else { //개표율이 100이상
				sum=100;
				sb.delete(0, sum);
				
				for(int i=1;i<=sum;i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName()+"개표율" + sum + "% : " + sb);
				break;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(Thread.currentThread().getName()+"의 개표가 완료되었습니다");
	}
}


