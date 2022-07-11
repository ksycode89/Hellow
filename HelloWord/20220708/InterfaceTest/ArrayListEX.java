package InterfaceTest;

import java.util.ArrayList;

public class ArrayListEX {
	public static void main(String[] args) {
		Employee[] empAry = new Employee[10];
		empAry[0]= new Employee();
		empAry[0]= null;
		empAry[0]= new Employee();
		
		for(int i=0; i<empAry.length; i++) {
			System.out.println("enpAry["+i+"}");
		}
		
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee());
//		empList.remove(0);
		empList.set(0, new Employee());
		empList.add(new Employee());
		System.out.println(empList.get(0));
		
		for(int i=1; i<empList.size(); i++) {
			System.out.println("enpList["+i+"}");
		}
	}

}
