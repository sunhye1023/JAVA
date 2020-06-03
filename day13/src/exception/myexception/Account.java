package exception.myexception;

public class Account {

	/*
	 * 1. 잔액(balance:long)으로 멤버변수를 선언 private제한자
	 * 2. deposit 입금기능
	 *    withDraw 출금기능
	 *    getBalance : long 잔액확인기능
	 *    
	 * 3. 출금기능에서 잔액이 출금금액보다 작다면 예외를 발생시키는 코드를 작성해보세요 
	 */

	public static void main(String[] args) {

		Account a = new Account(5000);
		System.out.println("잔액: "+a.getBalance());
		a.deposit(3000);
		System.out.println("잔액: "+a.getBalance());
		try {
			a.withDraw(300);
			System.out.println("잔액: "+a.getBalance());
			a.withDraw(50000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	private long balance;

	Account(int balance){
		this.balance=balance;
	}

	public void deposit(int money) {
		this.balance += money;
	}

	public void withDraw (int money) throws MyException {
		if(balance<money) {
			throw new MyException("잔액 부족: " + (money-balance));
		}		
		this.balance -= money;
		
	}

	public long getBalance() {
		return balance;
	}




}
