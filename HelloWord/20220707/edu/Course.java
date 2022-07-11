package edu;
//StudentMain 에서 사용
public class Course {
	private String tname;
	private String bname;
	private Student[] students;

	public Course() {
		super();
	}

	public Course(String tname) {
		this.tname = tname;
	}

	public Course(String tname, String bname, int StudentNum) {
		this.tname = tname;
		this.bname = bname;
		this.students = new Student[StudentNum];

	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void getStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].info();
			}
		}
	}

	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}

	public void info() {
		System.out.println("선생의 이름은 " + tname + "반의 이름은 " + bname + "입니다."); 
	}

	// 탑점수 학생
	public  Student getMaxStudent() {
		int max =0;
		Student student = null;
		for ( int i = 0; i < students.length; i++) {
			if (students[i] != null &&students[i].getScore() > max) {
				max = students[i].getScore();
				student = students[i];
			}
		}return student;
		
	}
	public double getAvgScore() {
		double avg = 0;
		int sum = 0;
		int num = 0;
		for (int i=0; i<students.length; i ++) {
			if(students[i] !=null) {
			sum += students[i].getScore();
			num =i+1;
			
			}
		}avg=(double)sum/num;
		return avg;
	}
	
	
	
}
