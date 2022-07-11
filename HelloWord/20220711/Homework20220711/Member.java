package Homework20220711;

public class Member {
	private String id;
	private String name;
	
	public Member() {
		super();
	}

	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "id는 " + id + ", name은 " + name + "]";
	}


}
