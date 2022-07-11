package edu;

class Person2 {
	final String ssn;
	String name;
	
	public Person2(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
//클래스는 파일 하나당 하나 
public class FinalEx {
	public static void main(String[] args) {
		String name = "김상영";
		name = "산욘킴";

		final int num = 10;
//	num =  20; //final 값변경 불가.
		Person2 p = new Person2("001254-2368791", "어린이");
		
	}

}

