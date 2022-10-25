package unknown;

public class MyMath {
	
	//절대값 구하는메서드.
	
	public static int abs(int num) {
		return num > 0 ? num : -num;
		
	}
	
	// 지수값 구하는 메서드.
	
	public static int power(int base, int exponent) {
		int result = 1;
		for(int i = 1; i <= exponent; i++) {
			result = result * base;
		}
		return result;
	}
}
