package edu;

public class ExDateType2 {
	public static void main(String[] args) {
		int num = 100;
		int num2 = 100;
		Test6 c = new Test6();
		
		
		String name =  new String("또치");
		String name2 = new String("또치");
		String name3 = "또치";
		name3.toString();
		System.out.println(num == num2);
		System.out.println(name ==name2);
		System.out.println(name.equals(name2));
		System.out.println(name+" "+name2+" "+name3);
//		System.out.println(c.a);
		
		int result = 0;
//		name = null;
		System.out.println(name.equals(name2));
		
	}
}

class Test {
	int A = 99;
	String a = "a";
}
