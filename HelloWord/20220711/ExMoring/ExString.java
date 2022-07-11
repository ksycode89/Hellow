package ExMoring;

import java.io.UnsupportedEncodingException;

public class ExString {
	public static void main(String[] args) {

		String name = "hong";
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		try {
			name = new String(bytes, 0, 5, "UTF-8");
		} catch (UnsupportedEncodingException a) {
			a.printStackTrace();
		}
		System.out.println(name);

		//
		char fname = name.charAt(0);
		System.out.println(fname);

	}
}
