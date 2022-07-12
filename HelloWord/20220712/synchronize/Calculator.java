package synchronize;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public  void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException a) {
			a.printStackTrace();
		}
		System.out.println("메모리는"+memory);
	}
	
	
	
//	 
	

}
