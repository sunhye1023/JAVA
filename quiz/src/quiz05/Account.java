package quiz05;

public class Account {

	String name;
	String password;
	int balance;
	
	Account(){
		
	}
	
	Account(String pName, String pPassword, int pBalance){
		name = pName;
		password = pPassword;
		balance = pBalance;
	}
	
	void deposit(int money){
		balance += money;
	}
	
	void withDraw(int money){
		balance -= money;
	}
	
	int getbalance() {
		return balance;
	}
	
}
