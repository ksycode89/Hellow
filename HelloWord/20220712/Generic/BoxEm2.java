package Generic;

public class BoxEm2 {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("문자열2");
		box.get();
		String result = box.get();
		
		Box<Integer> intBox = new Box<>();
		intBox.set(100); //<--Integer 타입
		int result1 = intBox.get(); //<-Integer타입이 int타입으로
		
		
		
		
	}
}
