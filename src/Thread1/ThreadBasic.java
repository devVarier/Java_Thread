package Thread1;
//Single Thread 예제 
// 1.Thread 클래스 상속하여 구현하는 방법 
public class ThreadBasic extends Thread{

	private int time; 
	private String message; 
	
	public ThreadBasic(String message, int time) {
		this.message = message; 
		this.time = time; 
		System.out.println("싱글스레드 시작");
	}
	
	public void run() {
		for(int i = 1; i<= 5; i++) {
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
		ThreadBasic st = new ThreadBasic("싱글스레드", 1000);
		st.start();
	}

}
