package Thread;

import java.awt.Toolkit;

public class BeepTest implements Runnable{

		
	@Override
	public void run() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			tool.beep();
			try {
				Thread.sleep(800);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
	
}
}