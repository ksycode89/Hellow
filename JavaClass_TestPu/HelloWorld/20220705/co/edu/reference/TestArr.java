package co.edu.reference;

public class TestArr {
	public static void main(String[] args) {
		int[][] cls = new int[][] { { 80, 79 }, { 85, 84 }, { 83, 90 } };
		int sum = 0;
//		System.out.println(cls.length); -길이

		for (int i = 0; i < cls.length; i++) {
			for (int j = 0; j < cls[i].length; j++) {
				System.out.println(cls[i][j]);
			}
		}

		for (int i = 0; i < cls.length; i++) {
			System.out.println("a반" + cls[i][0]);
			sum += cls[i][0];
//		System.out.println("a반평균 : "+ sum/cls.length);
		}
		System.out.println("a반평균 : " + sum / cls.length);
		int sum2 = 0;
		for (int i = 0; i < cls.length; i++) {
			System.out.println("b반" + cls[i][1]);
			sum2 += cls[i][1];
//			System.out.println(sum);
		}
		System.out.println("b반평균 : " + sum2 / cls.length);

	}
}
