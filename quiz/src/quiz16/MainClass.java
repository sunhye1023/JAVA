package quiz16;

public class MainClass {

	public static void main(String[] args) {
		
//		Monitor mon = new Monitor();
//		Mouse mou = new Mouse();
//		KeyBoard kb = new KeyBoard();
		
		//컴퓨터 생성
		Computer com = new Computer(new KeyBoard(), new Monitor(), new Mouse());
//		Computer com = new Computer(kb, mon, mou);
		com.ComputerInfo();
		
		
		System.out.println("----------------------------");
		//getter메서드 사용
		Monitor monitor = com.getMon();
		monitor.info();
		com.getMon().info();
		com.getKb().info();
		com.getMou().info();

		
	}
}
