package co.edu;

import java.util.Scanner;

public class asdf {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("아이디 :");
		String name = scn.nextLine();
		
		System.out.print("패스워드 :");
		String strpsw = scn.nextLine();
		int psw = Integer.parseInt(strpsw);
		
		if(name.equals("java")) {
			if(psw == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("패스워드x");
			}
			
		}else {System.out.println("아이디x");
	}

	}
}