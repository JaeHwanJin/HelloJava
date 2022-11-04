package co.edu.common;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.book.BookVO;

public class BookDAO extends DAO{

	// 데이터 한건 삭제
	public boolean deleteBook(String book_code) {
		getConnect();
		String sql = "delete from tbl_book where book_code = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book_code);
			int r = psmt.executeUpdate();
			if(r > 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}
	
	// 데이터 한건 등록.
	public void insertMember(BookVO vo) {		
		getConnect();
		String sql = "insert into tbl_book (book_code, book_name, author, press, price)"//
					+ " values(?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBook_code());
			psmt.setString(2, vo.getBook_name());
			psmt.setString(3, vo.getAuthor());
			psmt.setString(4, vo.getPress());
			psmt.setString(5, vo.getPrice());
			psmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public List<BookVO> bookList() {
		getConnect();
		List<BookVO> list = new ArrayList<>();
		String sql = "select * from tbl_book order by book_code asc";
		try{
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				BookVO vo = new BookVO();
				vo.setBook_code(rs.getString("book_code"));
				vo.setBook_name(rs.getString("book_name"));
				vo.setAuthor(rs.getString("author"));
				vo.setPress(rs.getString("press"));
				vo.setPrice(rs.getString("price"));
				
				list.add(vo);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			return list;
		}

	}
