package edu;

public class sdfsdafsff {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		for(int j=0;j< 4-i; j++) {
			System.out.print(" ");
		}
		for(int j=0;j<i+1;j++) {
			System.out.print("+");
		}
		System.out.println();
	}
	
	int[][] nestAry = new int[][] {{1,2},{3,4,5},{6,7,8,9}};
	System.out.println("중첩배열");
	for (int i =0; i<nestAry.length; i++) {
		for(int j=0; j<nestAry[i].length; j++) {
			System.out.println("("+i+","+j+") -> "+nestAry[i][j]);
			
			}
		}
	
	for(int[] num : nestAry) {
		System.out.println(num);
	
		
		}
		
		}
	}
	
	
	
	


