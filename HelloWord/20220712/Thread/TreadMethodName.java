package Thread;

public class TreadMethodName {
	public static void main(String[] args) {
		
		Thread ThreadA = new ThreadA();
		ThreadA.start();
		
		Thread ThreadB = new ThreadB();
		ThreadB.start();
	}
}

class ThreadA extends Thread {

	public ThreadA() {
		super();
		setName("ThreadA입니다.");

	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Thread 명 : " + getName());
		}
	}

}

class ThreadB extends Thread {
	public ThreadB() {
		super();
		setName("ThreadB입니다.");

	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Thread 명 : " + getName());
		}
	}

}