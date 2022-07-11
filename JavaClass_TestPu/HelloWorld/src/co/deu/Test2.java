package co.deu;

public class Test2 {

	public static void main(String[] args) {
		double myHi = 179.1;
		double yuHi = 199.9;
		
		double differ;
//		if (myHi>yuHi) {
//			differ = myHi-yuHi;
//		}	else{
//			differ = yuHi-myHi;
//		}
//		
		
		
		if(myHi>yuHi) {
			differ = myHi-yuHi;
			System.out.println("내가 더" +differ+ "크다ㅋ");
			
		}else {
			differ = yuHi-myHi;
			System.out.println("니가 더" +differ+"크네..");
		}
				
	}
}