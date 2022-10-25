package Collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListEmample {
	public static void main(String[] args) {
		ArrayList<String> strs =new ArrayList<String>();
		// 추가.
		
		strs.add("홍길동");
		strs.add("김민식");
		strs.add("박유식");
		
		strs.remove(0); // 0번째 값 삭제
		strs.remove("박유식");
		
		
		strs.add(0, "최민식");
		
//		System.out.println("collect의 크기 : " + strs.size());
		
		
		for(String str : strs) {
//			System.out.println(str);	
		}
		for(int i = 0; i < strs.size(); i++) {
//			System.out.printf("%d번째의 값은 %s ", i, strs.get(i));
		}
		// 반복자를 생성
		Iterator<String> itr = strs.iterator();
		while(itr.hasNext()) {
			String result = itr. next();
//			System.out.println(result);
		}	
		
		// 100만건
		ArrayList<Integer> inAry = new ArrayList<Integer>();
		long start = System.nanoTime();
		for(int i = 0; i < 10000000; i++) {
			inAry.add(0, i);
		}
		long end = System.nanoTime();
		System.out.println(end - start);
		
		LinkedList<Integer> lnAry = new LinkedList<Integer>();
		
		start = System.nanoTime();
		for(int i = 0; i < 10000000; i++) {
			lnAry.add(i);
		}
		end = System.nanoTime();
		System.out.println("lna : " + (end - start));
		
		
	}
}
