package FriendAdressBook;

public class FriendAcd extends Friend {
	private String SchoolName;
	private String major;

	public FriendAcd() {
		super();
	}

	public FriendAcd(String schoolName, String major) {
		super();
		this.SchoolName = schoolName;
		this.major = major;
	}

	public FriendAcd(String name, String tell, String schoolName, String major) {
		super(name,tell);
		this.SchoolName = schoolName;
		this.major = major;
		
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "[이름은 " + getName() + ", 전화번호는 " + getTell() + ", 학교의 이름은 " + SchoolName
				+ ", 전공은 " + major + "]";
	}

	public String check() {
		
		return "학교";
	}
	

}
