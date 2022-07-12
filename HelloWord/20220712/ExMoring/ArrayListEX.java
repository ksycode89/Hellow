package ExMoring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEX {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("사과");
		list.add("100");

		for (int i = 0; i < list.size(); i++) {
			String result = list.get(i);
			System.out.println(result);
		}
		//List
		List<String>sList = new ArrayList<>();
		sList.add("김상영");
		sList.add("락토핏");
		String reulst = sList.get(1);
		sList.remove(0);
		sList.set(0, "양요섭");
		
		Iterator<String> iter = sList.iterator();
		while(iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
	}
		
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		
		for(String val : sList) {
			System.out.println(val);
		}
		
		
		
		
		
		
	}

}
