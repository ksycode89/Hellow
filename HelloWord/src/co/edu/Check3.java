package co.edu;

import java.util.*;

public class Check3 {

	public static void main(String[] args) {
		Check10 a = new Check10();
		Check11 b = new Check11();
		Check12 c = new Check12();
		Gugudan d = new Gugudan();
		Gugudan2 e= new Gugudan2();
	//	a.test1();
	//  b.test2();
	//	c.testIf();
		e.gugu(3);
	}

}

class Check10{
	int var1 = 10;
	int var2 = 3;
	int var3 = 14;
	double var4 = var1*var1*Double.parseDouble(var2+"."+var3);
	
	public void test1(){
	System.out.println(var4);
	}
	
	
}
class Check11{
	
	
		public void test2() {
		Scanner scn = new Scanner(System.in);
		System.out.print("아이디 :");
		String name = scn.nextLine();
		
		System.out.print("패스워드 :");
		String strpsw = scn.nextLine();
		int psw = Integer.parseInt(strpsw);
		
		if(name.equals("java")) {
			if(psw == 12345) {
				System.out.println("[로그인 성공]");
			}else {
				System.out.println("[패스워드x]");
			}
			
		}else {System.out.println("[아이디x]");
	}

	}
		
		
}
	
class Check12{
	
	public void  testIf() {
		int num = (int)(Math.random()*6)+1;
		
		if(num==1) {
			System.out.println("1번");
		}else if (num==2) {
			System.out.println("2번");
		}else if (num==3) {
			System.out.println("3번");
		}else if (num==4) {
			System.out.println("4번");
		}else if (num==5) {
			System.out.println("5번");
		}else if (num==6) {
			System.out.println("6번");
		}
			}
		
	}

class Gugudan {
	
	public void gugu() {
		
	for (int i=2;i<=9;i++) {
		System.out.println(i+"단");
		for(int n=2;n<=9;n++) {
		System.out.println(i+"x"+n+"="+i*n);
		
		}
		
		
	}
}

}

class Gugudan2{
	
	public static void  gugu(int n1) {
		System.out.println(n1+"단");
		
		for(int i=1;i<=9;i++) {
		 System.out.println(n1+"x"+i+"="+n1*i);
		} 
			
	}
	
}



