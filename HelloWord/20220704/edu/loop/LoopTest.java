package edu.loop;

public class LoopTest {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=10; i++) {
			if(i %2 == 0) {
			sum = sum + i;
			System.out.println("i값 : "+i+", sum의 값 "+sum);}
		}System.out.println("짝수의 합 : "+sum);

		///////////////////////////////////////////////////////
		
		int result = 0;
		
		for (int i=1; i<11; i +=2) {
			
			result += i;
			System.out.println("i의 값들 : " + i);
			
		}	System.out.println("홀수누적값 : "+ result);
		
		
		int tt = 0;
		for (int i=10; i>=1; i--) {
			tt += i;
			System.out.println("i의 값들 :"+ i);
			
		}System.out.println("총합 :"+tt);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


