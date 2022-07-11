package Afternoon;

public class BoxingUnBoxing {
public static void main(String[] args) {
	int value1 = Integer.parseInt("10");
	String value2 =String.valueOf(10);
	String value3 = "10";
	Integer value4=new Integer(10);
	
	
	System.out.println(value1==value4);
	System.out.println(value2==value3);
	System.out.println("벨류2 :"+value2);
	System.out.println("벨류3 :"+value3);
}
}
