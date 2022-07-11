package co.edu.emp;

import java.util.*;

//저장 등록 조회 리스트
public class EmployeeList {

	private static EmployeeList instance = new EmployeeList();
	private EmployeeList(){
		
	}	
	
	public static EmployeeList getInstance() {
		return instance;
	}
	//사원담는 배열
	Employee[] list;
	int empNum;  //사원의 위치
	Scanner scn = new Scanner(System.in);
	
//	리스트 초기화 구문
//	private EmployeeList(Employee[] list) {
//		this.list=list;
//		this.empNum=list.length;
//	}
	//입력
	public void init() {
		System.out.println("사원수입력 >");
		int num = Integer.parseInt(scn.nextLine());
		list = new Employee[num];
	}
	
	public void input() {
		if(empNum >= list.length) {
			System.out.println("입력을 초과하여 종료됩니다.");
		
			return;
		}
		
		
		System.out.printf("%d+1 사번 >",empNum);
		int no = Integer.parseInt(scn.nextLine());
		
		System.out.print("이름 >");
		String name = scn.nextLine();
		
		System.out.print("급여 >");
		int sal = Integer.parseInt(scn.nextLine());
		//이해요망 ↓
		list[empNum++] = new Employee(no,name,sal);
				
	}
	//출력
	public void printList() {
		for(int i=0;i<empNum; i++) {
			System.out.printf("%5d %10s %7d\n",list[i].getEpId(),list[i].getEpName(),list[i].getSalary());
		}
				
	}//printList끝
	public void search() {
		System.out.println("사원번호를 입력 >");
		int epId = Integer.parseInt(scn.nextLine());
		int check;
		for(int i  =0; i <empNum; i++) {
			if (epId == list[i].getEpId()) {
				System.out.println(list[i].getDetail());
				break;
			}else if (i == empNum -1) {
				System.out.println("없는 사원 번호입니다.");
			}
				
		}
		
		
	}//serach 끝
	private int getLastInfo(int mon) {
		switch(mon) {
		case 1: case 3: case 5: case 7: case 8: case 9: case 11:
			return 31;
		
		case 4: case 6: case 10: case 12:
		return 30;
		
		case 2 :
			return 28;
		default:
		return 0;
		
		
		}
	}
	
	private int getDayInfo(int mon) {
		switch(mon) {
		case 1: case 10:
			return 6;
		case 2: case 3: case 11:
			return 2;
		case 4:
			return 5;
		case 6:  
			return 3;
		case 7: 
			return 5;
		case 8:
			return 1;
		case 9 :  case 12:
			return 4;
			
		default:
		return 0;
		
		
		}
		
		
		
	}//showCalenar getDay,getLast 끝
	public void showCalendar() {
		
		System.out.println("원하는 달력을 입력하세요");
		int month = Integer.parseInt(scn.nextLine());
		String [] days = {" sum "+"mon "+"tue "+"wed "+"thr "+"fri"+" sat "};
		int firstDay = getDayInfo(month);
		int lastDate = getLastInfo(month);
	
		int day =7;
		//첫주
		for(int i =0; i<days.length;i++) {
			System.out.printf("%4s",days[i]);
		}System.out.println();
		
		//중간채우기
		for(int i =0; i<firstDay;i++) {
			System.out.printf("%4s"," ");
		}
			
		//마지막주	
		for(int i =1; i<=lastDate;i++) {
			System.out.printf("%4s",i);
			if((i+firstDay)%7==0) {
				System.out.println();
			}
		
		}System.out.println();
		System.out.println();
	}//showCalendar 끝
	
	
	
}//클래스끝
