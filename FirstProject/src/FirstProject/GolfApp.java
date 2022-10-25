package FirstProject;

import java.io.IOException;
import java.util.Scanner;

public class GolfApp {
	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		GolfDAO app = new GolfDAO();
		ScreenDAO App = new ScreenDAO();

		loop: while (true) {
			System.out.println("1.관리자 로그인 2.회원 로그인 3.프로그램 종료");
			System.out.print("선택 -> ");
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				if (app.Login(menu) == 1) {
					System.out.println(" ");
					System.out.println("로그인 성공");
					System.out.println(" ");
					while (true) {
						System.out.println("1.회원 등록 2.회원 조회 3.상세조회 4.회원정보 수정 5.회원 삭제  9.로그아웃");
						int Secondmenu = Integer.parseInt(scn.nextLine());
						if (Secondmenu == 1) {
							app.add();
						} else if (Secondmenu == 2) {
							app.Search();
						} else if (Secondmenu == 3) {
							app.searchMem();
						} else if (Secondmenu == 4) {
							app.update();
						} else if (Secondmenu == 5) {
							app.delete();
						} else if (Secondmenu == 9) {
							System.out.println("로그아웃합니다.");
							System.out.println(" ");
							break;
						}
					}
				} // end of Staff

			} else if (menu == 2) {
				if (app.Login(menu) == 2) {
					System.out.println("로그인 성공");
					System.out.println(" ");
					
					while (true) {
						System.out.println("1.스크린 예약 2.예약내역 조회 3.예약 변경 4.예약 취소  9.로그아웃");
						int Thrmenu = Integer.parseInt(scn.nextLine());
						if (Thrmenu == 1) {
							App.Reservation();
						} else if (Thrmenu == 2) {
							App.searchScr();
						} else if (Thrmenu == 3) {
							App.update();
						} else if (Thrmenu == 4) {
							App.delete();
						} else if (Thrmenu == 9) {
							System.out.println("로그아웃합니다.");
							break;
						}
					}
				}
			} // end of Screen
			else if (menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				break loop;
			} else {
				System.out.println("올바른 메뉴번호를 입력하세요");
			}

		}

	}
}

