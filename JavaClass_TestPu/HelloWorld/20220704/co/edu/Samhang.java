package co.edu;

import java.util.Scanner;

public class Samhang {

	public static void main(String[] args) {
		System.out.print("점수을 입력하세요.");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		String grade ;
		
		String result = (a<=100 && a>=90 ? "A": "B");
		String result2 = (a<=79 && a>=70 ? "C" : "D");
		
		if(a >=80) {
			System.out.println(result);

		}else{
			System.out.println(result2);
		}
		System.out.println("점수는"+a+"이고 등급은"+result+"입니다.");
	}
	
	}

