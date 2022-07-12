package Thread;

class A extends Thread {
	public A(String a) {
		setName(a);
	}

	public void run() {
		for (int i = 0; i < 2000000000; i++) {
			if (i % 500000 == 0) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException a) {
					a.printStackTrace();
				}
			}

		}
		System.out.println(getName() + "의 작업끝");
	}
}

public class PriorityEx {
	public static void main(String[] args) {
		for (int i = 0; i <=10; i++) {
			Thread thr = new A("Thread"+i);
					if(i!=10) {
						thr.setPriority(1);
					}else {
						thr.setPriority(10);
			
			
			
		} 
					thr.start();
	}

}
}
