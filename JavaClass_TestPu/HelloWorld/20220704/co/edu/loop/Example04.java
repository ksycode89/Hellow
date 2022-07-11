package co.edu.loop;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		int ran = (int) (Math.random() * 100) + 1;
		
		boolean b = true;
		
		while (b) {
			
			
			System.out.print("값을 넣어주세요 > ");
			
			int tmp = scn.nextInt();
			if (ran > tmp) {

				System.out.println("더 큰수를 넣어주세요.");
			} else if (ran < tmp) {
				System.out.println("더 작은 수를 넣어주세요.");
			} else {
				System.out.println("정답입니다.");
				break;
			}

		}

		System.out.println("랜덤수는"+ran);

	}
}
