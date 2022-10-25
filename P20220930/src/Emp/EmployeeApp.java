package Emp;
//package co.edu.emp;
//
//import java.util.Scanner;
//
//public class EmployeeApp {
//	public static void main(String[] args) {
//		// 1.사원수(초기화) 2.사원정보입력 3.사원검색 4.사원리스트 5. 사원급여 0.종료
//		Scanner scn = new Scanner(System.in);
//		EmployeeArraysList service = new EmployeeArraysList();
//		
//		while(true) {
//			
//			System.out.println("1.사원수(초기화) 2.사원정보입력 3.사원검색 4.사원리스트 "
//								+ "5.사원급여 0.종료");
//			System.out.println("선택 >> ");
//			int menu = 0;
//			
//			try {
//			menu = Integer.parseInt(scn.nextLine()); 
//			// Integer.parseInt() 문자열은 정수로 "1" -> 1
//			} 
//			catch(NumberFormatException a) {
//				System.out.println("예외값 발생");
//			}
//			if(menu == 1) {
//				service.init();
//			}
//			
//			else if(menu == 2) {
//				service.input();
//			}
//			
//			else if(menu == 3) {
//		
//				System.out.println("검색 할 사원번호 입력 >> ");
//				int eId = Integer.parseInt(scn.nextLine()); // "100" Enter.
//				String name = service.search(eId);	
//				if(name == null) {
//					System.out.println("찾는 사원정보가 없습니다.");
//				}
//				else {
//					System.out.println("사원의 이름은 " + name);
//				}
//			}
//		
//			else if(menu == 4) {
//				service.print();
//			}
//			else if(menu == 5) {
//				// 사번을 넣으면 사원의 급여정보 반환
//				System.out.println("검색 할 사원번호 입력 >>");
//				int eId = Integer.parseInt(scn.nextLine());
//				int eSal = service.searchSal(eId);
//				if( eSal == -1) {
//					System.out.println("찾는 사원정보가 없습니다.");
//				}
//				else {
//					System.out.println("사원의 급여는 " + eSal);
//				}
//				
//			}
//			else if(menu == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//		}
//		System.out.println("프로그램 종료.");
//	} // end of main()
//} // end of class
