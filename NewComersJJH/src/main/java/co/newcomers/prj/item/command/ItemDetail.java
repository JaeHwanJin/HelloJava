package co.newcomers.prj.item.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.newcomers.prj.common.Command;
import co.newcomers.prj.item.service.ItemService;
import co.newcomers.prj.item.service.impl.ItemServiceImpl;
import co.newcomers.prj.item.vo.ItemVO;

public class ItemDetail implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 상품 하나만 출력
		
		ItemService dao = new ItemServiceImpl();
		List<ItemVO> items = new ArrayList<>();
		
		items = dao.itemSelect();
		
		request.setAttribute("items", items); 
		
		return "Item/itemDetailForm.tiles" ;
	}

}
