package co.edu.service;

import java.util.List;

import co.edu.board.BoardVO;
import co.edu.board.MemberVO;

public interface BoardService {
	// 기능만 정의
	public BoardVO insertBoard(BoardVO vo);
	public List<BoardVO> getList(BoardVO vo);
	public BoardVO findBoard(int boardNo);
	public boolean updateBoard(BoardVO vo);
	public boolean deleteBoard(int boardNo);
	
	// 페이지
	public List<BoardVO> pageList(int page);
	
	// 회원목록
	public List<MemberVO> memberList();
	
	// 회원가입
	public MemberVO insertMember(MemberVO vo);
	
	// 로그인
	public MemberVO loginMember(String id, String pw);

	
}
