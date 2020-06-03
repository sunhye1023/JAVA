package quiz36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz03 {

	public static void main(String[] args) {

		/*
		 * 1. Date클래스를 이용해서 File경로에 하위폴더로 20200421file 폴더를 생성합니다
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다
		 * 3. 그만을 입력받을 때 까지 엔터를 포함해서 입력받습니다
		 *    \r\n을 적절하게 이용해서 파일 출력을 완료
		 * 4. 파일을 다 썼다면 아무방법으로 읽어들여서 이클립스 창에 출력
		 */

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(d);

		Scanner scan = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		String str = "";	

		try {
			File file = new File("D:\\course\\java\\file\\" + now + "file");
			//file.getPath(); //파일경로
			if(!file.exists()) {
				file.mkdir();
				System.out.println("폴더를 생성했습니다");

			} else {
				System.out.println("해당 폴더가 존재합니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {

			}
		}
		
		System.out.print("파일명을 입력하세요> ");
		String filename = scan.nextLine();
		try {
			fw = new FileWriter("D:\\course\\java\\file\\" + now + "file\\" +filename + ".txt");
			bw = new BufferedWriter(fw);
			System.out.println("내용을 작성하세요");
			a:while(true) {
				String memo = scan.nextLine();
				if(memo.equals("그만")) {
					break a;
				}
				bw.write(memo + "\r\n");
			}
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

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("D:\\course\\java\\file\\" + now + "file\\" + filename + ".txt");
			br = new BufferedReader(fr);
			
			//많이 사용되는 인코딩형식 지정 후 파일 열기
			//br = new BufferedReader((new InputStreamReader(new FileInputStream("D:\\course\\java\\file\\" + now + "file\\" + filename + ".txt"), "UTF-8")));
			
			String str1;
			while((str1 =br.readLine())!=null){
				System.out.println(str1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (Exception e2) {

			}
		}

	}
}
