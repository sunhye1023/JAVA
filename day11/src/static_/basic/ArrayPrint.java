package static_.basic;

public class ArrayPrint {

	//1. 외부에서 객체를 생성할 수 없도록 접근제한자를 붙이세요
	//2. 객체를 생성하지 않고 메서드를 사용하도록 static을 붙이세요
	
	
	public static String printArray(String[] arr) {
		String sA = "[";
		for(int i=0;i<arr.length;i++) {
			sA += arr[i];
			if(i==arr.length-1) break;
			sA += ",";
		}
		sA += "]";
		return sA;
	}	
	
	
	public static String printArray(int[] arr) {
		String sA = "[";
		for(int i=0;i<arr.length;i++) {
			sA += arr[i];
			if(i==arr.length-1) break;
			sA += ",";
		}
		sA += "]";
		return sA;
	}

	public static String printArray(char[] arr) {
		String sA = "[";
		for(int i=0;i<arr.length;i++) {
			sA += arr[i];
			if(i==arr.length-1) break;
			sA += ",";
		}
		sA += "]";
		return sA;
	}

}