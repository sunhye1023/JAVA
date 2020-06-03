package quiz32;

import java.util.List;
import java.util.Scanner;

public class Point extends Student implements InterPoint {

	Scanner scan = new Scanner(System.in);

	public void showPointUI() {	
		System.out.println("===========================================================");
		System.out.printf("%4s%10s%10s%10s %11s%11s%11s %11s\n"
				, "학번", "이름", "국어", "영어", "수학", "총점"
				, "평균", "학점");
		System.out.println("===========================================================");
	}

	public void input(List<Student> students) {
		Student stu = new Student();
		String result = stu.inputStuInfo();
		for(Student s : students) {
			if(s.getStuId().equals(result)) {
				System.out.println("이미 등록된 학번입니다");
				return;
			}
		} 
		stu.calcTotAvg();
		students.add(stu);
		System.out.println(stu.getName() + "님의 성적 정보가 정상적으로 입력되었습니다");
	}



	public void showAll(List<Student> students) {
		showPointUI();

		double totalAge = 0;
		for(Student s : students) {
			totalAge += s.getAvg();
			s.outputInfo();
			System.out.println("우리반 전체평균> " + totalAge/students.size());
		}

	}

	public void search(List<Student> students) {
		System.out.print("학번 입력> ");
		String id = scan.next();
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getStuId().equals(id)) {
				students.get(i).outputInfo();
				break;
			} if(i==students.size()-1) {
				System.out.println("해당 학번과 일치하는 학생을 찾지 못했습니다");
			}
		}
	}

	public void modify(List<Student> students) {
		System.out.print("학번 입력> ");
		String id = scan.next();
		for(int i=0;i<students.size();i++) {
			Student st = students.get(i);
			if(st.getStuId().equals(id)) {
				System.out.print("국어> ");
				st.setKor(scan.nextInt());
				System.out.print("영어> ");
				st.setEng(scan.nextInt());
				System.out.print("수학> ");
				st.setMath(scan.nextInt());
				System.out.println("수정되었습니다");
				break;
			} 
			if(i==students.size()-1) {
				System.out.println("해당학번과 일치하는 학생을 찾지 못했습니다");
			}
		}

	}

	public void delete(List<Student> students) {
		System.out.print("학번 입력> ");
		String id = scan.next();
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getStuId().equals(id)) {
				students.remove(i);
				System.out.println("학생이 삭제되었습니다");
				break;
			}
			if(i==students.size()-1) {
				System.out.println("해당학번과 일치하는 학생을 찾지 못했습니다");
			}
		}

	}

}
