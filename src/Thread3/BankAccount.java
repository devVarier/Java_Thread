package Thread3;

public class BankAccount {
	int balance = 5000; 
	
	synchronized void deposit(int amount) {
		balance = balance + amount; 
	}
	synchronized void withdraw(int amount) {
		balance = balance - amount; 
	}
	int getBalance() {
		return balance; 
	}

}
