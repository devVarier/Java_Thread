package Thread2;
//스레드 실행하는 코
public class RunSync {

	public static void main(String[] args) {
		
		RunSync runSync = new RunSync(); 
		runSync.runCommonCalculate();

	}
	
	public void runCommonCalculate() {
		CommonCalculate calc = new CommonCalculate(); 
		ModifyAmountThread thread1 = new ModifyAmountThread(calc, true); 
		ModifyAmountThread thread2 = new ModifyAmountThread(calc, false);
		
		thread1.start();
		thread2.start();
		try {
			thread1.join(); 
			thread2.join(); 
			System.out.println("Final value is"+calc.getAmount()); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
