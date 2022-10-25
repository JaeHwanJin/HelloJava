package Variable;

import java.util.Scanner;


// 계좌정보 선언 : 계좌번호, 예금주, 잔고
// 은행 계좌생성 : Account[] banks;

public class WhileBank {
	public static void main(String[] args) {
		// 메뉴 : 1. 예금, 2. 출금 3. 잔액 4. 종료

		Account[] banks = new Account[10];

		Scanner scn = new Scanner(System.in);
	
		Account acc = new Account(); // 인스턴스 생성
		
		while (true) {
			System.out.println("0.계좌생성 1.예금 2.출금 3.잔액 4.종료");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 0) {
				System.out.println("계좌번호를 입력하십시오.");
				String accNo = scn.nextLine();

				System.out.println("예금주를 입력하십시오.");
				String owner = scn.nextLine();

//				Account acc = new Account(); // 인스턴스 생성
				acc.accNo = accNo;
				acc.owner = owner;

				// 계좌번호 생성.
				for (int i = 0; i < banks.length; i++) {

					if (banks[i] == null) {
						// 한건 입력. break
						banks[i] = acc;
						break;
					}
				}
				System.out.println("계좌생성이 완료되었습니다.");
			}

			else if (menu == 1) {
				System.out.println("계좌번호를 입력해주십시오.");
				String accNo = scn.nextLine();
				for (int i = 0; i < banks.length; i++) {
				
				}
				System.out.println("예금하실 금액을 입력해 주십시오.");
				int money = scn.nextInt();
				for (int i = 0; i < banks.length; i++) {
					if (banks[i] != null && banks[i].accNo.equals(accNo)) {
						banks[i].balance = banks[i].balance + money;
					}
				}
			} 
			else if (menu == 2) {
				System.out.println("계좌번호를 입력해주십시오.");
				String accNo = scn.nextLine();
				System.out.println("출금하실 금액을 입력해 주십시오.");
				int money = scn.nextInt();
				for (int i = 0; i < banks.length; i++) {
					if (banks[i] != null && banks[i].accNo.equals(accNo))
						if (banks[i].balance < money) {
							System.out.println("잔액이 부족합니다.");
							break;
						}
						else {banks[i].balance = banks[i].balance - money;
					{
						
					}
				}
			}
			}
			else if (menu == 3) {
				System.out.println("조회 할 계좌번호를 입력해주십시오.");
				String accNo = scn.nextLine();
				for (int i = 0; i < banks.length; i++) {
					if (banks[i] != null && banks[i].accNo.equals(accNo))
						System.out.println("잔액 : " + banks[i].balance);
				}
			} 
			else if (menu == 4) {
				break;
			}
		}
		System.out.println("서비스가 종료되었습니다.");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	public static void main(String[] args) {
		bankApp();
	}
	
	public static void bankApp() {
		Scanner scn = new Scanner(System.in);
		
		boolean run = true; // true 나 false 값 지정
		int money = 0;
		int outmoney = money;
		// 메뉴 : 1 : 예금, 2 : 출금, 3 : 잔고, 4 : 종료
		// 10만원이 넘으면 예금 불가
		
		while(run) {
			System.out.println("1 : 예금, 2 : 출금, 3 : 잔고, 4 : 종료");
			int menu = scn.nextInt();
			
			switch (menu) {
			
			case 1: 
				System.out.println("예금을 처리하는 메뉴입니다.");
				System.out.println("예금액을 입력하세요 : ");
				int input = scn.nextInt();
				money = money + input;
				if(money > 99999) {
					money -= input;
					System.out.println("잔고한도액 초과로 인해 입금이 되지 않았습니다.");
				}
				break;
			case 2:
				System.out.println("출금하는 메뉴입니다.");
				System.out.println("출금액을 입력하세요 : ");
				int output = scn.nextInt();
				if(money - output > money) {
					money -= output;
				}
				else {
					money = money - output;
				}
				break;
			case 3:
				System.out.println("잔고를 조회하는 메뉴입니다.");
				System.out.println("현재잔고는 : " + money + "원 입니다.");
				break;
			case 4:
				System.out.println("종료하겠습니다");
				run = false;
			}		
			if(menu == 4) {
				break;
			}
			
		} // end of While
		System.out.println("end of program");
	} // end of bankApp()
	*/


