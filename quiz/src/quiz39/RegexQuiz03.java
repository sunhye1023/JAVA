package quiz39;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz03 {

	public static void main(String[] args) {
		

		String str1 = "﻿20180311-01-0079201803112 건담베이스 부천점 [RG] HACO ROOM 꼬마곰 재키 키트 1 15,500원";
		//String str1 = "20171213-01-002020171213 건담베이스 강남점 [벽걸이] 1/100 유니콘 건담 2호기 밴시 티타늄 피니쉬... 1 144,000원";
		//String str1 = "20180429-02-002420180429 건담베이스 고속터미널 [MG] 1/144 고기동형 자쿠II (가이아/맛슈 전용기... 1 24000원";
		String pattern1 = "\\d{8}-\\d{2}-\\d+";
		String pattern2 = "[가-힇]+\\s[가-힇]+";
		String pattern3 = "\\[[A-Z]+\\]|\\[[가-힇]+\\]";
		String pattern5 = "\\d+,*\\d+원";
		
		String[] arr = {str1};
		
		int i=0;
		while(i<arr.length) {
			System.out.println("=================================");
			Matcher m1 = Pattern.compile(pattern1).matcher(arr[i]);
			Matcher m2 = Pattern.compile(pattern2).matcher(arr[i]);
			Matcher m3 = Pattern.compile(pattern3).matcher(arr[i]);
			Matcher m5 = Pattern.compile(pattern5).matcher(arr[i]);
			
			if(m1.find()&&m2.find()&&m3.find()&&m5.find()) {
				System.out.println("날짜 : " + m1.group());
				System.out.println("지점 : " + m2.group());
				System.out.println("등급 : " + m3.group());
				System.out.println("상세 : " + str1.substring(m3.end()+1,m5.start()-1));
				System.out.println("가격 : " + m5.group());
				
				
			}
			i++;
		}
		
		
		
		
	}

}
