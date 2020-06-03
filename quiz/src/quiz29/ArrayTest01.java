package quiz29;

public class ArrayTest01 {

	public static void main(String[] args) {
		
	
		try {
			ArrayTest01 a = new ArrayTest01();
			System.out.println(a.sayNick("홍홍홍", 9));
		} catch (Exception e) {
			System.out.println("에러발생");
		}
		
	}
	
	public String sayNick(String name, int index) throws Exception {
		String[] arr = {"박장군","김원장", "진회장", "김재명"};
		
		int ran = (int)(Math.random()*index);

		if(index>arr.length) {
		}
		
		return name + "별명은:" + arr[ran] + "입니다";
		
		
}
}