package Collect;

import java.util.Stack;

class Coin{
	private int val;
	public Coin(int val) {
		this.val = val;
	}
	public int getVal() {
		return val;
	}
}
public class 스택예시1011 {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		// 추가할때는 push
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(60));
		coinBox.push(new Coin(80));
		
		//출력   값이 있을동안엔 계속
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(coin.getVal());
			
		}
		
	}
}
