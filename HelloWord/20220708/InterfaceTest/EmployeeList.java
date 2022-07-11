package InterfaceTest;
//기능 이름정의
public interface EmployeeList {
	
	//초기화
	public void init();
	//사원정보입력
	public void  input();
	//사번입력
	public Employee search (int empId);
	//전체출력
	public void printList();
	
	
	
	
}
