package Generic;

public class BoxEx {
	public static void main(String[] args) {
		Box strBox = new Box();
		strBox.set(new String ("문자열"));
		String result = (String)strBox.get();
		System.out.println(result);
		
		Integer result2= (Integer) strBox.get();
		System.out.println(result2);
		
		
		Box intBox = new Box();
		intBox.set(new Integer(100));
		 result2 = (Integer) intBox.get();
		System.out.println(result2);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
