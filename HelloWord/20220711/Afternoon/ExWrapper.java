package Afternoon;

//와퍼 <-- 기본형을 객체로 다루기위한 클래스
import java.util.ArrayList;
import java.util.Iterator;

public class ExWrapper {
	public static void main(String[] args) {
		Integer i = new Integer("100");
		System.out.println(i);
		System.out.println("----------");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(new Integer(300));

		for (int num : list) {
			System.out.println(num);
		}

		int n1    = Integer.parseInt("1000");
		double n2 = Double.parseDouble("23.33");
		

	}
}
