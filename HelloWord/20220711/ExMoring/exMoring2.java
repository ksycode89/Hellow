package ExMoring;

import java.util.ArrayList;

//배엸6개   1~100값
public class exMoring2 {
public static void main(String[] args) {
	ArrayList<Object> artList = new ArrayList<Object>();
	
	int a ;
	
	for(int i=0; i<6;i++) {
		a = (int)(Math.random()*100)+1;
		artList.add(a);
		System.out.println(artList.get(i));
	}
	artList.set(3,60);
	
	
}
}
//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