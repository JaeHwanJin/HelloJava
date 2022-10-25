package Emp;

//import java.util.ArrayList;
//import java.util.Scanner;

// 컬렉션을 활용해서 데이터 저
//public class EmployeeArraysList implements EmployeeService{
//	// 저장공간 생성
//	ArrayList<Employee> list;
//	int idx = 0;
//	Scanner scn = new Scanner(System.in);
//	
//	@Override
//	public void init() {
//		list = new ArrayList<Employee>();
//		System.out.println("초기화 완료.");
//	}
//
//	@Override
//	public void input() {
//		// 사번입력 예외처리
//		int eId = readInt("사번 >> ");
//		System.out.println("이름 >> ");
//		String name = scn.nextLine();
//				
//		// 부서입력 예외처리(10,20,30 이외의 부서는 부적절)
//		int detpId = -1;
//		while(true) {
//			detpId = readInt("부서 >>");
//			try {
//				validDept(detpId);
//				break;
//			}
//			catch(InvalidDeptException e1);
//				System.out.println(e1.getMessage());
//			
//		}
//		System.out.println("사번 >> ");
//		int eId = -1;
//		try {
//			eId = Integer.parseInt(scn.nextLine());
//		}
//		catch(NumberFormatException e) {
//			System.out.println("숫자를 입력하세요.");
//		}
//		eId = Integer.parseInt(scn.nextLine());
//		System.out.println("이름 >> ");
//		String name = scn.nextLine();
//		System.out.println("부서 >> ");
//		int deptId = Integer.parseInt(scn.nextLine());
//		System.out.println("급여 >> ");
//		int sal = Integer.parseInt(scn.nextLine());
//		System.out.println("이메일 >> ");
//		String email = scn.nextLine();
//		
//		Employee empl = new Employee(eId, name, sal, deptId, email);
//		list.add(empl);
//	}
//
//	@Override
//	public String search(int employeeId) {
//		String Eid = null;
//		try {
//			Eid = (scn.nextLine());
//		}
//		catch(NullPointerException e) {
//			System.out.println("문자를 입력하세요.");
//		}
//		String result = null;
//		
//		for(Employee emp : list) {
//			if(emp.getEmployeeId() == employeeId) {
//				result = emp.getName();
//				break;
//				
//			}
//		}
////		for(int i = 0; i < list.size(); i++) {
////			if(list.get(i).getEmployeeId() == employeeId) {
////				result = list.get(i).getName();
////				break;
////						
////			}
////		}
//		return result;
//	}
//
//	@Override
//	public void print() {
//		System.out.println("사원번호  사원이름    급여" );
//		System.out.println("===================");
//		for(int i = 0; i < list.size(); i++) {
//			System.out.printf("%3d %7s %7d\n", 
//								list.get(i).getEmployeeId(),
//								list.get(i).getName(),
//								list.get(i).getSalary());
//		}
//	}
//	public void validDept(int dept) throws InvalidDeptException{
//		int validDept = dept % 10;
//		if(valiDept != 0 || dept > 30) {
//			throw new InvalidDeptException("잘못된 부서정보입니다.");
//		}
//	}
//	
//	@Override
//	public int searchSal(int employeeId) {
//		int result = 0;
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getEmployeeId() == employeeId){
//				result = list.get(i).getSalary();
//			}
//		}
//		return result;
//		
////		for(Employee emp : list) {
////			if(emp.getEmployeeId() == employeeId) {
////				result = emp.getSalary();
////				break;
////			}
////		}
////		return result;
//	}
//	public int readInt(String msg) {
//		int result = -1;
//		while(true) {
//			System.out.println(msg);
//			try {
//				result = Integer.parseInt(scn.nextLine());
//				break;
//			}
//			catch(NumberFormatException e)
//			{
//				System.out.println("숫자를 입력하세요.");
//			}
//		}
//		return result;
//	}
//}
