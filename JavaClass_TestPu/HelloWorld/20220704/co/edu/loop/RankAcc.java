package co.edu.loop;

import java.util.Scanner;

public class RankAcc {
	public static void main(String[] args) {
		// 1.입금 2. 출급 3. 잔액 4.종료.
		Scanner scn = new Scanner(System.in);

		int inMon = 0;

		while (true) {
			System.out.println("1:입금,2:출금,3:잔액,4:종료를 입력해주세요.");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("입금액 입력 >> ");
				int atm = scn.nextInt();
				if ((atm + inMon) <= 100000 && (atm + inMon)>0 ) {
					inMon += atm;
					System.out.println("<정상입금>");
					continue;
				} 
				if (atm < 0) {
					System.out.println("입금금액은 0보다 커야합니다.");
					continue;
				}
					System.out.println("<과한금액>");
				

			}

			else if (menu == 2) {
				System.out.print("출금금액 >>");
				int atm = scn.nextInt();
				if (inMon > atm) {
					inMon -= atm;
				} else {
					System.out.println("<금액이 부족합니다.>");
				}
			} else if (menu == 3) {
				System.out.println("잔액은" + inMon+"원");

			} else if (menu == 4) {
				System.out.println("<종료합니다.>");
				break;
			} else {
				System.out.println("<잘못된 메뉴입니다.>");

			}

		}
	}

}
