package edu;



public class Exmethod {
	
	public static void main(String[] args) {
	
	sum(10,20);
	
	int result = sum2(5,10);
	System.out.println("결과값은"+result);
	result = sum2(sum2(3,5),sum2(3,7));
	System.out.println("결과값은"+result);
	double result2 = avgW(179.5);
	System.out.println("적정몸무게는 "+result2+"Kg입니다.");
	System.out.printf("삼각형의 넓이는 %.2f 입니다 ",tri(23.4,12.2));
		
	
	
	
	
	
	
}
	
	public static void sum(int a1, int a2){
		int result = a1*2+a2*3;
		System.out.println("결과"+result);
		
	}
	
	public static int sum2(int a1, int a2) {
		int result = a1*2 + a2*3;
		return result;
	}
	/// 키*0.9
	public static double avgW(double hight){
		double result = (hight-100)*0.9;
		return result;
	}
	public static  double tri(double a, double b) {
		double result = a*b/2;
			return result;
	}
	
	
	
	
}
