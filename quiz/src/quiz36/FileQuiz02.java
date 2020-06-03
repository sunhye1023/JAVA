package quiz36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. Date클래스를 이용해서 file경로에 20200421.txt이름으로 파일을 씁니다
		 * 2. 내용은 아무거나 작성하세요
		 * 3. 파일을 정상적으로 썼다면 BufferedReader를 통해서 파일을 읽어들이세요
		 * 
		 */

		Scanner scan = new  Scanner(System.in);
		Date d = new Date();
		String s = d.toString();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		FileWriter fw = null;
		BufferedWriter bw = null;

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fw = new FileWriter("D:\\course\\java\\file\\"+sdf.format(d)+".txt");
			bw = new BufferedWriter(fw);
			System.out.println("내용을 작성하세요> ");
			String w = scan.nextLine();
			bw.write(w);

			System.out.println("파일을 정상적으로 작성했습니다");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				bw.close();
				fw.close();
				scan.close();
			} catch (Exception e2) {
				
			}	
		}
		
		try {
			
			fr = new FileReader("D:\\course\\java\\file\\"+sdf.format(d)+".txt");
			br = new BufferedReader(fr);
			
			String str;
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
				scan.close();
			} catch (Exception e2) {
				
			}
		}



	}
}
