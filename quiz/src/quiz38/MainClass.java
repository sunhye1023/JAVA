package quiz38;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class MainClass {

	private static int sum;

	public static void main(String[] args) {

		/*
		 * 1. BufferedReader를 통해서 파일을 읽어드립니다
		 * 2. 수출입 구분의 "수출" 항목의 품명 "오징"가 포함되어있는 데이터만 구분해서 list<Data>에 처리합니다
		 * 3. 이 데이터의 수출입미화금액 총합계를 구하세요
		 * 
		 * - if( data.indexOf("오징어") != -1 )
		 */

		InputStreamReader isr = null;
		FileInputStream fis = null;
		BufferedReader br = null;

		List<Data> list = new ArrayList<>();

		try {
			br = new BufferedReader((new InputStreamReader(new FileInputStream("D:\\course\\java\\해양수산부_수산물 품목별 수출입 현황 - 2020년 02월(월간).csv"),"EUC-KR")));

			String str;
			while((str=br.readLine())!=null) {
				String[] arr = str.split(",", 10);
				//String[] arr = str.replace("'","").split(",", 10);
				String date = arr[0];
				String hskName = arr[1];
				String code = arr[2];
				String fishName = arr[3];
				String exim = arr[4].replace("'","");
				String count = arr[5];
				String money = arr[6].replace("'", "");
				String result = arr[7];
				String price = arr[8];
				String day = arr[9];


				Data data = new Data(date, hskName, code, fishName, exim, count, money, result, price, day);
				list.add(data);
			}



		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
//		int sum = list.stream().filter((data)->{
//			return data.getExim().equals("수출");
//		}).filter((data)->{
//			return (data.getFishName().indexOf("오징어") != -1);
//		}).mapToInt((data)->{
//			return Integer.parseInt(data.getMoney());
//		}).sum();
		

		List<Data> newList = list.stream().filter((data)->{
			return data.getExim().equals("수출");
		}).filter((data)->{
			return (data.getFishName().indexOf("오징어") != -1);
		}).collect(Collectors.toList());

		newList.forEach((data)->{
			sum+=Integer.parseInt(data.getMoney());

		}); 
		
//		for(Data d : newList) {
//			System.out.println(d.toString());
//		}
		
		System.out.println("list의 길이 : "+list.size());
		System.out.println("새로운 list의 길이 : "+newList.size());
		System.out.println("newList수출입미화금액 총합계 : "+sum);
		
	}


}

