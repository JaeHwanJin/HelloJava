package Board;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

// 기능만.
public class BoardDao {
	
	// Singleton 방식의 인스턴스 생성.
	private static BoardDao instance = new BoardDao();
	private BoardDao(){}
	public static BoardDao getInstance() {
		return instance;
		
	}
	
	Scanner scn = new Scanner(System.in);
	Board[] myBoards = new Board[100];
			
	// 1.글 등록
	public void addBoard() {
		System.out.println("글 등록 기능");
		
		System.out.print("글 번호 입력 --> ");
		int bNo = scn.nextInt();
		
		scn.nextLine();
		
		System.out.print("글 제목 입력 --> ");
		String title = scn.nextLine();
		
		System.out.print("글 내용 입력 -->");
		String content = scn.nextLine();
		
		Board brd = new Board(bNo, title, content);
		
		//배열등록
		for(int i =0; i < myBoards.length; i++) {
			if(myBoards[i] == null) {
				myBoards[i] = brd;
				break;
			}
		}
			
	}
	
	// 2.글 목록
	public void boardList() {
		System.out.println("글 목록 기능");
		for(Board brd : myBoards) {
			if(brd != null) {
					System.out.println(brd.toString());
				
			}
		}
	}
	
	// 3.글상세보기
	public void boardDetail() {
		System.out.println("글 상세보기");
		System.out.println("글 번호 입력 --> ");
		int boardNo = scn.nextInt();
		for(Board brd : myBoards) {
			if(brd != null) {
				if( boardNo == brd.getBoardNo() ) {
				System.out.println(brd.toString());
				break;
				}
			}
		}

	}
		
	// 4.글 삭제
	public void boardDelete() {
		System.out.println("글 삭제");
		System.out.println("삭제할 글 번호 입력 --> ");
		int boardNo = scn.nextInt();
		for(Board brd : myBoards) {
			
		}
	}
	// 5. 전체 메뉴
	
	public void exe() {
		
		boolean run = true;
		while(run) {
			System.out.println("1.글 등록 2.글 목록 3.글 상세보기 4.글 삭제 9.종료");
			System.out.println("선택 -->");
			
			int menu = scn.nextInt();
			switch (menu) {
			
			case 1 : addBoard(); 
					break;

			case 2 : boardList();
					break;

			case 3 : boardDetail();
					break;
			
			case 4 : boardDelete();
					break;
			
			case 9 : run = false;
					break;
			}
		} // end of while
		
		System.out.println("프로그램 종료");
		
	} // end of exe()
}
