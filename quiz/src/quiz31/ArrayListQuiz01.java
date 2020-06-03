package quiz31;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuiz01 {

	public static void main(String[] args) {
		
		//list에 1~20까지 정수를 저장
		
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=20;i++) {
			list.add(i);
		}

		//저장한 값을 반복문으로 출력
		for(int j=0;j<list.size();j++) {
			System.out.print(list.get(j) + " ");
		}
		
	
	}
}
