package Collect;

public class ExcitingGame {
	public static void main(String[] args) {
				
		String target = "Defines the AWT and Swing user interface toolkits";
		String[]targetAry = target.split(" ");
		if(targetAry[0].equals("Defines")){
			targetAry[0] = null;
		}
		
		for(String str : targetAry) {
			if(str != null) {
				System.out.printf("%s ", str);
			}
		}
		long gameStart =  System.currentTimeMillis();

		long gameEnd = System.currentTimeMillis();
				
		long during = (gameEnd - gameStart); 
		System.out.println("2분 22초가 걸렸습니다.");
	}
}

