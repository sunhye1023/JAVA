package quiz40;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//쓰기?
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;

//저장?
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;



public class RegexQuiz {

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

		List<Product> list = new ArrayList<>();
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\course\\java\\건담.txt"),"UTF-8"));

			String str;
			while((str = br.readLine())!=null) {
				
				Product product = new Product();

				String pattern1 = "\\d{8}-\\d{2}-\\d+";
				String pattern2 = "[가-힇]+\\s[가-힇]+";
				String pattern3 = "\\[[A-Z]+\\]|\\[[가-힇]+\\]";
				String pattern5 = "\\d+,*\\d+원";

				String[] arr = {str};
				
				int i=0;
				while(i<arr.length) {
					Matcher m1 = Pattern.compile(pattern1).matcher(arr[i]);
					Matcher m2 = Pattern.compile(pattern2).matcher(arr[i]);
					Matcher m3 = Pattern.compile(pattern3).matcher(arr[i]);
					Matcher m5 = Pattern.compile(pattern5).matcher(arr[i]);

					if(m1.find()&&m2.find()&&m3.find()&&m5.find()) {
						product.setDay(m1.group());
						product.setStore(m2.group());
						product.setGrade(m3.group());
						product.setPrice(m5.group()); 
						product.setDetail(str.substring(m3.end()+1,m5.start()-1));
					}
					i++;
				}
				
				list.add(product);

			}			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("new");
		
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
			file = new FileOutputStream("D:\\course\\java\\workspace\\quiz\\src\\quiz40\\건담.xlsx");
			workbook.write(file);
			file.close();
			System.out.println("파일생성완료!");
		}catch (IOException e) {
			e.printStackTrace();
		}

		
		

	}
}
