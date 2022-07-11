package Afternoon;

import java.util.ArrayList;
import java.util.Iterator;

public class Lotter {

	public static void main(String[] args) {

		ArrayList<Integer> lotter = new ArrayList<>(6);
		Iterator<Integer> itor = lotter.iterator();
		for(int i=0; i<lotter.size();i++) {
			Integer num = (int) (Math.random() * 45) + 1;
//			lotter[i]=num;
		}
		
		
		
//		while (itor.hasNext()) {
//		int num = (int) (Math.random() * 45) + 1;
//			lotter.add(num);
//			System.out.println(lotter.get(num));
//			System.out.println(num);
//
//		}

	}
}
