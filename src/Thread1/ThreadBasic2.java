package Thread1;
//Single Thread 예제 
//2. Runnable 인터페이스로 구현하는 방법 
public class ThreadBasic2 implements Runnable{
	
	private int time; 
	private String message; 
	
	public ThreadBasic2(String message, int time) {
		this.message = message; 
		this.time = time; 
		System.out.println("싱글스레드 시작");
	}
	
    public void run() {
    	for(int i= 1; i<=5; i++) {
    		try {
    			Thread.sleep(time); 
    			System.out.println(message+" "+i+"번째 실행중");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	System.out.println("끝"); 
    }

	public static void main(String[] args) {
		
		ThreadBasic2 st = new ThreadBasic2("싱글스레드02", 1000);
		Thread t = new Thread(st); 
		t.start();

	}

}
