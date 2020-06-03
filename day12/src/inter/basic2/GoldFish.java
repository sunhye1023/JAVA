package inter.basic2;

public class GoldFish extends Fish implements IPet {

	public void swim() {
		System.out.println("금붕어는 강에서 헤엄쳐요");
	}

	public void play() {
		System.out.println("금붕어는 어항에서 놀아요");
	}

}
