package Afternoon;

public class StringIndex {
	public static void main(String[] args) {
		String str = "다크 남궁 프라이멀 자바";
		

		int loca = str.indexOf("남궁"); //0부터
		System.out.println(loca);
		
		if(str.indexOf("자바") != -1) {
			System.out.println("자바입니다.");
		}else{System.out.println("자바아닙니다.");}
	
		
		
	}

}
