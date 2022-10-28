package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.common.Controller;
import co.test.common.HttpUtil;
import co.test.service.BookService;
import co.test.vo.BookVO;

public class ModifyBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookCode = request.getParameter("bookCode");
		int price = Integer.parseInt(request.getParameter("price"));
		
		BookService service = new BookService();
		
		BookVO vo = new BookVO(bookCode,null, null, null, price);
		
		service.modifyBook(vo);		

		HttpUtil.forward(request, response, "WEB-INF/result/modifyOutput.jsp");

	}

}
