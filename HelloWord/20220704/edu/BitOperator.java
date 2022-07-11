package edu;

public class BitOperator {

	public static void main(String[] args) {
		int n1 = 10;
		int result = ~n1; // ~는 값을 반전시킴
		System.out.println(result);

		int result2 = result++; // 비트(~)를 반영시키고 ++를 할시 음수값으로 구할수있다. /result2는 result의 음수값.
		System.out.println(result2);

		System.out.println(n1 + result2);

		// 대입연산자
		String names = "길동홍";
		names = names + " 민수킴";
//		names = names + " 박의식ㄱ";
		names += " 박의싟";

		System.out.println(names);

		result = result - 2;
		result -= 2;
		System.out.println(result);
	}

}
