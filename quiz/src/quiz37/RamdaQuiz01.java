package quiz37;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RamdaQuiz01 {

	public static void main(String[] args) {

		/*
		 * 1. BufferedReader를 사용해서 읽어들이세요
		 * 2. , 기준으로 잘라서 Data클래스에 한 줄 단위로 저장합니다
		 * 3. list<Data>에 추가합니다
		 * 4. 람다식을 이용해서, 지역:서울, 짝수:월의 분양가격 4000이상의 객체만 뽑아서 새로운 list생성
		 */

		BufferedReader br = null;

		List<Data> list = new ArrayList<>();

		try {

			br = new BufferedReader((new InputStreamReader(new FileInputStream("D:\\course\\java\\주택도시보증공사_전국 평균 분양가격(2020년 2월).csv"), "EUC-KR")));

			String str;
			while((str=br.readLine())!=null) {
				String[] arr = str.split(",", 5);

				String region = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];

				arr[4] = arr[4].replace(",", "").replace(" ", "").replace("-", ""); // , 공백, - 제거
				
				String price;
				if(arr[4].equals("")) { //없는 값이라면 0을 저장
					price = "0";
				} else {
					price = arr[4]; //그대로 저장
				}
				
				Data data = new Data(region, size, year, month, price);
				list.add(data); 
				
			}

			List<Data> newList = list.stream().filter((data)->{
				return data.getRegion().equals("부산");
			}).filter((data)->{
				return Integer.parseInt(data.getMonth())%2==0;
			}).filter((data)->{
				return Integer.parseInt(data.getPrice())>=3000;
			}).collect(Collectors.toList()); //새로운 리스트로 생성
			
			newList.forEach((data)->{
				System.out.println(data.toString());
			});
			
			System.out.println("--------------------");
			
			for(Data d : newList) {
				System.out.println(d.toString());
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		} 



	}
}
