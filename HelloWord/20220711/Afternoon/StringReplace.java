package Afternoon;

public class StringReplace {
	
	public static void main(String[] args) {
		
	String old = "나는 자바를 잘하고 싶습니다.";
	String newone = old.replace("자바를", "프로그래밍을");
	System.out.println("변경전 : "+old);
	System.out.println("변경후 : "+newone);
	
	System.out.println("-------------------");
		String num = "896565-1789488";
		
		String FirN= num.substring(0,6);
		System.out.println("앞6자리 : "+FirN);
		String lastN = num.substring(7);
		System.out.println("뒷6자리 : "+lastN);
	
		String str1 = "Java is Good";
		String str2 = "JAVA IS GOOD";
		
		System.out.println("소문자로 " +str1.toLowerCase());
		System.out.println("대분자로 " +str1.toUpperCase());
		
		System.out.println("str1과 str2는 "+str1.toLowerCase().equals(str2.toLowerCase()));
		System.out.println("str1과str2는 "+str1.equals(str2));
		
		System.out.println("----------------------------------");
		//공백
		String a = "  김상영";
		String b= "김 상 영";
		String c = "김상 영 ";
		System.out.println("  김상영 : "+a.trim()+"\n김 상 영: "+b.trim()+"\n김상 영 : "+c.trim()+"빈칸체크");
		
	}
	
	
	
	}

