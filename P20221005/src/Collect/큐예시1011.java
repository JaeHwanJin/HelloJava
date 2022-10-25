package Collect;

import java.util.LinkedList;
import java.util.Queue;

public class 큐예시1011 {
	public static void main(String[] args) {
		Queue<String>que = new LinkedList<>();
		//추가
		que.offer("Hong");
		que.offer("Park");
		que.offer("Choi");
		
		while(!que.isEmpty()) {
//			System.out.println(que);
			System.out.println(que.poll()); // poll 먼저 들어간 순서대로 출력하겠습니다.
			
		}
	}
}
