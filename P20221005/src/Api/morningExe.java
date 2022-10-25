package Api;


public class morningExe {
	public static void main(String[] args) {
		
		
		int one = 1;
		

		for(int i = 1; i < 5; i++) {
			for(int j = 1; j <= i; j++)
				for(int k = 5; k > i; k--) {
				System.out.print(" ");
			}	{
				System.out.printf("%2d", one);
				one++;
			}			
			System.out.println(" ");
		}
		
//		System.out.println(" ");
//		
//		for(int a = 5; a > 0; a--) {
//			for(int b = 0; b < a; b++) {
//				System.out.print("*");
//			}		
//			System.out.println(" ");
//		}	
	}
}
