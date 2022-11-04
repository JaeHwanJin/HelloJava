package co.edu.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.edu.book.BookVO;
import co.edu.common.BookDAO;

@WebServlet("/BookAddServlet")
public class BookAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BookAddServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/json;charset=utf-8");
		BookDAO dao = new BookDAO();
		List<BookVO> list = dao.bookList();
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		String job = request.getParameter("job");
		String book_code = request.getParameter("book_code");
		BookDAO dao = new BookDAO();
		// job => 등록인지 삭제인지 구분 할 수 있도록
		if(job.equals("delete")) {
			if(dao.deleteBook(book_code)) {
				response.getWriter().print("success");
			} else {
				response.getWriter().print("fail");
			}
		} else if(job.equals("insert")) {
			String book_name = request.getParameter("book_name");
			String author = request.getParameter("author");
			String press = request.getParameter("press");
			String price = request.getParameter("price");

			BookVO vo = new BookVO();
			vo.setBook_code(book_code);
			vo.setBook_name(book_name);
			vo.setAuthor(author);
			vo.setPress(press);
			vo.setPrice(price);
			
			dao.insertMember(vo); 
			Gson gson = new GsonBuilder().create(); 

			response.getWriter().print(gson.toJson(vo));
		}
	
	}

}

