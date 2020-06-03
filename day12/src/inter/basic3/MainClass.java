package inter.basic3;

public class MainClass {

	public static void main(String[] args) {
		
		Printed print = new Samsung(); //new LG();
		print.turnOn();
		print.print("마바사");
		print.colorPrint("가나다라", "검정");
		print.copy(10);
		print.turnOff();
		
		
	}
}
