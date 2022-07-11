package InterfaceTest;

import java.util.ArrayList;

//배열로 만든걸 컬렉션 기반으로 기능 구현
public class EmployeeArrayList implements EmployeeList {
//	private  static EmployeeList instance = new EmployeeArrayList();
	
	ArrayList<Employee> list = new ArrayList<Employee>();
	int empNum;
	
	@Override
	public void init() {
		list.add(new Employee());
	}

	@Override
	public void input() {
		
		
	}

	@Override
	public Employee search(int empId) {
		
		return null;
	}

	@Override
	public void printList() {
		
		
	}
	
	
	
		
}
