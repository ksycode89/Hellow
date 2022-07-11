package edu;

public class FriendTest {
public static void main(String[] args) {
	Friend fri1 = new Friend();
	

//	fri1.name="박카스";
	fri1.setName("김쿵쿵");
//	fri1.tell="010-2154-8798";
//	fri1.email="bacass@beer.siwon";
//	fri1.birth= 060705;
//	fri1.high = 199.5;
	fri1.setHeight(197.5);
//	fri1.weight = 99;
	fri1.setBirth(111);
	
	fri1.getBirth();
		System.out.println(fri1);
	fri1.showInfo();
	
}
}
