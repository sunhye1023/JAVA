package quiz17;

public class Warrior extends Player{

	//name은 전달받아서 초기화, hp = 1000, mp = 500, attack = 10, armor = 5

	Warrior(String name){
		this.name = name;
		this.hp = 1000;
		this.mp = 500;
		this.attack = 10;
		this.armor = 5;
	}

	void bash(Player p) {
		if(mp<=100) {
			System.out.println("스킬을 사용할 수 없습니다");
			return;
		}
		if(p instanceof Warrior) {
			Warrior war = (Warrior)p;
			war.mp -= 100;
			this.mp -= 100;
		} else if(p instanceof Wizard) {
			Wizard wiz = (Wizard)p;
			wiz.mp -= 200;
			this.mp -= 100;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	void bash(Player p) {
//		if(this.mp<=100) {
//			System.out.println("스킬을 사용할 수 없습니다");
//			return;
//		} else {
//			System.out.println(p.name + "님 스킬 적중");
//			if(p instanceof Warrior) {
//				Warrior war = (Warrior)p;
//				war.hp -= 100;
//				this.mp -= 100;
//			}	else if(p instanceof Wizard) {
//				Wizard wiz = (Wizard)p;
//				wiz.hp -= 200;
//				this.mp -= 100; 
//			}
//		}
//
//	}
}