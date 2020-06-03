package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSeat {

	public static void main(String[] args) {

		/*
		 * 1. 사람수를 입력받을 수 있습니다
		 * 2. 입력받은 사람 수 만큼 랜덤값을 생성해서 배열에 중복되지 않게 랜덤으로 저장합니다
		 * 
		 * 3. 해당배열의 크기만큼 ○으로 출력해주세요
		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다
		 * 5. 제대로 선택된 좌석이라면 자리번호를 공개하고, 제대로 선택되지 않은 좌석이면 "경고문을 띄어주세요"
		 * 
		 * 선택된 자리는 ●로 다시 표시해주세요
		 */
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("사람 수를 입력하세요 > ");
//		int person = sc.nextInt();
//
//		int[] seat = new int[person];
//
//		for(int i=0;i<seat.length;i++) {
//			seat[i] += i+1;
//		}
//		int num = 0;
//		int temp = 0;
//		for(int j=0;j<seat.length;j++) {
//			num = (int)(Math.random()*person);
//			temp = seat[num]; 
//			seat[num]=seat[j];
//			seat[j]=temp;
//
//		}
//
//		System.out.println(Arrays.toString(seat));
//
//		String[] str = new String[person];
//		for(int i=0;i<seat.length;i++) {
//			str[i]=i+"○";
//			System.out.print(str[i] + " ");
//		}
//		System.out.println();
//		System.out.print("번호를 선택해주세요 > ");
//		int select = sc.nextInt();
//		String[] strr = new String[person];
//		for(int i=0;i<seat.length;i++) {
//			strr[i]=str[i];
//			strr[select]=i+"● ";
//			System.out.println(strr[i]);
//
//
	}
}
