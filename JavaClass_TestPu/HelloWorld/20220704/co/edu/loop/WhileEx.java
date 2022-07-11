package co.edu.loop;

public class WhileEx {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			System.out.println("i값 :" + i);
			i++;
			sum = sum + i;

		}
		System.out.println(sum);
		boolean a = true;
		while (a) {
			int num = (int) (Math.random() * 10) + 1;
			System.out.println("num값:" + num);
			if (num == 5) {
				a = false;
			}
		}
		System.out.println("end");

		while (true) {
			int num = (int) (Math.random() * 10) + 1;

			System.out.println("num값:" + num);
			if (num == 5) {
				break;

			}
		}System.out.println("end2");

	}

}
