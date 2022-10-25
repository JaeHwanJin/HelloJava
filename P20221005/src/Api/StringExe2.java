package Api;

import java.io.IOException;

public class StringExe2 {
	public static void main(String[] args) {
		System.out.println("abcDEF".toLowerCase());
		while(true) {
			try {
				int bytes = System.in.read();
				if(bytes == 122)
					break;
				
				System.out.println("입력값 : " + bytes);
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end of prog");
		
		//대문자 -> 소문자, 소문자 - 대문자(32)
		// aBcD => AbCd 97:65, 98:66 122
		// 소문자 : 97 ~122. 대문자 : 65 ~ 90
	}
}
