package co.deu;

public class Test3 {

	public static void main(String[] args) {
//		String a = " 홍길동 ";
		
//		System.out.println("내이름은 \"홍길동\" 입니다.");
//		System.out.println("{\"이름\":\"홍길동\", \"나이\":20}");
		
		int    n  = Integer.parseInt("100");
		double n2 = Double.parseDouble("12223.4");
		double n3 = Double.parseDouble("1223.4");
		 
		int result     = sum(10, 20);
		double result2 = sum(n,  n2);
		double result3 = sum(n3, n2);
//		
		
		System.out.println(n);
		System.out.println(n2);
		System.out.println("합은="+ result);
		System.out.println("합은="+ result2);
		System.out.println("합은="+ result3);
		System.out.printf("%s %d", "김",15);
		
		 String name    = "이름";
		 int    age     = 34;
		 double  weight = 66.6;
		 
		 System.out.printf("나의이름은 %S이는 \n나이는 %d \n무게는 %.2f입니다",name,age,weight);
	}



	public static  int sum (int n1, int n2) {
		 int sum  = n1+n2;
		return sum;
	}
	
	public static double sum (int n1, double n2) {
		double sum = n1+n2;
		return sum;
	}
	
	public static double sum(double n1, double n2) {
		double sum =n1-n2;
		return sum;
}
	
	
}

