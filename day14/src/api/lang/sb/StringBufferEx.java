package api.lang.sb;

public class StringBufferEx {

	public static void main(String[] args) {
		
		String str = new String("Java ");
		StringBuffer sb = new StringBuffer("Java ");
		
		System.out.println(str);
		System.out.println(sb);
		
		//차이점
		
		str = str + "program";
		sb.append("program");
		
		System.out.println(str);
		System.out.println(sb);
		
		//문자열 추가 append
		sb.append(" study");
		
		//문자열 추가 insert
		sb.insert(12, "ming");
		
		//문자열 변경 replace
		sb.replace(5, 16, "book");
		
		//문자열 삭제 delete
		sb.delete(5, 9);
		
		System.out.println(sb);
		
		//문자열을 거꾸로 reverse
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		
	}
}
