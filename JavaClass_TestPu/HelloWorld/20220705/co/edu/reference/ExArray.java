package co.edu.reference;

public class ExArray {
	public static void main(String[] args) {
		int[] inAry = new int[10];
		inAry[0] = 10;
		inAry[4] = 50;
		System.out.println("배열의 길이 " + inAry.length);

		for (int i = 0; i < 10; i++) {
			System.out.println("배열목록:" + "[" + i + "]" + ":" + inAry[i]);

		}

		double[] dbAry = new double[5];
		for (int i = 0; i < dbAry.length; i++) {
			System.out.println(dbAry[i]);

		}
		boolean[] boolAry = new boolean[3];
		boolAry[2]=true;
		for (int i = 0; i < boolAry.length; i++) {
			System.out.println(boolAry[i]);
		}
		String [] strAry = {"이순신","왕건","알렉산더","프로포비치"};
//		strAry[4] = "김구라";
		strAry[3] = "고구마";
		for (int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}
		
		
		
		
	}
}
