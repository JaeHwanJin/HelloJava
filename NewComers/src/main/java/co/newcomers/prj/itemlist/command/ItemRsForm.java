package co.newcomers.prj.itemlist.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.newcomers.prj.common.Command;

public class ItemRsForm implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 상품등록 화면
		return "item/itemRsForm.tiles";
	}

}
