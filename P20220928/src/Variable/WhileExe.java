package Variable;

import java.util.Scanner;

public class WhileExe {

	public static void main(String[] args) {
//		whileFnc();
//		whileFnc2();
//		whileFnc3();
		whileFn4();
	}

// while 구문
	public static void whileFnc() {
		// for 반복문 : 반복회수가 정해져있음
		int i = 0;
		while (i < 4) {
			System.out.println(i);
			i++;
		}

		System.out.println("end of program");
	}

	
// 사용자가 입력하는 값을 while 구문이 종료되기 전까지 출력
	public static void whileFnc2() {
		// while 구문.
		Scanner scn = new Scanner(System.in);
		// 사용자가 키보드로 입력한 값 받아오기
		// import : ctrl + shf +_o
		while (true) {
			System.out.println("값을 입력하세요. 종료하려면 stop을 입력하세요.");
			String inputVal = scn.nextLine();
			if (inputVal.equals("stop")) {
				break;
			}
			System.out.println("사용자입력값 => " + inputVal);
		}
		System.out.println("end of program");
		scn.close(); // 시스템자원을 반환.

	}

//	보고싶은 달을 입력. 종료하고 13 입력.
	
	public static void whileFnc3() {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("월을 선택하세요. 종료는 13 입니다.");
//		String input = scn.nextLine(); // string 값을 받아오겠습니다.
			int input = scn.nextInt(); // int 값을 받아오겠습니다.
			if(input == 13) {
				break;
			}
			MethodCalendar.makeCal(input);
		}
		System.out.println("end of program");
		scn.close();	
	}
	
	public static void whileFn4(){
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("한글 자음을 입력하세요");
			String hangle = scn.nextLine();
			if(hangle == "1") {
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
