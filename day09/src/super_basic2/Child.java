package super_basic2;

public class Child extends Parent {

	String me;
	
	Child(String father, String mother, String me){
		super(father, mother);
		this.me = me;
	}
	
	void info() {
		super.info();
		//자식클래스에서 부모클래스이 필요한 기능을 사용하고싶을 때super.을 쓴다
	}
	
}
