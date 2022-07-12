package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
public static void main(String[] args) {
	Queue<String> que = new LinkedList<>();
	
	que.offer("김상영");
	que.offer("정국이");
	que.offer("손흥민");
	
	while(!que.isEmpty()) {
		
	String result = que.poll();
    que.poll();
	System.out.println(result);

	}
	
	
	
}
}
