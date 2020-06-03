package api.util.arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		//배열의 정렬
		Arrays.sort(arr);
		
		//배열의 검색(선행조건:오름차순 정렬)
		int index1 = Arrays.binarySearch(arr, 3);
		System.out.println("5가 있는 위치 : " + index1);
		
		int index2 = Arrays.binarySearch(arr, 11);
		System.out.println(index2); //찾는 값이 없다면 쓰레기 값을 돌려줍니다
		
		//배열복사
		int[] copyArr1 = Arrays.copyOf(arr, arr.length);
		int[] copyArr2 = Arrays.copyOf(arr, 5);
		
		//배열문자열로 확인
		System.out.println(Arrays.toString(copyArr1));
		System.out.println(Arrays.toString(copyArr2));
		
		int[] copyArr3 = Arrays.copyOfRange(arr, 5, arr.length);
		System.out.println(Arrays.toString(copyArr3));
		
		//배열의 내부요소가 동일한지  확인
		if(Arrays.equals(arr, copyArr1)) {
			System.out.println("배열 요소가 같다");
		} else {
			System.out.println("다르다");
		}
		
		
	}
}