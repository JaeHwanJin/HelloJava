package co.micol.prj.book.mapper;

import java.util.List;

import co.micol.prj.book.vo.BookVO;

public interface BookMapper {
	//대부분 mapper와 service는 일치함. 나중에 파라메터 전달방식이 다를수있기때문에 같더라도 두 가지 다 만들어줌.
	List<BookVO> bookSelectList();  //book 전체리스트 가져오기 현업에선getBookList(R)로 메소드명을 짓기도함.
	BookVO bookSelect(BookVO vo);  //한권의 책 상세내역 가져오기(R) getBook
	int bookInsert(BookVO vo);    //도서입력(C)setBook
	int bookDelete(BookVO vo);   //도서삭제(D)deleteBook
	int bookUpdate(BookVO vo);  //도서변경(U)updateBook  인터페이스는 기본적인 CRUD가 포함되야함.
}
