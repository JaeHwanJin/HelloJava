package co.newcomers.prj.item.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.newcomers.prj.common.Command;
import co.newcomers.prj.item.service.ItemService;
import co.newcomers.prj.item.service.impl.ItemServiceImpl;
import co.newcomers.prj.item.vo.ReviewVO;

public class ReviewRs implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 리뷰등록
		System.out.println("뜨나");

		ItemService dao = new ItemServiceImpl();
		ReviewVO Vo = new ReviewVO();
		
		Vo.setReviewWriter(request.getParameter("reviewWriter"));
		Vo.setReviewContent(request.getParameter("reviewContent"));
		Vo.setItemCode(request.getParameter("itemCode"));
		Vo.setReviewStar(request.getParameter("reviewStar"));
		Vo.setReviewDate(request.getParameter("reviewDate"));

		int n = dao.reviewInsert(Vo);
		if(n > 0) {
			System.out.println("리뷰등록 완료!");
		}else {
			System.out.println("리뷰등록 실패");
		}
		
		return "item/itemDetailForm.tiles";
	}

}
