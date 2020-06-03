package encap.good;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		me.setYear(2030);
		me.setYear(2020);
		int year = me.getYear();
		System.out.println("년:" + year);
		
		me.setMonth(14);
		me.setMonth(10);
		int month = me.getMonth();
		System.out.println("월:" + month);
		
		me.setDay(33);
		me.setDay(23);
		int  day = me.getDay();
		System.out.println("일:" + day);
		
		me.setSsn("123456789987654");
		me.setSsn("1235467894561");
		String ssn = me.getSsn();
		System.out.println("주민번호:" + ssn);
		
		///////////////////////////////////////
		
		Member m1 = new Member("ghgh", "123","홍길동", "sdkl@dnl", "서울", 010, 23);
		Member m2 = new Member("Df", "12", "홍길자", "sdf", "경기", 010, 32);
		
		Member[] arr2 = new Member[2];
		arr2[0] = m1;
		arr2[1] = m2;
		
		System.out.println(Arrays.toString(arr2));
		//arr2배열에 객체가 통째로담겼다
		
		for(int i=0;i<arr2.length;i++) {
			Member m = arr2[i];
			System.out.println(m.getId());
			System.out.println(m.getPw());
		}
		
		
		Member m3 = new Member("홍홍", "123", "홍길동", "google", "경기", 3242, 32);
		Member m4 = new Member("가가", "465", "가가가", "naver", "서울", 7654, 65);
		
		Member[] arr3 = new Member[2];
		arr3[0]=m3;
		arr3[1]=m4;
		
		System.out.println(Arrays.toString(arr3));
		
		for(int i=0;i<arr3.length;i++) {
			Member m = arr3[i];
			
			System.out.println(m.getAge());
			System.out.println(m.getEmail());
			System.out.println(m.getName());
		}

		
		
	}
}
