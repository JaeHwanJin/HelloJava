package Except;

public class RectPrint {
	public static void main(String[] args) {
		int cnt = 1;
		for(int i = 0; i < 5; i++) {
			for(int j =	4; j < 5; j++) {
				System.out.printf("%3d", cnt++);
				System.out.printf("%3d", cnt++);
			}
			System.out.println("");
		}
	}
}
