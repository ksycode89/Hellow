package edu;

public class Friend {
	private String name ;
	String tell;
	String email;
	int birth;
	double high;
	double weight;
	
	public String getTell() {
		return tell;
	}


	public void setTell(String tell) {
		this.tell = tell;
	}


	public String toString() {
		return "Friend [name=" + name + "]";
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getBirth() {
		return birth;
	}


	public void setBirth(int birth) {
		this.birth = birth;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public Friend() {
		super();
	}
	

	public void showInfo() {
		
		System.out.printf("이름은 %s이고 키는 %.2f입니다. \n",name,high);
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void setHeight(double height) {
		if(height <0) {
			System.out.println("입력한값이 잘못되었습니다.");
			this.high=165.0;
		}else {
			this.high = height;
		}
	}
	public  double getHeight() {
		return high;
		
	}

	
	
	
}
