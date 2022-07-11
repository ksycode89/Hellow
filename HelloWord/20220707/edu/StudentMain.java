package edu;

//Student , Course가 이용됨
public class StudentMain {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		Student kim = new Student();

		/// 학생 kim
		kim.setSno("22-001");
		kim.setName("김상영");
		kim.setScore(80);
		kim.info();
		// 학생 park
		Student park = new Student("20-002", "박준현", 85);
		park.info();
		// 학생 le
		Student lee = new Student("20-003", "이현성", 91);

		// 선생추가
		Course course = new Course("이창호", "Java-5", 21);
		System.out.println("쌤이름 : " + course.getTname());
		course.info();

		course.addStudent(kim);
		course.addStudent(park);
		course.addStudent(lee);
		// 리스트 보기
		course.getStudents();

		System.out.print("최고점의 학생은 : ");
		course.getMaxStudent().info();
		System.out.printf("학생들읜 평균값은 %.2f 입니다.", course.getAvgScore());

	}
}
