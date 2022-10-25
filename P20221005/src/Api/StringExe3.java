package Api;

import java.util.ArrayList;
import java.util.List;

// 2) <T> 클래스를선언할때어떤 타입인지 안정했을때 사용/ 
class Box<T>{
	T obj; // 2) //어떤형태든 받아들이기위해
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}


class Member{
	private String name;
	private String id;
	private int point;
	
	public Member(String name, String id, int point) {
		super();
		this.name = name;
		this.id = id;
		this.point = point;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}

class Employee{
	private String empName;
	private String empId;
	private int salary;
	
	
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}


public class StringExe3 {
	public static void main(String[] args) {
		// 2) 이제 Box는 문자열만 담겠습니다.
		Box<String> box = new Box<String>();
		box.set("Hello");
//		box.set(200); // 2) Box는 문자열만 담겠다 선언했으니 오류가 남
		String result = (String)box.get(); // 1) box값이 정수라 에러뜸
//		Integer result = (Integer)box.get(); // 1)
		System.out.println(result);
		
		String[] stAry;
		List<String> list = new ArrayList<String>();
		list.add("Hello");
//		list.add(200);
		
	
		List<Member> members = new ArrayList<Member>();
		members.add(new Member("홍길동", "Hong", 10000));
		members.add(new Member("김민기", "Kim", 20000));
		members.add(new Member("박인기", "Park", 30000));
		
		List<Employee> employees = changeType(members); //Member =>
		for(Employee emp : employees) {
			System.out.println("name : " + emp.getEmpName() + ", id : " +
								emp.getEmpId() + "salary : " + emp.getSalary());
		}
				 
	}
	
	public static List<Employee> changeType(List<Member> collect){
		
		List<Employee> empls = new ArrayList<Employee>();
		for(Member member : collect) {
			Employee emp = new Employee();
			emp.setEmpId(member.getId());
			emp.setEmpName(member.getName());
			emp.setSalary(member.getPoint());
			
			empls.add(emp);
		}
		return empls;
		
	}
	
}
