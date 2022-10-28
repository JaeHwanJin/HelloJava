package co.test.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.test.vo.BookVO;

public class BookDAO extends DAO {

	public List<BookVO> bookList() {
		List<BookVO> list = new ArrayList<BookVO>();
		
		conn();
		
		String sql = "select * from book_info";

		try {
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			while (rs.next()) {
				BookVO book = new BookVO();
				book.setBookCode(rs.getString("book_code"));
				book.setBookTitle(rs.getString("book_title"));
				book.setBookAuthor(rs.getString("book_author"));
				book.setBookPress(rs.getString("book_press"));
				book.setBookPrice(rs.getInt("book_price"));

				list.add(book);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return null;
	}

	public BookVO selectBook(String bookCode) {
		
		conn();
		
		String sql = "select * from book_info where book_code = ?";
		BookVO vo = new BookVO();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookCode);

			rs = psmt.executeQuery();

			if (rs.next()) {
				vo.setBookCode(rs.getString("book_code"));
				vo.setBookTitle(rs.getString("book_title"));
				vo.setBookAuthor(rs.getString("book_author"));
				vo.setBookPress(rs.getString("book_press"));
				vo.setBookPrice(rs.getInt("book_price"));

				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return vo;
	}

	public void insertBook(BookVO book) {
		
		conn();
		
		String sql = "insert into book_info values(create_bookcode, ?, ?, ?, ?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getBookTitle());
			psmt.setString(2, book.getBookAuthor());
			psmt.setString(3, book.getBookPress());
			psmt.setInt(4, book.getBookPrice());

			int r = psmt.executeUpdate();
			if (r > 0) {
				System.out.println(r + "건 입력 성공!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
	}

	public void updateBook(BookVO book) {
		
		conn();
		
		String sql = "update book_info set book_price = ? where book_code = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, book.getBookPrice());
			psmt.setString(2, book.getBookCode());

			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
	}

	public void deleteBook(String bookCode) {
		
		conn();
		
		String sql = "delete from book_info where book_code = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookCode);

			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
	}
}
