package Board;

import java.util.List;
import java.util.Scanner;

// main
public class BoardApp {
	public static void main(String[] args) {

		BoardDAO dao = new BoardDAO();
		Scanner scn = new Scanner(System.in);

//		 1.사원등록 2.한건조회 3.수정 4.삭제 5.목록조회 9.종료

		while (true) {
			System.out.println("1.글 등록 2.글 수정 3.글 삭제 4.글 목록 5.상세조회 9.종료");
			System.out.print("원하는 메뉴를 입력하세요 >> ");

			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.println("등록 할 글의 번호를 입력하세요");
				int wId = scn.nextInt();
				scn.nextLine();
				System.out.println("등록 할 글의 제목을 입력하세요");
				String wName = scn.nextLine();
				System.out.println("등록 할 글의 내용을 입력하세요");
				String wContents = scn.nextLine();
				System.out.println("등록 할 글의 작성자를 입력하세요");
				String Writer = scn.nextLine();
				System.out.println("등록 할 글의 작성일시를 입력하세요");
				String DW = scn.nextLine();
				System.out.println("등록 할 글의 읽은 횟수를 입력하세요");
				int NR = scn.nextInt();
				

				dao.insert(new Board(wId, wName, wContents, Writer, DW, NR));

			}

			else if (menu == 2) {
				
				System.out.println("수정 할 글의 번호를 입력하세요");
				int wId = scn.nextInt();
				scn.nextLine();
				System.out.println("수정 할 글의 내용을 입력하세요");
				String wContents = scn.nextLine();
	
				
				dao.update(wId, wContents);
				
			} else if (menu == 3) {
				System.out.println("삭제 할 글의 번호를 입력하세요");
				
				int wId = Integer.parseInt(scn.nextLine());
				
				dao.delete(wId);
				

				 
			} else if (menu == 4) {
				
				List<Board> Boards = dao.search();
				for (Board brd : Boards) {
					System.out.println(brd);
				}

			} else if (menu == 5) {

				System.out.println("조회 할 글의 번호를 입력하세요");

				int wId = Integer.parseInt(scn.nextLine());

				dao.getEmp(wId);

			} else if (menu == 9) {
				break;
			}

		}
	}

}
