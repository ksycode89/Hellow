package Afternoon;

import java.io.UnsupportedEncodingException;

public class ExampleByteString {
	public static void main(String[] args) {

		String str1 = "안녕하세요";
		byte[] byte1 = str1.getBytes();

		System.out.println("byte1길이 : " + byte1.length);
		for (byte num : byte1) {
			System.out.println("byte1 값들" + num);
		}

		String str2 = new String(byte1);
		System.out.println(str2);

		try {
			byte[] byte2 = str1.getBytes("EUC-KR");
			System.out.println("byte2길이" + byte2.length);
			String str3 = new String(byte2, "EUC-KR");
			System.out.println("byte2->str3" + str3);

		} catch (UnsupportedEncodingException a) {
			a.printStackTrace();
		}
	}
}
