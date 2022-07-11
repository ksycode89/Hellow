package co.edu;

import java.util.*;

public class OPeratorExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	
		int n1 = 10;
		int n2 = 20;
		
        int result = n1+n2;
		
		result = n1 - n2;
		result = n1 + n2;
		result = n1 / n2;
		result = n1 * n2;
		result = n1 % n2;
		
//		System.out.println("입력해");
//		n1 = scn.nextInt();
//		
//		if(n1 % 2 == 0) {
//			System.out.println("짝수");
//		}else {
//		System.out.println("홀수");}
		
		result = ++n1 + n2++;
		System.out.println(result);
		result = n1 + n2;
		System.out.println(result);
		
		boolean isEven  = result %2 == 0;
		System.out.println();
		if(!isEven) {
			System.out.println("odd even");
			
		}else {
			System.out.println("even");
		}
		
		
		

 }

}

