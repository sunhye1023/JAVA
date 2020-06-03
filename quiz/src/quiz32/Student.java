package quiz32;

import java.util.Scanner;

public class Student {

	private String stuId;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private String grade;
	private Scanner scan = new Scanner(System.in);
	
	//학생정보 입력 메서드
	public String inputStuInfo() {
		/*
		 * 학번, 이름, 국, 영, 수 를 입력받음
		 * 국, 영, 수는 문자열 입력 시, 다시 받을 수 있도록 예외처리
		 */
		
		System.out.print("학번> ");
		this.stuId = scan.next();
		System.out.print("이름> ");
		this.name = scan.next();
		while(true) {
			try {
			System.out.print("국어> ");
			this.kor = scan.nextInt();
			System.out.print("영어> ");
			this.eng = scan.nextInt();
			System.out.print("수학> ");
			this.math = scan.nextInt();
			break;
			} catch (Exception e) {
				System.out.println("다시 입력해주세요");
				scan.nextLine();
			}
			
		}
		
		return stuId;
	}
	
	
	//총점, 평균, 학점을 계산하는 메서드
	public void calcTotAvg() {
		/*
		 * 총점, 평균, 등급을 나누어서 멤버변수에 저장
		 */
		
		this.total = kor+eng+math;
		this.avg = (total/3.0);
		
		
		switch ((int)(avg/10)) {
		case  9:
			this.grade = "A등급";
			break;
		case  8:
			this.grade = "B등급";
			break;
		case  7:
			this.grade = "C등급";
			break;
		case  6:
			this.grade = "D등급";
			break;
		default:
			this.grade = "F등급";
			break;
		}

	}
	
	
	//학생정보 출력 메서드
	public void outputInfo() {
		System.out.printf("%4s%6s%11d점%11d점%11d점%11d점%11.2f점%10s\n",
				this.stuId, this.name, this.kor, this.eng, this.math,
				this.total, this.avg, this.grade);
	}


	
	//getter, setter
	public String getStuId() {
		return stuId;
	}


	public void setStuId(String stuId) {
		this.stuId = stuId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public Scanner getScan() {
		return scan;
	}


	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	
	
}
