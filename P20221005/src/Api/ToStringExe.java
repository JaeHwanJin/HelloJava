package Api;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class ToStringExe {
	public static void main(String[] args) throws IOException {
		
//		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
//		String str1 = new String(bytes);
//		System.out.println(str1);
//		
//		String str2 =new String(bytes, 6, 4);
//		System.out.println(str2);
		
		
//		byte[] bytes = new byte[100];
//		
//		System.out.println("입력 : ");
//		int readByteNo = System.in.read(bytes); // System.in.read 
//		
//		String str= new String(bytes, 0, readByteNo);
//		System.out.println(str);
		
		
		// charAt(7) => 7번 인덱스 위치에 있는 문자를 뜻함
//		String ssn = "010624-1230123";
//		char sex = ssn.charAt(7); 
//		switch(sex) {
//		case '1' :
//		case '3' :
//			System.out.println("남자입니다.");
//			break;
//		
//		case '2' :
//		case '4' :
//			System.out.println("여자입니다.");
//			break;
//		}
		
		
		// 문자열은 == 말고 str.equals.(str2) 로 표현
//		String strVar1 = new String("신민철");
//		String strVar2 = "신민철";
//		
//		if(strVar1 == strVar2) {
//			System.out.println("같은 String 객체를 참조");
//		}
//		else {
//			System.out.println("다른 String 객체를 참조");
//		}
//		
//		
//		if(strVar1.equals(strVar2)) {
//			System.out.println("같은 문자열을 가짐");
//		}
//		else {
//			System.out.println("다른 문자열을 가짐");
//		}
		
		
		String str ="안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String " + str1);
		
		try {
			
			byte[] bytes2 = str.getBytes("EIC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			String str2 =new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String " + str2 );
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length : " + bytes3.length);
			String str3 =new String(bytes3, "UTF-8");
			System.out.println("bytes3 -> String " + str3 );
			
		}
		catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
