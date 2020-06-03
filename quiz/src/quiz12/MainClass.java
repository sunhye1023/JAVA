package quiz12;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("---마법사---");
		Wizard cc1 = new Wizard("구르미그린");
		cc1.info();
		cc1.iceArrow();
		System.out.println("---전사---");
		Warrior cc2 = new Warrior("대한전사");
		cc2.info();
		cc2.bash();
		
	}
	
	
}
