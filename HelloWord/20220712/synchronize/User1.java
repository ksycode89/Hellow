package synchronize;



public class User1  extends Thread{
	private Calculator calculator;
	
	public void setCalculator (Calculator calculator) {
		setName("user1");
		
		this.calculator = calculator;
	}
	 @Override
	public void run() {
		calculator.setMemory(100);
		
	}
	
}
