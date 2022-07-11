package Afternoon;

import java.util.ArrayList;
import java.util.Iterator;

public class Lotter {

	public static void main(String[] args) {

		ArrayList<Integer> lotter = new ArrayList<>(6);
		Iterator<Integer> itor = lotter.iterator();
		int arNum ;
		arNum=lotter.size();
//		System.out.println(arNum);
//		for(int i=0; i<6;i++) {
//			Integer num = (int) (Math.random() * 45) + 1;
//			lotter.add(num);
//			System.out.println(lotter.get(i));
//		}
//		
		
		
		while (itor.hasNext()) {
		Integer num = (int) (Math.random() * 45) + 1;
			lotter.add(num);
			System.out.println(itor.hasNext());
			
		}
		System.out.println(lotter.get(0));
	}
}
