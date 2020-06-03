package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class MethodQuiz02 {
//quiz17
	public static void main(String[] args) {
		
		method1();
		
		method2("메서드연습");
		System.out.println(method2("메서드연습"));
		
		double result = add(1,3,5);
		System.out.println(result);
		
		String str = method4(6);
		System.out.println(str);
		
		method5("a",5);
		
		int a = maxNum(7,5);
		System.out.println(a);
		
		int b = abs(-9);
		System.out.println(b);
		
		System.out.println(method6(10));
		
		int arr[] = {1,3,5,7,9};
		System.out.println(method7(arr));
		
		String arr1[] = method8("하이","바이");
		System.out.println(Arrays.toString(arr1));
		
	} //메인 끝
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String s) {
		String str = "메서드연습";
		return s;
	}
	
	static double add(int a, int b, double c) {
		double result = a+b+c;
		return result;
	}
	
	static String method4(int num) {
		if(num%2==0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	
	static void method5(String a, int b) {
		for(int i=0; i<b;i++) {
			System.out.print(a);
		}
		System.out.println();
	}
	
	static int maxNum(int a, int b) {
		//return a>b ? a : b;
		if(a>b) {
			return a;
		} else 
			return b;
		
	}
	
	static int abs(int a) {
		if(a<0) {
			a *= (-1);
		}
		return a;
	}
	
	static int method6(int a) {
		int sum = 0;
		for(int i=0;i<=a;i++) {
			sum += i;
		}
		return sum;
	}
	
	static int method7(int[] arr) {
		return arr.length;
	}
	
	static String[] method8(String a, String b) {
//		String[] arr = {a,b};
//		return arr;
		
		String[] arr = new String[2];
		arr[0] = a;
		arr[1] = b;
		return arr;
	}
}
