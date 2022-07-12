package Thread;

import java.awt.Toolkit;

public class TreadEX {
	public static void main(String[] args) {
		//Thread 생성자
		Thread beep = new Thread (new BeepTest());
		
		//Thread 상속받은 하위 상속자 
		beep = new BeepWorkThread();
		beep.start();
		
		
		/*
		 * Toolkit tool = Toolkit.getDefaultToolkit(); for (int i = 0; i < 5; i++) {
		 * tool.beep(); try { Thread.sleep(800);
		 * 
		 * } catch (InterruptedException e) { e.printStackTrace(); } }
		 */
		for (int i = 0; i < 5; i++) {
			System.out.println("print");
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
