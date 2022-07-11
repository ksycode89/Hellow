package Afternoon;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ExDate {
	public static void main(String[] args) {
		Date today = new Date(); //현제는 LocalDateTime을 사용
		today.getDate();
		today.getDay();
		System.out.println(today.toString());
		System.out.println(today.toGMTString());
		System.out.println(today.toLocaleString());
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy년  MM월 dd일 hh시mm분ss초");
		System.out.println(sdf.format(today));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(today));
		
		today = new Date("2022/07/15");
		System.out.println(sdf.format(today));
		
		
		Calendar now = Calendar.getInstance();
		
		System.out.println(now.get(Calendar.YEAR)+"년");
		System.out.println(now.get(Calendar.MONTH)+"월");
		
		now.set(2022,10,12);
		System.out.println(now.get(Calendar.DATE)+"일");
		
		//LocalDATE
		LocalDate Ldate =LocalDate.now();
		System.out.println("toSTring  "+Ldate.toString());
		System.out.println(Ldate);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
		System.out.println(Ldate.format(dtf));
		
		
		
		
		
		
		
	}
}
