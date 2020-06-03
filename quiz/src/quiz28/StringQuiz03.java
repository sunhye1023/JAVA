package quiz28;

import java.util.Arrays;
import java.util.Scanner;

public class StringQuiz03 {

	public static void main(String[] args) {

		/*
		 * 아이티뱅크 친구 네오는 palindrome()를 함수로 만들었습니다
		 * - 매개변수로 String값을 받아서 회문 여부를 검사하는 메서드입니다
		 * ex) 다시 합창합시다, 아 좋다 좋아, 다시다
		 * 
		 * 매개변수를 공백을 포함해서 받을 수 있습니다
		 * 회문이라면 return "회문입니다" 를 반환합니다
		 * 회문이 아니라면 "회문이 아닙니다" 를 반환합니다
		 */

//		StringQuiz03 p = new StringQuiz03();
//		p.palindrome("다시다시다");

		
		System.out.println(palindrome("아 좋다 좋아"));
		
		
	}

	
	public static String palindrome(String word) {
		word = word.replace(" ", "");
		StringBuffer sb = new StringBuffer(word);
		if(sb.reverse().toString().equals(word)) {
			return "회문입니다";
		}
		return "회문이 아닙니다";
	}
	
	
//	public boolean palindrome(String str) {
//		String str2 = str.trim();
//		String[] arr = str2.split("");
//		boolean b = true;
//		for(int i=0;i<(int)arr.length/2;i++) {
//			if(arr[i].equals(arr[arr.length-i-1])) {
//			
//			} else {
//				b = false;
//				break;
//			}
//			
//		}
//		if(b==true) {
//			System.out.println("회문입니다");
//		} else {			
//			System.out.println("회문이 아닙니다");
//		}
//		return b;	
//		
//	}
	

	
//	public static String palindrome(String word) {
//		word=word.replace(" ", "");
//		for(int i=0;i<word.length()/2;i++) {
////			System.out.println(word.charAt(i));
////			System.out.println(word.length()-i-1);
//			if(word.charAt(i)!=word.charAt(word.length()-i-1)) {
//				return "회문이 아닙니다";
//			}
//		}
//		return "회문입니다";
//	}
	

	
//	public static String palindrome(String word) {
//		word=word.replace(" ", "");
//		StringBuffer sb = new StringBuffer(word);
//		sb.reverse();
//		//String result = sb.toString();
//		//System.out.println(sb.reverse());
//		//System.out.println(result);
//		//StringBuffer sb = new StringBuffer(word);
//		if(sb.reverse().toString().equals(word)) {
//			return "회문입니다";
//		} else {
//			return "회문이 아닙니다";
//		}
//		
//	}
	
	
}
