package co.edu;

public class IfCondition {

	public static void main(String[] args) {
		int n = 6;
		if (n % 2 == 0 || n % 3 == 0) {
			System.out.println("2 and 3 are Dra");
		}
		if (n % 2 == 0) {
			System.out.println(n + "= is even");
		} else {
			System.out.println(n + "= is odd even");
		}

		if (n % 2 == 0 || n % 3 == 0) {
			System.out.println("2 and 3 are Dra");
		} else if (n % 2 == 0) {
			System.out.println("2's Dra");
		} else if (n % 3 == 0) {
			System.out.println("3's Dra");
		} else {
			System.out.println("2's or 3's are not Dra");
		}

		int score = 80;
		String grade ;
		
		if (score >= 90) {
			System.out.println("A");
			grade = "A";
		}else if (score >= 80) {
			System.out.println("B");
			grade = "B";
		}else if (score >= 70) {
			System.out.println("C");
			grade = "C";
		}else {
			System.out.println("D");
			grade = "D";
		}
		System.out.println("점수는"+score+"이고"+"등급은"+grade+"입니다.");
		
	}
}