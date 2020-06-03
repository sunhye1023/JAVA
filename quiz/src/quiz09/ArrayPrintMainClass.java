package quiz09;

public class ArrayPrintMainClass {

	public static void main(String[] args) {
		
		ArrayPrint ap = new ArrayPrint();
		
		String[] sArr = {"홍길동","이순신","홍길자"};
		int[] iArr = {1,2,3,4,5};
		char[] cArr = {'가','나'};
		
		
		System.out.println(ap.printArray(sArr));
		System.out.println(ap.printArray(iArr));
		System.out.println(ap.printArray(cArr));
		
	}
	
}
