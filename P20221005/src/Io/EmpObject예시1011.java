package Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpObject예시1011 {
	public static void main(String[] args) throws Exception {
		
		// C:/Temp/emp.dat
		
		FileInputStream fis = new FileInputStream("C:/Temp/emp.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Emp> empList = (ArrayList<Emp>) ois.readObject();
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 사원등록 2.목록출력 3.종료");
			System.out.print("선택 >> ");
			
			
			int menu = scn.nextInt();

			if(menu == 1) {

				System.out.println("사원아이디를 입력하세요.");
				int id = scn.nextInt();
				scn.nextLine();
				System.out.println("사원 이름을 입력하세요.");
				String name = scn.nextLine();					
				System.out.println("사원부서를 입력하세요.");
				String dept = scn.nextLine();
				
				empList.add(new Emp(id, name, dept));
				
			}
			else if(menu == 2){
				ArrayList<Emp> list = empList;
				for(Emp emp : list) {
					System.out.println(emp.toString());		
				}
			}
			
			else if(menu == 3) {
				// 사원번호를 기준으로 삭제
				
				empList.remove(1);
			}
			
			else if(menu == 4){
				// 컬렉션에 있던 ObjectOutputStream 을 활용해서
				// C:/Temp/emp.dat 에 저장하고 종료
				FileOutputStream fos = new FileOutputStream("C:/Temp/emp.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(empList);
				
				System.out.println("종료되었습니다.");
				break;
			}
			else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
			
		}
	}
}
