package co.newcomers.prj.itemlist.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.newcomers.prj.common.Command;

public class ItemDetailForm implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 상품 상세보기
		return "item/itemDetailForm.tiles";

	}

}
