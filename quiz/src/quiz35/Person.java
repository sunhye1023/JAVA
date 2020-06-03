package quiz35;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Person implements Info  {

	public String perId;
	public String perPw;
	public String name;
	public String email;
	Scanner scan = new Scanner(System.in);
	
	Person p = new Person();
	
	public Person() {
		
	}
	
	

	public Person(String perId, String perPw, String name, String email) {
		super();
		this.perId = perId;
		this.perPw = perPw;
		this.name = name;
		this.email = email;
	}

	public String info() {
        return "회원아이디 :" + perId + ", 비밀번호 : " + perPw + ", 이름 : " + name + ", 이메일 : " + email ;
    }

	public String insertList() {
	
		System.out.println("===== 회원가입 =====");
		System.out.print("회원아이디 > ");
		this.perId = scan.next();
		System.out.print("비밀번호 > ");
		this.perPw = scan.next();
		System.out.print("이름 > ");
		this.name = scan.next();
		System.out.print("이메일 > ");
		this.email = scan.next();

		return perId;
	}


	public void infoList(Set<Person> s) {
		System.out.println("===== 회원 정보 =====");
		System.out.println();
	}

	public void searchList() {
		System.out.println("회원정보를 검색합니다");
		System.out.print("검색할 회원이름을 입력하세요> ");
		String sname = scan.next();
		if(this.name.equals(sname)) {
			System.out.println();
		} else {
			System.out.println("해당 회원이 없습니다");
		}
		
			
	}


	public void pwSearch() {
		
		
	}


	public String getPerId() {
		return perId;
	}


	public void setPerId(String perId) {
		this.perId = perId;
	}


	public String getPerPw() {
		return perPw;
	}


	public void setPerPw(String perPw) {
		this.perPw = perPw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Scanner getScan() {
		return scan;
	}


	public void setScan(Scanner scan) {
		this.scan = scan;
	}



	@Override
	public void infoList() {
		// TODO Auto-generated method stub
		
	}

	
	
}
