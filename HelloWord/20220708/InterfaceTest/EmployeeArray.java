package InterfaceTest;

import java.util.Scanner;

//기능구현
public class EmployeeArray implements EmployeeList {
	
	private static EmployeeArray instance = new EmployeeArray();
	
	//생성자
	private EmployeeArray() {}
	public static  EmployeeArray getInstance() {
		return instance;
	}
	//사원정보
	Employee[] list;	
	int empNum;
	Scanner scn = new Scanner(System.in);
	
	
	@Override
	public void init() {
		System.out.println("넣으실 사원수를 입력하세요.");
		int num = Integer.parseInt(scn.nextLine());
		list = new Employee[num];
	}
	@Override
	public void input() {
		System.out.printf(empNum+"의 사원");
		int no = Integer.parseInt(scn.nextLine());
		
		System.out.println("이름을 입력 : ");
		String name = scn.nextLine();
		
		System.out.println("급여를 입력 : ");
		int salary = Integer.parseInt(scn.nextLine());
		
		list[empNum++]= new Employee(no,name,salary);
	}
	@Override
	public Employee search(int empId) {
		for(int i=0; i<empNum; i++) {
			if(list[i].getEpId() == empId) {
				return list[i];
			}
		}
		
		return null;
	}
	@Override
	public void printList() {
		for(int i=0; i<empNum; i++) {
		System.out.printf("%5d %10d %7d \n ",list[i].getEpId(),list[i].getEpName(),list[i].getSalary());
			
		}
	}

}
