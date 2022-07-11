package test11;

import java.util.Scanner;

public class WooriApp {
	public static void main(String[] args) {
		Dao db = new Oracle();//new Mysql();
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			System.out.println("1.입력 2.수정 3.삭제 4.종료");
			System.out.print("선택>");
			
			int menu = scn.nextInt();
			
			if (menu == 1) {
				db.insert();
			} else if (menu == 2) {
				db.update();
			} else if (menu == 3) {
				db.delete();
			} else if (menu == 4) {
				db.off(); break;
			}else {System.out.println("입력값이 잘못되었습니다.");}

		} // while
	}
}
