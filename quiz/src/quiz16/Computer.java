package quiz16;

public class Computer {
	
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard kb;
	private Monitor mon;
	private Mouse mou;
	
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer(){
		this.kb = new KeyBoard();
		this.mon = new Monitor();
		this.mou = new Mouse();
	}
	
	//생성자
	public Computer(KeyBoard kb, Monitor mon, Mouse mou) {
		this.kb = kb;
		this.mon = mon;
		this.mou = mou;
	}
	
	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void ComputerInfo(){
		kb.info();
		mon.info();
		mou.info();
	}

	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	public KeyBoard getKb() {
		return kb;
	}

	public void setKb(KeyBoard kb) {
		this.kb = kb;
	}

	public Monitor getMon() {
		return mon;
	}

	public void setMon(Monitor mon) {
		this.mon = mon;
	}

	public Mouse getMou() {
		return mou;
	}

	public void setMou(Mouse mou) {
		this.mou = mou;
	}
	

	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
