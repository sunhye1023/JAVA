package quiz06;

public class Student {

	/*
	 * 멤버변수
	 * name - 학생 이름
	 * no - 학생번호
	 * kor - 국어점수
	 * eng - 영어점수
	 * math - 수학점수
	 * 
	 * 생성자
	 * 5가지를 초기화 하는 생성자
	 * 
	 * getTotal() - 국어, 영어, 수학 점수를 모두 더해서 합계반환
	 * getAvg() - 총점을 나눈 평균을 반환 (단, 소수점 2자리까지)
	 * 
	 * main에서는 학생 2명을 각각 생성하고 확인
	 */
	
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){
		
	}
	
	Student(String pName, int pNo, int pKor, int pEng, int pMath){
		name = pName;
		no = pNo;
		kor = pKor;
		eng = pEng;
		math = pMath;
	}
	
	void info() {
		System.out.println("학생이름 : " + name);
		System.out.println("학생번호 : " + no);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
	}
	
	double getTotal() {
		double sum = kor+eng+math;
		return sum;
	}
	
	double getAvg() {
		return (int)((getTotal() / 3) *100) / 100.0;
//		double avg = getTotal()/3.0; //3.0을 해주면 getTotal()메서드를 int로 해줘도된다
//		System.out.printf("평균%.2f", avg);
//		return avg;
	}
	
	
	
	
}
