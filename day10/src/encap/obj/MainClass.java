package encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		
		h.setEmp(new Employee());
		
		Employee e = h.getEmp();
		e.work();
		//h.getEmp().work();
		
		h.setChef(new Chef());
		//Chef c = new Chef();
		//h.setChef(c);
		Chef c = h.getChef();
		c.cook();
		//h.getChef().cook();
		
		Hotel ho = new Hotel();
		
		ho.setEmp(new Employee());
		ho.getEmp().work();
		
		ho.setChef(new Chef());
		ho.getChef().cook();
		
		
		
	}
}
