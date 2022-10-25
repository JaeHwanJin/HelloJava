package Collect;

import java.util.ArrayList;
import java.util.Scanner;


class Employ{
	int empId;
	String empName;
	int salary;
	
		Employ(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
}

 

public class MonringCode {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		ArrayList<Employ> list = new ArrayList<>();
		
		System.out.println("입력 >> ex) 100 홍길동 2500");
		while(true) {
			System.out.println(">> ");
		String inputVal = scn.nextLine();
		String[] inputs = inputVal.split(" ");
		// quit 종료
		if(inputs[0].equals("quit")) {
			break;
		}
		if(inputs.length != 3) {
			System.out.println("다시 입력");
		}
		
		list.add(new Employ(Integer.parseInt(inputs[0]), inputs[1],
				Integer.parseInt(inputs[2])));
		}
		
		for(Employ emp : list) {
			System.out.println(emp);
		}
		System.out.println("end of prog");

//		String tok = "Hello World Good";
//		Scanner scn = new Scanner("Hello World Good Friend");
//		
//		while(scn.hasNext()) //scn.hasNext() 가지고 올 값이 있는동안에 다 가져옴
//		System.out.println(scn.next());
//		
//		String[] toks = tok.split(" ");
//		for(String str : toks) {
//			System.out.println(str);
//		}		
		// 첫번째 값 => empId, 두번째 값 => empName, 세번째 값 => salary
		// Employee클래스의 인스턴스 생성
		// ArrayList 에 저장
		// 종료를 하고 싶으면 quit 종료.
		
		// for(반복문)출력
		
	}
}
