package quiz21;

public class MainClass {

	public static void main(String[] args) {
		
		Marine marine1 = new Marine();
		Marine marine2 = new Marine();
		Marine marine3 = new Marine();
		Marine marine4 = new Marine();
		
		
		Tank tank1 = new Tank();
		Tank tank2 = new Tank();
		
		DropShip ship = new DropShip();

		marine1.move(5, 5);

		tank1.move(3, 4);
		
		
		ship.ride(marine1);
		ship.ride(marine1);
		ship.ride(tank1);
		ship.ride(marine1);
		ship.ride(marine1);
		ship.ride(ship);
		

		
	}
}
