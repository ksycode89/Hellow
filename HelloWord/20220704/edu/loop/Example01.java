package edu.loop;

public class Example01 {

	public static void main(String[] args) {
		int sum,num;
		sum=0;
		
		for (int i = 1; i <= 10; i++) {
			 num = (int) (Math.random() * 10) + 1;
		

			if (num % 2 == 0) {
				sum += num;
				System.out.println(num+","+sum);
			}
		}System.out.println(sum);
		
		
		int n,s;
			s=0;
			while(s == 22) {
			for (int i=0; i<=20;i++) {
			System.out.print(i+",");
			s=i+i;
				System.out.println(s);
			}
		}System.out.println("lst "+s);
		
			
	
		
		
		
		
	}
}
