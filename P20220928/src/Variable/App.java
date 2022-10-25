package Variable;

// 자바는 class 시작.
// 클래스의 main메소드로 시작.
public class App {
	public static void main(String[] args) {
		System.out.println("매개값을 출력."); //(매개값을 출력)
		
		// 변수의 타입 지정. => 정수(int, long), 실수(double, float)
		// 참/거짓(bollean), 문자열 : (String)
		
		int myAge = 25; // 왼쪽과 오른쪽 타입은 항상 동일 해야 한다.
		// myAge = "스물다섯"; // 컴파일 에러.
		String 내나이 = "스물다섯";
		내나이 = "28"; //문자열 28
		
		int result = myAge + 30;
		System.out.println(myAge + "값과 30을 더하면" +
		result + "입니다.");
	
		// 배열.
		// let numAry = [];
		int[] numAry = {20, 29, 13, 44, 88, 33};
		int sum = 0;
		//1) 배열의 합계.
		for(int i = 0; i < 6; i++) {
			// System.out.println(numAry[i]);
			if(i % 2 == 0)
			sum = sum + numAry[i];
		}
		System.out.println("합계 => " + sum);
		
		//2) 배열 조건.
		sum = 0; // 0값으로 초기화.
		// 문제 : sum의 값이 100을 넘어서는 시점 break; 그 때의 sum 을 출력.
		for(int i = 0; i <= 100; i++){
				sum += numAry[i];
				if (sum > 100)
					break;
				}
			System.out.println(sum);
			}
		
	}	

