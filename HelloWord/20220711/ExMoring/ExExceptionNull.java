package ExMoring;

import java.util.ArrayList;

public class ExExceptionNull {
public static void main(String[] args) {
	ArrayList<String> nulls = new ArrayList<String>();
		nulls.add("ㅁ");
		nulls.set(0, null);
	try {	

	
	}catch(NullPointerException e) {
		System.out.println(e.getMessage());
	
	}System.out.println(nulls.get(0));	

	String name= "홍길동";
	name = null;
	
	try {
		System.out.println(name.toString());
		System.out.println("출력");
		
	}catch(NullPointerException e) {
//		e.printStackTrace();//오류 내용출력
	}
System.out.println("end");

}
}
