package Variable;

import java.util.Iterator;

public class SortExe {
	public static void main(String[] args) {

// 순서변경		
		int[] numAry = {34, 21, 12, 9, 54, 84, 85, 74, 12}; 
	
/*		if(numAry[0] > numAry[1]) { // 34 > 21
			int temp = numAry[0];
			numAry[0] = numAry[2]; //
			numAry[2] = temp; //		}
		
	}*/
		
// 배열 값이 추가되더라도 항상 오름차순
	for(int j = 0; j < numAry.length - 1; j++)
		for(int i = 0; i < numAry.length - 1; i++) {
			if(numAry[i] > numAry[i + 1]) {
				int temp = 0;
				temp = numAry[i];
				numAry[i] = numAry[i + 1];
				numAry[i + 1] = temp;
			}
		}
	for(int n : numAry) {
		System.out.println(n);
	}
 }
	public static int sum(int n1, int n2) {
		int result = n1 * 2 + n2 * 3;
		System.out.println("결과값은 " + result);
		return result; // 반환값의 유형은 static 뒤의 int다.
	}
}
