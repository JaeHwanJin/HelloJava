package Variable;

import java.util.Iterator;
import java.util.Scanner;
import java.lang.System;

public class GetSameVal {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in); // 사용자입력값을 저장
		
		System.out.println("이름을 입력하세요 >>> ");
		
		String name = scn.nextLine(); //사용자 입력값을 반환.
		String[] names = {"진재환", "진지환", "진조환", "진장환"};
		
		boolean isChecked = false;
	
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals(name)) { // 문자열비교는 문자열.equals(비교문자열)
			System.out.println(i + "번째에 있습니다.");	
			isChecked = true;
			break;
			}
			
			}
		if(!isChecked) {
			System.out.println("찾는 이름이 없습니다.");
	/*		else if(!(names[i].equals(name))) {
				System.out.println("없습니다.");	
			}
			*/
			
			}		
		
	/*	for(int i = 0; i < 1; i++) {
			if(!(names[i].equals(name))) {
				System.out.println("없습니다.");	
		}
		*/
		
		System.out.println("입력값 : " + name) ;
		scn.close();
		}
	  }
	

