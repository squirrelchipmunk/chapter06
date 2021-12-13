package echo.ex05;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(new DigitRunnableImpl());
		t.start();

		for(char ch='A'; ch <='Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(700);
		}
		
	}

}
