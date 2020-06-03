package quiz33;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. Random객체를 이용해서 1~45까지 랜덤수를 생성
		 * 2. Set을 이용해서 6개의 랜덤수를 만들어내는 코드를 작성
		 */
		
		Set<Integer> set = new HashSet<>();
		Random ran = new Random();
		
		while(true) {
			
			int random = ran.nextInt(45)+1;
			set.add(random);
			
			if(set.size()==6) break;
		}
		
		System.out.println(set.toString());
		
		
//		for(int i=1;set.size()<6;i++) {
//			int random = (int)(Math.random()*45) + 1;
//			set.add(random);
//		}
//		System.out.println(set.toString());
		
		
	}
}
