package ExMoring;

import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		int[] intAry = new int[2];
		Scanner scn = new Scanner(System.in);

		try {
			intAry[0] = (int) ((Math.random() * 100) + 1);
			intAry[1] = (int) ((Math.random() * 100) + 1);

			intAry[2] = scn.nextInt();
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("배열초과");
		} catch (NumberFormatException c) {
			System.out.println("숫자를 입력하세요.");
		}catch(Exception y){
			System.out.println("알수없는 예외");
		}
	}
}
