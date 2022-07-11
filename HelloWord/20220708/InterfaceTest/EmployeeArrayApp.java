package InterfaceTest;

import java.util.Scanner;

public class EmployeeArrayApp {
	public static void main(String[] args) {
		
		EmployeeList app = EmployeeArray.getInstance();
	
		Scanner scn = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1.사원수2.정보입력 3.사원리스트 4.사원검색 5.종료");
			System.out.print("선택 >");
			int select =scn.nextInt();
		
			if(select == 1) {
			
				app.init();
			}else if(select == 2) {
				
				app.input();
			}else if(select == 3) {
				System.out.println("사원들을 출력합니다.");
				app.printList();
			}else if(select ==4) {
				System.out.println("검색할 사번 >");
				int empId = scn.nextInt();
				Employee emp = app.search(empId);
				System.out.println(emp.getDetail());
			}else if(select ==5) {
				
			}else {}
			
			
		}
		
	}
}
