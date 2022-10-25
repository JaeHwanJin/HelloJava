package Variable;

import java.util.Iterator;



public class MethodExe {

// main 메소드 : 자바 실행시 제일 먼저 동작하고 어느 객체에서든 접근가능하고
//			   자바가 컴파일 되는 순간 정의되는 돌려주는 값이 없는 함수
// 
	public static void   main   (String[] args) {
// void : 리턴되는 값이 없음 메소드 이름   매개변수
//		printStar(); // 매개변수가 없는 메소드 실행 
//      printStar(3); // 매개변수가 있는 메소드 실행
//		printCircle("@");
//		printCircle("●", 5);
//		sum(2, 3);
//		int result = sum(sum(2, 3), sum(3, 4));
//		System.out.println("최종값은 " + result);
	}
	
	public static void printStar() { // 반환값 : 없음. 매개변수 : 없음.
		System.out.println("★");
		
	}
	
	public static void printStar(int times) { // 반환값 : 없음 매개변수 : 있음
		for(int i = 0; i < times; i++)
			System.out.println("★");
		
	}
	
	public static void printCircle(String circle) {
		System.out.println(circle);
		
	}
	
	public static void printCircle(String circle, int times) {
		for(int i = 0; i < times; i++) {
			System.out.println(circle);
		}
	}
	
	// 반환값을 가지는 메소드.
	public static int sum(int n1, int n2) {
		int result = n1 * 2 + n2 * 3;
		System.out.println("결과값은 " + result);
		return result; // 반환값의 유형은 static 뒤의 int다.
	}
	
}
