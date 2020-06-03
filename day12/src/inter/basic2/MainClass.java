package inter.basic2;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
		//1. Animal[] 생성 후 baduk, nabi, hodol를 저장한 후에 향상된 for문으로 Animal의 공통 기능을 출력
		
		Animal[] animal = new Animal[3];
		animal[0] = baduk;
		animal[1] = nabi;
		animal[2] = hodol;
		for(Animal a : animal) {
			a.eat();
		}
		
		Animal[] animal1 = {baduk, nabi, hodol};
		for(Animal a1 : animal1) {
			a1.eat();
		}

		
		//2. IPet[] 생성 후 baduk, nabi, 금붕어를 저장하고 향상된 for문으로 출력
		//baduk은 Animal타입이지만, 하위클래스와 상호연관이 있다면, 형변환이 가능함
		
		IPet[] ipet = new IPet[3];
		ipet[0] = (IPet)baduk;
		ipet[1] = (IPet)nabi;
		ipet[2] = new GoldFish();
		for(IPet i : ipet) {
			i.play();
		}

		System.out.println("-----------------");
		
		IPet i = new Dog();
		PetHouse care = new PetHouse();
		care.carePet(i);
		care.carePet((IPet)baduk);
		care.carePet((IPet)nabi);
		care.carePet(new GoldFish());
		care.petInfo(ipet);

		
		
	}
}
