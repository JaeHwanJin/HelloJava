package co.newcomers.prj.item.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.newcomers.prj.common.Command;
import co.newcomers.prj.item.service.ItemService;
import co.newcomers.prj.item.service.impl.ItemServiceImpl;
import co.newcomers.prj.item.vo.ItemVO;

public class ItemRs implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 상품등록
		ItemService dao = new ItemServiceImpl();
		ItemVO vo = new ItemVO();
				
		vo.setItemName(request.getParameter("itemName"));
		vo.setItemPrice(Integer.parseInt(request.getParameter("itemPrice")));
		vo.setItemId(request.getParameter("itemId"));

								
		System.out.println(vo);
		
		int n = dao.itemInsert(vo);
		if(n > 0) {
			System.out.println("상품등록 완료!");
		}else {
			System.out.println("상품등록 실패");
		}
		return "Item/itemRsForm";
	}
}
