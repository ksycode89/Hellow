package edu;

import java.util.Date;
import java.util.Scanner;

public class BaordApp {
	public static void main(String[] args) {
		Board[] boards = new Board[100];
		Scanner scn = new Scanner(System.in);
		
		boolean run = true;

		while(run) {
			String id ="user1";
			String password= "1212";
			System.out.println("로그인을 위해 아이디와 비밀번호를 입력하세요.");
			System.out.print("아이디 : ");
			String idSelect = scn.nextLine();
			System.out.print("비밀번호 : ");	
			String pwSelect = scn.nextLine();
			if(idSelect.equals(id) &&pwSelect.equals(password) ) {
				System.out.println("시스템으로 접속합니다.");
		     break;
			}else {
				System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
				
			}
		}
//			아이디 비번 각각체크 
//			
//			}
//			System.out.println("로그인을 위해 아이디와 비밀번호를 입력하세요.");
//			System.out.print("아이디 : ");
//			String idSelect = scn.nextLine();
//			if(idSelect.equals("user1")) {
//				
//			}else {System.out.println("아이디가 잘못되었습니다.");
//			continue;
//			}
//			System.out.print("비밀번호 : ");
//			String pwSelect = scn.nextLine();
//			
//			if(pwSelect.equals(password)){
//				System.out.println("시스템으로 접속합니다.");
//				break;
//				}else {System.out.println("비밀번호가 잘못되었습니다.");
//			continue;}
		
		
		
		
		while (run) {
			
//			String id ="user1";
//			String password= "1212";
//			System.out.println("로그인을 위해 아이디와 비밀번호를 입력하세요.");
//			System.out.print("아이디 : ");
//			String idSelect = scn.nextLine();
//			System.out.print("비밀번호 : ");	
//			String pwSelect = scn.nextLine();
//			if(idSelect.equals("user1") &&pwSelect.equals(password) ) {
//				System.out.println("시스템으로 접속합니다.");
//		     
//			}else {
//				System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
//				break;
//			}
//////////////////////////
			System.out.println("1.등록 2.조회 3.수정 4.삭제 5.리스트 6.종료");
			System.out.print("선택 ->");
			
			int select = Integer.parseInt(scn.nextLine());
			
			if (select == 1) {
				System.out.println("글 제목을 입력하세요.");
				String title = scn.nextLine();

				System.out.println("글 내용을 입력하세요.");
				String content = scn.nextLine();

				System.out.println("글 작성자를 입력하세요.");
				String user = scn.nextLine();

				Board board = new Board();
				board.setTitle(title);
				board.setContent(content);
				board.setUser(user);
				board.setDate(new Date());
				board.setView(0);
				// 비어있는 아무곳 입력
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] == null) {
						boards[i] = board;
						break;
					}

				}

			} else if (select == 2) {
				System.out.println("조회할 제목을 입력하세요.");
				String search = scn.nextLine();

				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(search)) {
						System.out.printf(
								"제목 : %s \n ==[내용]== \n %s\n===========\n작성자: %s \n" + "작성일시: %s \n조회수: %d회 \n\n",
								boards[i].getTitle(), boards[i].getContent(), boards[i].getUser(), boards[i].getDate(),
								boards[i].getView());
						int cnt = boards[i].getView();
						boards[i].setView(++cnt);
					}

					else {
						System.out.println("입력값이없습니다.");
						

					}
				}

			} else if (select == 3) {
				System.out.println("수정하실 글의 제목을 입력하세요.");
				String search = scn.nextLine();

				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(search)) {
						System.out.println("수정할 내용을 입력하세요.");
						String newcontent = scn.nextLine();
						boards[i].setContent(newcontent);
						System.out.println("수정할 제목을 입력하세요.");
						String newtitle = scn.nextLine();
						boards[i].setTitle(newtitle);
					}
//				else if() {
//					String cant = scn.nextLine();
//					
//				}
					
				}

			} else if (select == 4) {
				System.out.println("삭제하실 글의 제목을 입력하세요.");
				String search = scn.nextLine();

				for(int i =0; i<boards.length;i++) {
					if(boards[i] != null && boards[i].getTitle().equals(search)) {
//						boards[i].setContent(null);
//						boards[i].setDate(null);
//						boards[i].setTitle(null);
//						boards[i].setUser(null);
//						boards[i].setView(0);
						boards[i] = null;
						
					}else {System.out.println("해당되는 제목의 글이 존재하지 않습니다.");}
				}

			} else if (select == 5) {

				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) {
						System.out.printf(
								"제목 : %s \n ==[내용]== \n %s\n===========\n작성자: %s \n" + "작성일시: %s \n조회수: %d회 \n\n",
								boards[i].getTitle(), boards[i].getContent(), boards[i].getUser(), boards[i].getDate(),
								boards[i].getView());
					}
				}

			} else if (select == 6) {
				System.out.println("프로그램을 종료합니다.");
			} else {
				System.out.println("잘못된 입력값입니다.");
			}

		}
		System.out.println("프로그램을 종료합니다.");

	}

	}
