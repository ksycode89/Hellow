package ExMoring;

import java.util.ArrayList;

public class ArryIndexOutoBoundss {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>(5);
	a.add(5);
//	a.add(7, 6);
	
//	System.out.println(a.get(7));
	for(int i=0; i<6; i++) {
		int b=0;
		try {
		 b = (int)((Math.random()*100)+1);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("넘어섬");
		}
		a.add(i,b);
		System.out.println(a.get(i));
	}
	
	
}
}
