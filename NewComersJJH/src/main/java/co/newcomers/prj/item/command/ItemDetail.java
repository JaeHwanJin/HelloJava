package co.newcomers.prj.item.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.newcomers.prj.common.Command;
import co.newcomers.prj.item.service.ItemService;
import co.newcomers.prj.item.service.impl.ItemServiceImpl;
import co.newcomers.prj.item.vo.ItemDetailVO;
import co.newcomers.prj.item.vo.ReviewVO;

public class ItemDetail implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("확인");
		// String id = request.getParameter("id");
		String id = "1";
		ItemDetailVO vo = new ItemDetailVO();
		ReviewVO Vo = new ReviewVO();

		vo.setItemCode(id);
		Vo.setReviewCode(id);
		
		ItemService dao = new ItemServiceImpl();
		
		ItemDetailVO item = new ItemDetailVO();
		ReviewVO review = new ReviewVO();
		
		item = dao.itemSelect(vo);
		review = dao.reviewSelect(Vo);
		
		System.out.println(item);
		System.out.print(review);

		HttpSession session = request.getSession(); //세션값을 사용하기 위해

		session.setAttribute("item", item);
		session.setAttribute("review", review);

		return "item/itemDetailForm.tiles";

	}
}
