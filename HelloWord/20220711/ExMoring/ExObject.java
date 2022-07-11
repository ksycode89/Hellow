package ExMoring;
class Member{
	String id;
	int age ;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
		boolean a1 = this.id.equals(((Member) obj).id);
		boolean a2 = this.age == ((Member) obj).age;
		return a1&&a2;
		
		
		}	
		return false;
	}
	@Override
	public String toString() {
		
		return "id는 "+this.id+"age는  "+this.age+"입니다.";
	}
}


public class ExObject {
 public static void main(String[] args) {
	Object obj1 = new 	Object ();
	Object obj2 = new 	Object ();
	
	System.out.println(obj1.equals(obj2));
	System.out.println(obj1.toString());
	String name1 =new String("홍길");
	String name2 =new String("홍길");
	System.out.println(name1.equals(name2));
	System.out.println(name1.toString()+" : 스트링클래스");
	Member mem1 = new Member();
	System.out.println(mem1.toString());
	mem1.id = "user1";
	mem1.age = 31;
	
	Member mem2 = new Member();
	mem2.id= "user1";
	mem2.age= 31;
	
	System.out.println(mem1.equals(mem2));
			
}
}
