package echo.ex04;

public class DigitThread extends Thread{

	@Override
	public void run() {
		for(int cnt=0; cnt<10;cnt++) {
			System.out.println(cnt);		
		}
	}

	
	
}
