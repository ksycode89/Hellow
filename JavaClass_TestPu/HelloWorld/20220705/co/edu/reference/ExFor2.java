package co.edu.reference;

public class ExFor2 {
public static void main(String[] args) {
	int[] tempAry =new int[5];
	int big = 0;
	
	for(int i=0; i<5;i++) {
		tempAry[i] = (int)(Math.random()*50);
		

		}

	for(int num : tempAry) {
		System.out.println("temAry목록"+num);
		
		if (num>big) {
			big=num;
		}
		
		
		
	}System.out.println("가장큰값은 "+big+"입니다.");
}
}
