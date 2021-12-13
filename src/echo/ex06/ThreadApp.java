package echo.ex06;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new DigitRunnableImpl());
		Thread t2 = new Thread(new LowerRunnableImpl());
		Thread t3 = new Thread(new UpperRunnableImpl());
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
