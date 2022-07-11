package Homework20220711;

import java.util.Objects;

public class Test0711 {

	private String studentNum;
	
	public Test0711() {
		super();
	}
	public Test0711(String studenNum) {
		this.studentNum = studenNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(getStudentNum());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj == null ||getClass() != obj.getClass())return false;
			
		Test0711 other =(Test0711)obj;	
		return (this.getStudentNum() == other.getStudentNum());
	}
}