package quiz42;

public class VoteThread {

	public static void main(String[] args) {
		
	/*
	 * 스레드 객체 3개가 생성되어야 합니다
	 * run() 메서드 안에서는 랜덤값을 이용해서 개표 진행사항을 화면에 출력합니다
	 * 
	 * 조건: 개표율이 100%를 넘어가면 안됩니다
	 */
	
	
	Location vote1 = new Location();
	Location vote2 = new Location();
	Location vote3 = new Location();
	
	vote1.setName("Location1 개표율");
	vote2.setName("Location2 개표율");
	vote3.setName("Location3 개표율");
	
	vote1.start();
	vote2.start();
	vote3.start();
	
	
	}
}
