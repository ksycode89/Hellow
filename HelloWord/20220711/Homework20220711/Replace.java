package Homework20220711;

public class Replace {
public static void main(String[] args) {
	String str = 	"모든 프로그램은 자바 언어로 개발될수있다.";
	int index =str.indexOf("자바");
	if(index == -1) {
		System.out.println("자바가 없습니다.");
	}else {
		System.out.println("자바 문자열이 포함되어있습니다.");
		System.out.println("대체언어로 변환합니다.");
	}
	str = str.replaceFirst("자바", "Java") ;
	
	System.out.println(str);
}
}
