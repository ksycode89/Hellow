package Collect;

import java.awt.image.AffineTransformOp;
import java.util.ArrayList;
import java.util.Scanner;





public class BoardApp {

	public static void main(String[] args) {
		BoardDAO app = BoardDAO.getInstance();
		Scanner scn = new Scanner(System.in);
		int empNum=0;
		
		
		
		while (true) {

			System.out.println("<1.목록 2.등록 3.조회 4.삭제 5.종료>");
			System.out.print("선택 >");
			int selec = Integer.parseInt(scn.nextLine());

			if (selec == 1) {
			System.out.println(app.list.toString());
			} else if (selec == 2) {
				System.out.print("제목입력");
				String title = scn.nextLine();
				System.out.println("작성자입력");
				String writer = scn.nextLine();
				System.out.println("내용입력");
				String content = scn.nextLine();
				app.add(new Board(title, writer,content));
			

			} else if (selec == 3) {
				System.out.println("찾으실 작성자의 이름을 입력하세요");
				String ser = scn.nextLine();
				System.out.println(app.search(ser));
				
			} else if (selec == 4) {
				System.out.println("삭제할 타이틀을 입력하세요.");
				String ser2 = scn.nextLine();
				app.remove(ser2);
			} else if (selec == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("값이 이상합니다.");
			}

		}
	}

}
