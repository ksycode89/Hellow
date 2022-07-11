package co.edu;

public class CompareOperator {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;

		if (n1 == n2) {
			System.out.println("same");
		}
		if (n1 != n2) {
			System.out.println("differ");
		}
		if (n1 >= n2) {
			System.out.println("n1 > n2 or n1 = n2");
		}

		String name1 = new String("이순신");
		String name2 = new String("이순신");
		System.out.println(name1 + " " + name2);
		// equals or toString 으로 문자열자체를 불러오기
		if (name1.equals(name2)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

		String result = name1.equals(name2) ? "same" : "differ";
		System.out.println("삼항연산자equals형 결과 : " + result);

		// 삼항연산자
		boolean isTrue;
		if (n1 > n2) {
			isTrue = true;
		} else {
			isTrue = false;
		}
		System.out.println("if구분 비교 : "+ isTrue);

		isTrue = (n1 < n2) ? true : false;
		result = (n1 < n2) ? "true" : "false";

		System.out.println("boolean 결과 ; " + isTrue);
		System.out.println("String  결과 ; " + result);

	}

}
