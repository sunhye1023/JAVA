package quiz21;

public abstract class Unit {

	public int x;
	public int y;
	public int hp;
	public String name;
	
	public Unit(int x, int y, int hp, String name) {
		this.x=x;
		this.y=y;
		this.hp=hp;
		this.name=name;
	}

	public abstract void location();
	public abstract int move(int x, int y);

	public void stop() {
		System.out.println("정지");
	}
	
}
