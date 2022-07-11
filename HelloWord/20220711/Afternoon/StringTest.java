package Afternoon;

import java.nio.file.Path;
import java.nio.file.Paths;

import ExMoring.ExClass;

public class StringTest {
public static void main(String[] args) {
		String[] str = {"자바","자바다","이것이자바다","자바스크립트","자 바 "};
		index(str);
		
		Path path = Paths.get("c:/images/hello.png");
		System.out.println("파일명 : " +path.getFileName() );
		System.out.println("파일경로 : " );
		
		String tel = "";
		String [] tels = {" 031","210 3","34 78 "}; // 031-2103-3478
//		System.out.println(tels[1].replaceAll(" ",""));
		blank(tels);
		String[] ssn = {"970403-1234123","010503 3456123",
				        "980123/2412345","0201221234577"};
		
		System.out.println();
		char sex;
		for(int i=0; i <ssn.length; i ++) {
			sex = ssn[i].charAt(6);
			System.out.println(sex);
			if(ssn.length<99) {
				if(sex==1) {
					System.out.println("남자");
				}
				
			}				
			}
			
}






public static void checkGender(String ssn) {
	
	
}
	public static void 	index (String[]  str) {
	 for (int i=0;i<str.length;i++) {
		 
		 if(str[i].indexOf("자바") != -1) {
			 System.out.println("자바가 포함된 항목들은 "+i+"번째 : "+str[i]);
		 }else {System.out.println(i+"번째항에서는 포함되어있지않습니다.");}
	 }
	 
		
	}
	public static void blank (String [] str) {
		 for (int i=0;i<str.length;i++) {
	      
	      str[i]= str[i].replaceAll(" ","");
			System.out.print(str[i]+"-");
		 }
	}	
		
		
		
		
		
		
		
		
		
		
		
		

}
