package FriendAdressBook;

public class Friend {
	
	private String name;
	private String tell;
//생성자
	public Friend() {
		super();
	}
//풀생성자
	public Friend(String name, String tell) {
		super();
		this.name = name;
		this.tell = tell;
	}
//게터세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}
//게터세터끝
	@Override
	public String toString() {
		return "[이름은 " + name + ", 전화보호는 " + tell + "]";
	}
	public String check( ) {
		
		return "일반";
	}
	
	
	
}
