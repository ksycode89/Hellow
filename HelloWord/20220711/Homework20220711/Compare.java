package Homework20220711;

public class Compare {
	public static void main(String[] args) {
		Integer obj1 =127;
		Integer obj2 =127;
		Integer obj3 =300;
		Integer obj4 =300;
		
		System.out.println(obj1==obj2);
		System.out.println(obj3==obj4);
		System.out.println(obj4.hashCode());
		System.out.println(obj3.hashCode());
		
	}

}
