package Io;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordAry {
	public static void main(String[] args) throws Exception {
		// 임의 문장을 10개씩 출력하고 타이핑해서 맞으면 사라지고 아니면 남아있게
		Scanner scn = new Scanner(System.in);
		ArrayList<String> words = randomWords(10);
		for(String word : words) {
			System.out.println(word);	
		}
		String inputVal = scn.nextLine();
		// 하나씩 찾아서 지우기.
//		if(words.get(i).equals(inputVal)) {
//			words.remove(i);
//		}
//		if(words.isEmpty()){
//			break;
//		}
	}
	
	
	public static ArrayList<String> randomWords(int times) throws Exception{
		  // ArrayList<String> 전체문장을 담고
		ArrayList<String> words = new ArrayList<String>();
		String path = "src/co/edu/io/wordAry.txt";
		File file = new File(path);
		Scanner scn = new Scanner(file);
		while(scn.hasNext()) {
			String readStr = scn.nextLine();
			readStr = readStr.replaceAll("\"", "").trim();
//			System.out.println(readStr);
			words.add(readStr.substring(0, readStr.indexOf(",")));
		}
		
		// 임의의 갯수 times 갯수만큼을 반환하도록
		ArrayList<String> randomWords = new ArrayList<String>();
		
		Set<Integer> idxSet = new HashSet<>();
		while(idxSet.size() < times) {
			idxSet.add((int)(Math.random() * words.size()));
		}
		for(int i = 0; i < idxSet.size(); i++) {
			idxSet.add((int)(Math.random() * words.size()));
		}
		for(int idx : idxSet) {
			
		}
		
		scn.close();
		return randomWords;
	}
	
}
