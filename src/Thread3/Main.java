package Thread3;
/*
 * 은행계좌 문제 
 * */
public class Main {

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount(); 
		Parent p = new Parent(b); 
		Child c = new Child(b); 
		p.start();
		c.start();
		try {
			p.join(); 
			c.join(); 
			System.out.println(b); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
