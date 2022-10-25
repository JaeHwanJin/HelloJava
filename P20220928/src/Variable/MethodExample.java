package Variable;

import java.util.Iterator;



public class MethodExample {

	public static void main(String[] args) {
		
	//  1) 가로, 세로 => 넓이
		
		int result = getArea(10, 20);
		System.out.println("전체 너비는 " + result);
		
//		2) 배열요소의 각 값의 합.
		
		int[] intAry = {23, 45, 12};
		result = sumAry(intAry);
		System.out.println("전체 배열요소의 합계는 " + result);
		
//		3) 실수. float, double
			double d1 = 23.4567;
			double d2 = 12.34;
			double d3 = d1 + d2;
			
			d3 = divide(d1, d2);
			System.out.println("나눈 결과는 " + d3);

			double resulte = dividee(3, 2);
			System.out.println(resulte);
			
			double avg = sungjuk(75, 85, 90);
			System.out.println(avg);
	}

	//  1) 가로, 세로 => 넓이
	
	public static int getArea(int width, int height) {
		int result = width * height;
		
		return result;
	}
	
//	2) 배열요소의 각 값의 합. 

	public static int sumAry(int[] ary) {
		int sum = 0;
		for(int i = 0; i < ary.length; i ++) {
			sum = sum + ary[i];
		}
		return sum;
	}
	
		
//	3)	두수를 나눈 결과를 반환.
		public static double divide(double n1, double n2) {
			double result = n1 / n2;
			return result;
			
		}
//	4) 두수를 나누는 작업. 매개변수를 int 지정.
		public static double dividee(int n1, int n2) {
//		유형 byte(1), short(2), int(4), long(8)
			double resulte = n1 / n2;
			return resulte;
		}
		
//	5)	평균 값 구하기 소수점 까지
		public static double sungjuk(double kor, double eng, double math) {
			
			double avg = (kor + eng + math)/3;
			return avg;
			
		}
}
	

