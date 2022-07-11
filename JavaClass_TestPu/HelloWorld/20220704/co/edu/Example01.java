package co.edu;

import java.util.*;

public class Example01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Insert num >");

		int n1 = scn.nextInt();

		if (n1 % 3 == 0) {
			System.out.println("3's Dra");

		} else {
			System.out.println("!3's Dra");
		}
	}

}
