package ExMoring;


public class ExThrowException2 {
public static void main(String[] args) {
	String [] str = {"100","200",null,"ten"};
	
	try {
	subMethod(str);
	}catch( NumberFormatException a) {
		System.out.println("예외1");
		
	}catch(ArrayIndexOutOfBoundsException b) {
		System.out.println("예외2");
	}catch(Exception c) {System.out.println("발생");
	}finally {
		
		System.out.println("finally");
	}
	
	
	
	
	
}
	public static void subMethod(String [] strAry)  
			throws NullPointerException,NumberFormatException, ArrayIndexOutOfBoundsException{
		
		for(int i=0; i<5; i++) {
			int num = Integer.parseInt(strAry[i]);
			System.out.println(num);
			
			
			
			
			
		}
				
	}
	
	
	
	
	
	
}
