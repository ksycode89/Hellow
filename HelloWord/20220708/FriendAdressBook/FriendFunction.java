package FriendAdressBook;

import java.util.Scanner;

public class FriendFunction {
	Friend[] friends = new Friend[10];
	int friendNum;
	Scanner scn = new Scanner(System.in);

	public void add() {
		int select=0;
		while(true) {
		System.out.println("1.일반 2.학교 3.회사");
		System.out.print("입력 : ");
		
		
		try {
			select = Integer.parseInt(scn.nextLine());
			break;
							
		 }catch(Exception a) {
			System.out.println("1,2,3중에 선택하세요.");
			}
		}	//add while구문	
		
		

		System.out.println("이름을 입력하세요");
		String name = scn.nextLine();
		System.out.println("휴대폰번호를 입력하세요.");
		String tell = scn.nextLine();

		if (select == 2) {
			System.out.println("학교 이름을 입력하세요.");
			String SchoolName = scn.nextLine();
			System.out.println("전공을 입력하세요.");
			String major = scn.nextLine();
			friends[friendNum++] = new FriendAcd(name, tell, SchoolName, major);

		} else if (select == 3) {
			System.out.println("회사 이름을 입력하세요.");
			String company = scn.nextLine();
			System.out.println("직책을 입력하세요.ㅣ");
			String department = scn.nextLine();
			friends[friendNum++] = new FriendWork(name, tell, company, department);

		} else if (select == 1) {
			friends[friendNum++] = new Friend(name, tell);
			System.out.println("입력을 종료합니다.");
		} 

	}// add끝

	public void list() {
		for (int i = 0; i < friendNum; i++) {
			System.out.println(friends[i].toString());
		}
	}

	public void serach() {

		System.out.println("정보를 원하는 사람의 이름을 입력하세요.");
		String search = scn.nextLine();
		for (int i = 0; i < friendNum; i++) {
			if (friends[i] != null && friends[i].getName().equals(search)) {
				System.out.println("찾습니다.");
				System.out.println(friends[i].toString());
			}else {
				System.out.println("존재하지않는 정보입니다.");
			}
		}

	}

	public void fix() {
		int select = 0;
		System.out.println("수정할 사람의 이름을 입력하세요.");
		String search = scn.nextLine();
		for (int i = 0; i < friendNum; i++) {
			if (friends[i] != null && friends[i].getName().equals(search)) {
				System.out.println("수정을 시작합니다.");
			
				while(true) {
				System.out.println("1.일반 2.학교 3.회사");
				System.out.print("입력 : ");
			
					try {
						select = Integer.parseInt(scn.nextLine());
						break;
										
					 }catch(Exception a) {
						System.out.println("1,2,3중에 선택하세요.");
						}
					}

				System.out.println("이름을 입력하세요");
				String name = scn.nextLine();
				System.out.println("휴대폰번호를 입력하세요.");
				String tell = scn.nextLine();

				if (select == 2) {
					System.out.println("학교 이름을 입력하세요.");
					String SchoolName = scn.nextLine();
					System.out.println("전공을 입력하세요.");
					String major = scn.nextLine();
					friends[i] = new FriendAcd(name, tell, SchoolName, major);
					break;
				} else if (select == 3) {
					System.out.println("회사 이름을 입력하세요.");
					String company = scn.nextLine();
					System.out.println("직책을 입력하세요.ㅣ");
					String department = scn.nextLine();
					friends[i] = new FriendWork(name, tell, company, department);
					break;
				} else if (select == 1) {
					friends[i] = new Friend(name, tell);
					System.out.println("입력을 종료합니다.");break;
				} else {
					System.out.println("입력값이 잘못되었습니다.");
					break;
				}

			
				
			}else {System.out.println("존재하지않는 정보입니다.");}
		}

	}//fix 끝
	
	//timer start //0.1초마다 메세지 출력 
	public void timerShow(String msg) {
		String [] message = msg.split(""); //split 잘라라 
		for (int i=0; i<message.length;i++) {
			System.out.print(message[i]);
			try {
				Thread.sleep(100);//0.1초 멈추기
			}catch(InterruptedException e){
				e.printStackTrace();
			}//
		}System.out.println();
	}
	
	
}
