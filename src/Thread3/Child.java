package Thread3;

class Child extends Thread {
	  private BankAccount b;
	  Child(BankAccount b) {
	    this.b = b;
	  }

	  public void run() {
	    for (int i=0; i<100; i++)
	    {
	      try {
	          Thread.sleep((int)(Math.random()*10));
	      } catch(InterruptedException e) { }
	      b.withdraw(1000);
	      System.out.println("천원 인출/ 남은 금액:"+b.getBalance());
	    }
	  }
	} 