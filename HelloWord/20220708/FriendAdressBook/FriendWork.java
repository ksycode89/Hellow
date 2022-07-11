package FriendAdressBook;

public class FriendWork extends Friend{
	private String company;
	private String department;
	
	public FriendWork()	{
		super();
	}	

		
	public FriendWork(String name, String tell, String company, String department) {
		super(name,tell);
		this.company=company;
		this.department=department;
		
	}
	public String getCompany() {
		return this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRespon() {
		return this.company;
	}
	public void setRespon(String respon) {
		this.department = respon;
	}
	@Override
	public String toString() {
		return "[이름은 " + getName() + " , 전화번호는 " + getTell() + " , 회사는 " + company + ", 직책는 "
				+ department + "]";
	}
	public String check( ) {
		return "일";
	}
	

	
}
