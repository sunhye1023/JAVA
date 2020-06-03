package quiz01;

import java.util.Arrays;

public class MethodQuiz07 {

	public static void main(String[] args) {

		/*
		 * 1. 크기가 6인 배열에 1~45까지 중복되지 않는 랜덤수를 출력해서
		 * 반환하는 lottoNum() 메서드를 생성하세요
		 * 
		 * 2. lottoRun() 메서드는 1번에서 생성된 로또 번호를 매개변수로 받아서,
		 * 당첨되기까지 금액을 구하는 메서드입니다
		 * 
		 * 랜덤한 로또번호를 무한히 생성해서, 매개변수로 전달받은 번호와 비교해서
		 * 당첨되기까지 사용한 금액을 반환하세요
		 * 
		 * 당첨의 조건(순서는 상관없이 같은 번호만 배열에 담겨있으면 됩니다)
		 * 
		 */

		int[] arr = lottoNum();
		System.out.println(Arrays.toString(arr));
		long money = lottoRun(arr);
		System.out.println("당첨되기까지 사용한 금액 : " + money);

	}

	static int[] lottoNum() {
		int[] arr = new int[45];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		for(int i=0;i<arr.length;i++) {
			int j = (int)(Math.random()*45);
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		int[] arr1 = new int[6];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=arr[i];
		}
		return arr1;
	}

	static long lottoRun(int[] arr){

		long count = 0;
		Arrays.sort(arr);

		while(true) {

			int[] arr2 = lottoNum();
			Arrays.sort(arr2);

			System.out.println(count++);
			
			if(Arrays.equals(arr, arr2)) { //동일한 값을 가지고 있으면 true반환
				return count*1000;
			} else {
				count++;
			}
		}
	}

}
