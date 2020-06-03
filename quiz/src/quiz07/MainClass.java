package quiz07;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("---마법사---");
		Wizard c1 = new Wizard();
		c1.name = "구르미그린달빛";
		c1.hp = 500;
		c1.mp = 1000;
		c1.info();
		c1.iceArrow();
		
		System.out.println("---전사---");
		Warrior c2 = new Warrior();
		c2.name = "강한친구대한전사";
		c2.hp = 1000;
		c2.mp = 500;
		c2.info();
		c2.bash();
		
	}
	
	
}
