package edu;

//클래스 StudentMain에서 사용

public class Student {
	
		private String sno;
		private String name;
		private int score;

		
		public Student() {
			super();
		}
		
		public Student(String sno, String name, int score) {
			this.sno = sno;
			this.name = name;
			this.score= score;
		}
		
		
		
		
		public void setSno(String sno) {
			this.sno= sno;
		}
		public String getSno() {
			return this.sno;
		}
		
		
		public void setName (String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}

		public void setScore(int score) {
			this.score = score;
		}
		public int getScore() {
			return this.score;
		}


		
		public void info() {
			System.out.println("[학점은" + sno + ", 이름은" + name + ", 점수는" + score + "]"); 
		}

	
		
}
