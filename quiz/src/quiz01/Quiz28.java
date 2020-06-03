package quiz01;

public class Quiz28 {

	public static void main(String[] args) {
		
		for(int i=1;i<=9;i+=3) {
			for(int j=1;j<=9;j++) {
				System.out.println(i + "x" + j + "=" + (i*j) + "\t" + (i+1) + "x" + j + "=" + (i*j) + "\t" + (i+2) + "x" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
		
		
		
	}
}
