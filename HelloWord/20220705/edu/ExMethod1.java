package edu;

public class ExMethod1 {
	public static void main(String[] args) {
		System.out.println("aㅏJㅕssi");
		System.out.println(sum(10));
		sum2(10);
		showInfo("Hello Word", 2);
		star(6, "㉾");
		gugu(13);
	}

	public static int sum(int num) {
		int result = num * 2;
		return result;

	}

	public static void sum2(int num) {
		int result = num * 2;
		System.out.println(result);
	}

	public static void showInfo(String name, int age) {

		System.out.println("이름은" + name + "나이는" + age + "살");

	}

	public static void star(int times,String shape) {
		for(int i=0;i<times;i++) {
			for(int j=5;j>i;j--) {
			System.out.print(shape);
		}
		System.out.println();
		}
	}
	public static void gugu (int dan){
	System.out.println(dan+"단을 출력합니다.\n");
		for(int i=1; i<=9; i++) {
			
				System.out.println(dan+"x"+i+"="+dan*i);
			}
		
	
	}

}
