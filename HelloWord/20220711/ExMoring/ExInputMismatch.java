package ExMoring;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExInputMismatch {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("숫자입력");
	boolean a = true;
	
	while(a) {
	System.out.println("aaaa");
	try {
	int num = scn.nextInt();
	break;
	}catch(InputMismatchException  b){
		System.out.println("숫자를 입력하세요(error)");
	}
	
	}
	
	
}
}
