package edu;



public class ExMultiAry1 {
public static void main(String[] args) {
	int [][] nestAry = new int [2][3] ;
	nestAry[0][0] = 10;
	nestAry[0][2] = 30;
	nestAry[1][1] = 40;
	
	System.out.println("첫배열");
	for(int i=0; i<nestAry[0].length; i++){
		System.out.println(nestAry[0][i]);
		
	}
	System.out.println("두번째 배열");
	for (int i=0; i<nestAry[1].length;i++) {
		System.out.println(nestAry[1][i]);
	}
	
	nestAry = new int[][] {{1,2},{3,4,5},{6,7,8,9}};
	System.out.println("중첩배열");
	for (int i =0; i<nestAry.length; i++) {
		for(int j=0; j<nestAry[i].length; j++) {
			System.out.println("("+i+","+j+") -> "+nestAry[i][j]);
		}
	}
	
	
	
	
	
	
}
}
