package quiz36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import quiz31.User;

public class FileQuiz04 {

	public static void main(String[] args) {

		List<List<String>> list = new ArrayList<>();
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(d);

		Scanner scan = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		String str = "";	

		String[] arr = new String[100];
		try {
			fw = new FileWriter("D:\\course\\java\\file\\" + now + ".csv");
			bw = new BufferedWriter(fw);

			
			a:while(true) {
				
				System.out.println("[끝]을 입력하면 작성을 중단합니다");
				System.out.print("통신사 > ");
				String co = scan.next();
				if(co.equals("끝")) break a;
				System.out.print("이름 > ");
				String name = scan.next();
				if(name.equals("끝")) break a;
				System.out.print("번호 > ");
				String num = scan.next();
				if(num.equals("끝")) break a;
				System.out.print("요금제 > ");
				String pr = scan.next();
				if(pr.equals("끝")) break a;
			
				bw.write(co+name+num+pr+"\r\n");
				
				

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
			br = new BufferedReader((new InputStreamReader(new FileInputStream("D:\\course\\java\\file\\" + now + ".csv"), "UTF-8")));

			
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
