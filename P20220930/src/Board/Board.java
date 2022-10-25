//게시판 프로그램
//1. 글등록
//2. 글목록
//3. 글번호 조회
//4. 글번호 삭제
//5. 종료
//
//게시글 => 글번호, 제목, 내용 => Board

package Board;

public class Board {

	private int boardNo;
	private  String title;
	private String	contnet;
	
	public Board() {}
	
	public Board(int boardNo, String title, String contnet) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.contnet = contnet;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContnet() {
		return contnet;
	}

	public void setContnet(String contnet) {
		this.contnet = contnet;
	}

	@Override
	public String toString() {
		return "Board [boardNo = " + boardNo + ", title = " + title +
				", contnet = " + contnet + "]";
	}
		
	
	
		
	
		
	
		
	

}
