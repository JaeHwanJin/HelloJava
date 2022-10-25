package Emp.list;

import java.util.ArrayList;

import Emp.Employee;

public class ListApp {
	public static void main(String[] args) {
		
		// 배열 보다 편한 컬렉션(ArrayList, HashSet, HashMap)
		String[] strAry = new String[10];
		ArrayList <String>list = new ArrayList<String>();
		// 모든클래스는 Object        But <>안의 타입만 담겠습니다.
		list.add("Hello");
		list.add("Employee");
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(100);
//		intList.add("100");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(100, "홍길동", 1000));
		empList.add(new Employee(200, "김민수", 2000));
		empList.add(new Employee(300, "박인기", 3000));
		empList.add(new Employee(400, "황석용", 4000));
//		empList.add(100);
		
		String result = null;
		int salary = 0;
		for(int i = 0; i < empList.size(); i++) {
			if(empList.get(i).getEmployeeId() == 200) {
				result = empList.get(i).getName();
				salary = empList.get(i).getSalary();
			}
		}
		System.out.println("이름은 " + result + "이고 급여는 " + salary
							+ "원 입니다.");
	}
}
