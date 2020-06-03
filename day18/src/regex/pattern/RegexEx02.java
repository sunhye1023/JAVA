package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {

		/*
		 * \\w : 영문자 숫자 
		 * \\w+ : 영문자 숫자 여러개
		 * 
		 * \\d : 숫자
		 * \\d+ : 숫자 여러개
		 * 
		 * \\d{3} : 숫자 3개
		 * \\d{3,4} : 숫자 3개 or 4개
		 * 
		 * [0-9] 0-9사이 문자 1개
		 * [A-Z] A-Z사이 문자 1개
		 * [a-z] a-z사이 문자 1개
		 * [가-힣] 한글 1개
		 * [가-힣]+ 한글 여러개 
		 */

		String info = "30세/서울시 강남구/02-123-4567/010-2345-6789/kkk@naver.com";

		//전화번호 형식
		String pattern1 = "\\d{2,3}-\\d{3,4}-\\d{4}";

		Pattern p1 = Pattern.compile(pattern1);
		Matcher m1 = p1.matcher(info);

		while(m1.find()) { //info문자열에서 정규표현 패턴을 찾아서 true,false로 반환
			System.out.println("찾은 인덱스 : " + m1.start()); //찾은 인덱스
			System.out.println("끝 인덱스 : " + m1.end()); //끝 인덱스
			System.out.println("찾은 값 : " + m1.group()); //찾은 값
			
			
		System.out.println("---------------------------------------------");
		
		//이메일 형식
		String pattern2 = "\\w+@\\w+.\\w+";
		
		Matcher m2 = Pattern.compile(pattern2).matcher(info);
			
		while(m2.find()) {
			System.out.println("찾은 인덱스 : " +m2.start());
			System.out.println("끝 인덱스 : " +m2.end());
			System.out.println("찾은 값 : " +m2.group());
		}
		
			
		}
	}
}
