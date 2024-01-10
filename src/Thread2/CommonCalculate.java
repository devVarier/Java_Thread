package Thread2;
//자바의 신 예제 
public class CommonCalculate {
	private int amount; 
	public CommonCalculate() {
		amount = 0; 
	}
	/*
	 * 아래와 같이 작성하면 하나의 스레드가 끝나기도 전에 다른 스레드가 접근하여 값이 다르게 나온다.
	public void plus(int value) {
		amount+=value; 
	}
	
	public void minus(int value) {
		amount-=value; 
	}*/
	
	/*
	 * synchronized키워드를 사용하 해당 메소드 전체를 임계영역으로 설정하게 된다.
	 * 임계영역으로 설정되면서 lock 이 제공되어 해당 메소드를 실행하게되면 lock걸리게 되어 다른 스레드를
	 * 이미 실행하고 있는 스레드가 끝나기 전까지 실행할 수 없게된다. 
	 * 
	 * */
	public synchronized void plus(int value) {
		amount+=value; 
	}
	
	public synchronized void minus(int value) {
		amount-=value; 
	
	}
	
	
	public int getAmount() {
		return amount; 
	}
}
