package quiz01;

import java.util.Arrays;

public class Quiz31 {

	public static void main(String[] args) {
		
		//for문을 이용해서 오름차순 정렬
		
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
		
		
//		for(int i=0;i<=arr.length;i++) {
//			for(int j=1;j<arr.length;j++) {
//				if(arr[j]<arr[i]) {
//				int temp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = temp;
//				}
//			}
//		}
		
		Arrays.sort(arr); //오름차순정렬
		
		System.out.println(Arrays.toString(arr));
	}
}
