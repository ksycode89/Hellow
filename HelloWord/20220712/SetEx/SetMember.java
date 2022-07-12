package SetEx;

import java.util.HashSet;
import java.util.Set;

class Member{
	private int id;
	private String name;
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "맴버의 [id는 " + id + ", name은 " + name + "]";
	}
	
	
	@Override
	public int hashCode() {
		
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem = (Member)obj;
			return this.id == mem.id && this.name.equals(mem.name);
		}
		return  false;
	}
	
}



public class SetMember {
	public static void main(String[] args) {
		Set<Member>members=new HashSet<Member>(5);
		members.add(new Member(10,"김상영"));
		members.add(new Member(20,"김민수"));
		members.add(new Member(30,"김상영"));
		members.add(new Member(20,"김민수"));
		
//		members.clear();
		if(members.isEmpty()) {
			System.out.println("컬렉션이 비어있음");
		}
		for(Member member : members) {
			System.out.println(member);
		}
	
		
	}
	
		
}
