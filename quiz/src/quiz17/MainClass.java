package quiz17;

public class MainClass {

	public static void main(String[] args) {

		Warrior me = new Warrior("강한친구대한전사");

		Wizard play2 = new Wizard("구르미그린마법사");
		Warrior play3 = new Warrior("전사약해요");

		System.out.println("---나의 케릭 배쉬스킬 사용---");
		me.bash(play2);
		me.bash(play3);
		me.bash(play2);
		me.bash(play3);


		
		System.out.println("-----------------------");
		
		me.info();
		play2.info();
		play3.info();

		System.out.println("------------------------");
		
		Warrior w1 = new Warrior("강한친구");
		Wizard w2 = new Wizard("구르미");
		Warrior play4 = new Warrior("전사약해요");
		Warrior me1 = new Warrior("나의케릭터");
		Player[] arr = {me1, w1 , play4};
		w2.blizzard(arr);
		w2.blizzard(arr);
		w2.blizzard(arr);
		w2.blizzard(arr);
		w2.blizzard(arr);
		
		me.info();
		w1.info();
		
	}
}
