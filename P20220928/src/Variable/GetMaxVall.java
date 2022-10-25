package Variable;

import java.util.Iterator;

public class GetMaxVall {
	public static void main(String[] args) {
		int[] randomAry = new int[5];
		randomAry[0] = (int) (Math.random() * 100) + 1; // Math.random은 실수타입 0~1 사이의 임의수 생성
		randomAry[1] = (int) (Math.random() * 100) + 1;
		randomAry[2] = (int) (Math.random() * 100) + 1;
		randomAry[3] = (int) (Math.random() * 100) + 1;
		randomAry[4] = (int) (Math.random() * 100) + 1;
		
		int maxVal = 0;
		int minVal = 100;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(randomAry[i]);
			if(randomAry[i] > maxVal) {
				maxVal = randomAry[i];
			}
			if(randomAry[i] < minVal) {
				minVal = randomAry[i];
			}
		}
		System.out.println("생성된 배열의 임의의 값 중 최대값은 => " + maxVal);
		System.out.println("생성된 배열의 임의의 값 중 최소값은 => " + minVal);
	}
}
