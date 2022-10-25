package Jdbc;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {

		EmployeeDAO dao = new EmployeeDAO();
		Scanner scn = new Scanner(System.in);

//		 1.사원등록 2.한건조회 3.수정 4.삭제 5.목록조회 9.종료

		while (true) {
			System.out.println("1.사원등록 2.한건조회 3.수정 4.삭제 5.목록조회 9.종료");
			System.out.print("원하는 메뉴를 입력하세요 >> ");

			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.println("등록 할 사원의 사원번호를 입력하세요");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.println("등록 할 사원의 이름을 입력하세요");
				String lastName = scn.nextLine();
				System.out.println("등록 할 사원의 이메일을 입력하세요");
				String email = scn.nextLine();
				System.out.println("등록 할 사원의 채용일을 입력하세요");
				String hireDate = scn.nextLine();
				System.out.println("등록 할 사원의 직무명을 입력하세요");
				String jobId = scn.nextLine();

				dao.insert(new Employee(empId, lastName, email, hireDate, jobId));

			}

			else if (menu == 2) {
				System.out.println("조회 할 사원의 번호를 입력하세요");

				int empId = Integer.parseInt(scn.nextLine());

				dao.getEmp(empId);

			} else if (menu == 3) {
				System.out.println("변경 할 사원의 사원번호를 입력하세요");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.println("변경 할 사원의 이름을 입력하세요");
				String lastName = scn.nextLine();
				System.out.println("변경 할 사원의 이메일을 입력하세요");
				String email = scn.nextLine();
				System.out.println("변경 할 사원의 채용일을 입력하세요");
				String hireDate = scn.nextLine();
				System.out.println("변경 할 사원의 직무명을 입력하세요");
				String jobId = scn.nextLine();				
				
				
				Employee up = new Employee(empId, lastName, email, hireDate, jobId);
				dao.update(up);
				 
			} else if (menu == 4) {
				System.out.println("삭제 할 사원의 번호를 입력하세요");
				
				int empId = Integer.parseInt(scn.nextLine());
				
				dao.delete(empId);
				
			} else if (menu == 5) {
				List<Employee> employees = dao.search();
				for (Employee emp : employees) {
					System.out.println(emp);
				}
			} else if (menu == 9) {
				break;
			}

		}
	}

}
