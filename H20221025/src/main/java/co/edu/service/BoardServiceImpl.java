package co.edu.service;

import java.util.List;

import co.edu.board.BoardVO;
import co.edu.board.MemberVO;
import co.edu.dao.BoardDAO;

public class BoardServiceImpl implements BoardService{

	BoardDAO dao = new BoardDAO();
	
	@Override
	public BoardVO insertBoard(BoardVO vo) {
		return dao.insertBoard(vo);
	}

	
	@Override
	public List<BoardVO> getList(BoardVO vo) {
		return dao.boardList(vo);
	}

	@Override
	public BoardVO findBoard(int boardNo) {
		return dao.searchBoard(boardNo);
	}

	@Override
	public boolean updateBoard(BoardVO vo) {
		return dao.updateBoard(vo);
	}

	@Override
	public boolean deleteBoard(int boardNo) {
		return dao.deleteBoard(boardNo);
	}
	
	@Override
	public List<BoardVO> pageList(int page){
		return dao.pageList(page);
	}


	@Override
	public List<MemberVO> memberList() {
		return dao.memberList();
	}


	@Override
	public MemberVO insertMember(MemberVO vo) {
		return dao.signUpBoard(vo);
	}


	@Override
	public MemberVO loginMember(String id, String pw) {
		return dao.login(id, pw);
	}
}
