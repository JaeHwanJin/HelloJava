package Inherit.friend;

import java.util.ArrayList;

public class ArrayExam {
	public static void main(String[] args) {
		
		// 배열은 크기가 정해지면 변경이 불가
		String[] flowers = new String[3];
		flowers[0] = "장미";
		flowers[1] = "해바라기";
		flowers[2] = "무궁화";
//		flowers[3] = "목련";
				
		String[] flowers2 = new String[6];
		flowers2[0] = flowers[0];
		flowers2[1] = flowers[1];
		flowers2[2] = flowers[2];
		flowers2[3] = "목련";
		
//		for(String str : flowers2) {
//			if(str != null) {
//				System.out.println(str);
//			}
//		}
		
		// 배열의 크기 고정 => 컬렉션(ArrayList);
		// Object 모든 클래스의 최상위 클래스
		// 배열 값 추가하면 크기가 계속해서 늘어남
		ArrayList flowers3 = new ArrayList(); //크기 지정 안할시 기본 10개공간 생성
		flowers3.add("장미"); // 첫번째 위치에 장미 저장
		flowers3.add("해바라기");
		flowers3.add("무궁화꽃");
//		flowers3.add("무궁화꽃");  
//		flowers3.add("무궁화꽃");
//		flowers3.add("무궁화꽃");
//		flowers3.add("무궁화꽃");
//		flowers3.add("무궁화꽃");
//		flowers3.add("무궁화꽃");
//		flowers3.add("무궁화꽃");
//		flowers3.add("무궁화꽃");
//		flowers3.add("무궁화꽃");
		
//		flowers3.add(123); // 문자열과 정수 복합사용시 에러발생
		
		for(Object str : flowers3) {
		String result =	(String) str;
			System.out.println(result);
		}
		
		// flowers3는 ArrayList 컬렉션이기때문에 length ㄴㄴ size() 사용
		for(int i = 0; i < flowers3.size(); i++) {
			String result = (String) flowers3.get(i);
			System.out.println(result);
		}
		
	}
}
