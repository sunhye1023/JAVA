package quiz21;

public class Tank extends Unit {

	public Tank() {
		super(0,0,100,"Tank");
	}
	
	//location()과 move()의 기능은 동일
	
	public void changeMode() {
		
	}

	@Override
	public void location() {
		System.out.println("탱크 현재위치(" + x + "," + y + ")");
	}

	@Override
	public int move(int x, int y) {
		int distance = (int)(Math.sqrt((x - this.x)*(x - this.x) + (y - this.y)*(y - this.y)));
		System.out.println("Tank가 이동한 거리 " + distance);
		this.x = x;
		this.y = y;
		return distance;
	}
	
}
