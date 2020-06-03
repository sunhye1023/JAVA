package quiz05;

public class AccountMainClass {

	public static void main(String[] args) {
		
		Account myAcc = new Account("홍길동", "1234", 3600);
		
		myAcc.deposit(800);
		myAcc.withDraw(1900);
		
		int balance = myAcc.getbalance();
		System.out.println(myAcc.name + "님의 계좌 잔액은 " + balance + "원 입니다");
		
	}
}
