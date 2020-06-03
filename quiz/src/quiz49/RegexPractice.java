package quiz49;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexPractice {

	static XSSFRow row;
	static XSSFCell cell;

	public static void main(String[] args) {

		/*
		 * 1. day, store, grade, detail, price를 멤버로 갖는 Product클래스를 생성합니다
		 * 2. getter, setter를 선언합니다
		 * 3. Product를 제네릭으로 갖는 ArrayList를 생성합니다
		 * 4. BufferedReader를 통해서 건담.txt.파일을 읽어들입니다
		 * 5. while문 안에서는 readLine()메서드를 이용해서 한줄씩 읽도록 처리합니다
		 * 6. 날짜, 지점, 등급, 상세, 가격 패턴분석을 통해서 Product에 저장 후 리스트에 추가합니다
		 * 
		 * 7. 외부라이브러리를 사용해서 분석한 패턴을 xlsx엑셀파일로 추출합니다
		 */

		List<Goods> list = new ArrayList<>();
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\course\\java\\건담.txt"),"UTF-8"));

			String str;
			while((str = br.readLine())!=null) {

				System.out.println(str);
				Goods goods = new Goods();

				String p1 = "\\d{8}-\\d{2}-\\d+";
				String p2 = "[가-힣]+ [가-힣]+";
				String p3 = "\\[[A-Z가-힣]+\\]";
				String p5 = "\\d+,*\\d+원";

				Matcher m1 = Pattern.compile(p1).matcher(str);
				Matcher m2 = Pattern.compile(p2).matcher(str);
				Matcher m3 = Pattern.compile(p3).matcher(str);
				Matcher m5 = Pattern.compile(p5).matcher(str);

				if(m1.find()&&m2.find()&&m3.find()&&m5.find()) {

					goods.setDay(m1.group());
					goods.setStore(m2.group());
					goods.setGrade(m3.group());
					goods.setDetail(str.substring(m3.end()+1,m5.start()-1));
					goods.setPrice(m5.group());
				}
//				if(m1.find())
//					System.out.print(m1.group());
//				if(m2.find())
//					System.out.print(m2.group());
//				if(m3.find())
//					System.out.print(m3.group());
//				if(m5.find())
//					System.out.print(m5.group());
//				System.out.println();



				list.add(goods);
			
			}


		} catch (Exception e) {
			e.printStackTrace();
		}


		list.stream().forEach((goods)->System.out.println(goods.getDay()+goods.getStore()+goods.getGrade()+goods.getDetail()+goods.getPrice()));


		XSSFWorkbook work = new XSSFWorkbook();
		XSSFSheet sheet = work.createSheet("sheet1");

		for(int i=0;i<list.size();i++) {
			row=sheet.createRow(i);

			row.createCell(0).setCellValue(list.get(i).getDay());
			row.createCell(1).setCellValue(list.get(i).getStore());
			row.createCell(2).setCellValue(list.get(i).getGrade());
			row.createCell(3).setCellValue(list.get(i).getDetail());
			row.createCell(4).setCellValue(list.get(i).getPrice());

		}

		FileOutputStream file;
		try {
			file=new FileOutputStream("D:\\course\\java\\file\\건담등장.xlsx");
			work.write(file);
			System.out.println("파일생성!");
		} catch (Exception e) {
			e.printStackTrace();
		}



	}
}
