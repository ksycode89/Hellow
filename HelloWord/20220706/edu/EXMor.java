package edu;

import java.util.*;

public class EXMor {
	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		int max = 0;
		double avg = 0 ;
		
		Scanner scn = new Scanner(System.in);
		
		while (run) {
			
			System.out.println("1.학생수 입력 2.점수입력 3.점수출력 4.분석 5.종료");
			System.out.print("선택 ->" );
	
			int selc =Integer.parseInt(scn.nextLine());
			
			if(selc == 1 ) {
				System.out.print("학생수를 입력하세요 - >");
				selc =Integer.parseInt(scn.nextLine());
				studentNum = selc;
				scores = new int[studentNum];
				
				
			}else if (selc ==2) {
				System.out.println("점수를 입력하세요 - >");
			
				for(int i=0; i<scores.length;i++){
					selc =Integer.parseInt(scn.nextLine());
					
					System.out.printf("Scores [%d] \n",i);
				scores[i] = selc;
				}
				
			}else if (selc ==3) {
				if(scores ==null) {
					System.out.println("입력된 점수가없습니다.");
					continue;
				}
				System.out.println("점수를 출력합니다.");
				for(int i=0; i<scores.length;i++) {
					System.out.printf("점수는 [%d] \n",scores[i]);
					
				}
		
			}else if (selc ==4) {
				
				for(int num : scores) {
			 		sum += num;
		    }   for(int i=0;i<scores.length;i++) {
		    	if (max<scores[i]) {
		    		max = scores[i];
		    	}
		    }
					
			
				
				avg=(int)sum/scores.length;
				System.out.println("분석표를 출력합니다.");
				System.out.println("학생수"+studentNum);
				System.out.println("배열의 길이"+scores.length);
				System.out.printf("총합산은 %d이고 평균은 %.2f입니다. \n",sum,avg);
				System.out.println("최고점수는 "+max);
				
			}else if (selc ==5) {
				System.out.println("종료합니다");
				run = false;
				
			}else {
				System.out.println("입력한 값이 잘못되었습니다.");
			}
			
			
			
		}
		System.out.println("프로그램 종료");
		
		
	}
	}//메인메서드
	
	
//메인 클레스
