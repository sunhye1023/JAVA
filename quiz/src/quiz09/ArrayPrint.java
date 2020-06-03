package quiz09;

public class ArrayPrint {

	String sArr;
	int iArr;
	char cArr;
	
	String printArray(String[] arr) {
		String sA = "[";
		for(int i=0;i<arr.length;i++) {
			sA += arr[i];
			if(i==arr.length-1) break;
			sA += ",";
		}
		sA += "]";
		return sA;
	}	
	
	
	String printArray(int[] arr) {
		String sA = "[";
		for(int i=0;i<arr.length;i++) {
			sA += arr[i];
			if(i==arr.length-1) break;
			sA += ",";
		}
		sA += "]";
		return sA;
	}

	String printArray(char[] arr) {
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