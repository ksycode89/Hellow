package co.deu;

import java.util.*;

public class Tset5 {

	public static void main(String[] args) {
	  
		
		Scanner scan = new Scanner(System.in);
		
//		String input = scan.nextLine();
//		int input    = scan.nextInt();
//		System.out.printf("입력값은 %s" ,input);
		
		
		
		System.out.println("첫(숫자) 값을 넣으렴");
		int num = scan.nextInt();
		
		System.out.println("두번(숫자) 째  값을 넣으렴");
		int num2 = scan.nextInt();
		
		int result;
		
		if (num>num2) {  
				result = num-num2;
	 	} else {
			    result = num2-num;
					  }
		
		System.out.printf("입력 값 %d과 %d의 차이는 %d입니다.",num,num2 ,result);
		}
			
		
		
		
		
		
	}


