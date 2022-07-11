package FriendAdressBook;

import java.util.Scanner;

public class FriendApp {
	Scanner scn = new Scanner(System.in);
	FriendFunction fuc = new FriendFunction();
	Friend [] friends = new Friend[10];
	
	public void start() {
		
		while(true) {
			int select =0;
			
			while(true) {
//				System.out.println("1.이름 2.목록 3.검색 4.수정 5.종료");
				fuc.timerShow("1.이름 2.목록 3.검색 4.수정 5.종료");
			try {
		
			 select = Integer.parseInt(scn.nextLine());
			 break;
			}catch(Exception e) { System.out.println("1~5중에 선택해주세요.");}
			}
			if(select ==1) {
				System.out.println("이름을 출력합니다.");
				fuc.add(); 
			}else if(select ==2) {
				System.out.println("목록을 출력합니다.");
				fuc.list();
			}else if(select ==3) {
				System.out.println("검색을 시작합니다.");
				fuc.serach();
			}else if(select ==4) {
				System.out.println("수정을 시작합니다.");
				fuc.fix();
			}else if(select ==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 입력값입니다.");
			}
			
						
		}//와일문 끝
		
		
	}//start 메서드 끝

}
