package jdbc.bookprogram;

import java.util.ArrayList;

public class MemberVO {
	
	public String id;
	public String pw;
	public String name;
	public int age;
	public String email;
	public String phone;
	public String address;
	public String grade;
	
	public ArrayList<BookVO> list = new ArrayList<>();
	public ArrayList<BookLA> list2 = new ArrayList<>();
	

	public MemberVO() {
		
	}

	public MemberVO(String id, String pw, String name, int age, String email, String phone, String address,
			String grade) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.grade = grade;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public ArrayList<BookVO> getList() {
		return list;
	}


	public void setList(ArrayList<BookVO> list) {
		this.list = list;
	}
	
	public ArrayList<BookLA> getList2() {
		return list2;
	}
	
	public void setList2(ArrayList<BookLA> list2) {
		this.list2 = list2;
	}
	
}
