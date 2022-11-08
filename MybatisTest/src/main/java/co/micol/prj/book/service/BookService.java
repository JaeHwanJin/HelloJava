package co.micol.prj.book.service;

import java.util.List;

import co.micol.prj.book.vo.BookVO;

public interface BookService {
	List<BookVO> bookSelectList();  //book 전체리스트 가져오기 현업에선getBookList(R)로 메소드명을 짓기도함.
	BookVO bookSelect(BookVO vo);  //한권의 책 상세내역 가져오기(R) getBook
	int bookINsert(BookVO vo);    //도서입력(C)setBook
	int bookDelete(BookVO vo);   //도서삭제(D)deleteBook
	int bookUpdate(BookVO vo);  //도서변경(U)updateBook  인터페이스는 기본적인 CRUD가 포함되야함.
	
	
}
