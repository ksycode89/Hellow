package Stack;

import java.util.Stack;

public class StarckEx {
	public static void main(String[] args) {
		
		Stack<String>stack = new Stack<>();
		
		stack.push("김상영");
		stack.push("정국이");
		stack.push("손흥민");
		
		String elem = stack.peek();
		stack.pop();
			
		System.out.println(elem);
		
		elem = stack.pop();
		System.out.println(elem);
		
	}

}
