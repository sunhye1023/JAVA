package api.io.buffered04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		Scanner scan = new Scanner(System.in); 
		
		try {
			
			/*
			 * 순서대로 nextLine()을 써서 2문장을 입력받습니다
			 * 줄바꿈 처리를 한 다음에 file폴더 안에 text3.txt형식으로 파일을 쓰세요
			 */
			
			fw = new FileWriter("D:\\course\\java\\file\\text3.txt");
			bw = new BufferedWriter(fw);

			System.out.println("2개의 문장을 입력하세요> ");
			String str1 = scan.nextLine();
			String str2 = scan.nextLine();
			String str3 = str1+"\r\n"+str2;
			
			bw.write(str3);
			bw.flush();
			
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
		
		
	}
}
