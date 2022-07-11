package edu;

import java.util.Calendar;
import java.util.Scanner;

public class ExCalendar {
		Scanner scn=new Scanner(System.in);
		
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.MARCH)+1+"월"); //0부터임
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일"); //1부터 일요일
		System.out.println("마지막요일은"+cal.getActualMaximum(Calendar.DATE)+"일");//말일
		
		cal.set(2022,7,1); //22년 6월 1일
		System.out.println();
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.MARCH)+1+"월"); //0부터임
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일"); //1부터 일요일
		System.out.println("마지막요일은"+cal.getActualMaximum(Calendar.DATE)+"일");//말일
		
		System.out.println(getLastDate(2022,7));
		getDayInfo(2022,7);
	}
	//년 월  정보를 입력하면 해당되는  말일정보를 출력.
	public static int getLastDate(int year,int month) {
		Calendar cal2 = Calendar.getInstance();
		cal2.set(year,month-1,1);
		int result =cal2.getActualMaximum(Calendar.DATE);
							
		return result ;
	}

	//년 월  정보를 입력하면 해당되는 요일정보를 출력.
	public static void  getDayInfo(int year,int month) {
		Calendar cal3 = Calendar.getInstance();
		cal3.set(year,month-1,1);
		int result =cal3.get(Calendar.DAY_OF_WEEK);
		if(result ==0) {
			System.out.println("일요일");
		}else if (result ==1) {
			System.out.println("월요일");
		}else if (result ==2) {
			System.out.println("화요일");
		}else if (result ==3) {
			System.out.println("수요일");
		}else if (result ==4) {
			System.out.println("목요일");
		}else if (result ==5) {
			System.out.println("금요일");
		}else{
			System.out.println("토요일");
			
		}
		 
		
	}
	
	
	
	
	
	
	
}
