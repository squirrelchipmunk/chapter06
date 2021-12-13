package echo.ex04;

public class UpperThread extends Thread {
	@Override
	public void run() {
		for(char ch='A'; ch <='Z'; ch++) {
			System.out.println(ch);
		}
	}
}
