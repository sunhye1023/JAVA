package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		
		//charAt - 문자열 인덱스번호 자르기
		String str = "안녕하세요~";
		
		char a = str.charAt(0);
		System.out.println(a);
		
		//indexOf - 문자열을 찾아서 인덱스를 반환
		int i = str.indexOf("~");
		System.out.println(i);
		
		//length
		System.out.println("문자열길이:" + str.length());
		
		//replace - 특정문자열의 변경
		String str2 = "자바는 재미있습니다. 자바는 커피집 이름입니다";
		String result = str2.replace("자바", "JAVA");
		
		//공백제거
		result = result.replace(" ", "");		
		System.out.println(result);
		
		//substring - 문자열 자르기
		String str3 = "123123-4564564";
		
		String result3 = str3.substring(7); //매개값을 한개만 주면 앞문자열의 제거
		System.out.println(result3);
		
		String result4 = str3.substring(8, str3.length()); //매개값을 2개주면 문자열을 추출
		System.out.println(result4);
		
		//trim - 앞뒤 공백 제거
		String str4 = "    홍길동 ";
		str4  = str4.trim();
		System.out.println(str4);
		
		//valueOf - 기본형을 문자열로 변경
		System.out.println(String.valueOf(3) + String.valueOf(4));
		
		//split - 문자열 자르기
		String str5 = "010-6591-7832-3245-8973";
		String[] arr = str5.split("-");
		System.out.println(Arrays.toString(arr));
		String[] arr3 = str5.split("");
		System.out.println(Arrays.toString(arr3));
		
		String[] arr2 = str5.split("-", 3);
		System.out.println(Arrays.toString(arr2));
		
		
		
	}
}
