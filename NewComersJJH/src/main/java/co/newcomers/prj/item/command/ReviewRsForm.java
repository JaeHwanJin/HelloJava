package co.newcomers.prj.item.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.newcomers.prj.common.Command;

public class ReviewRsForm implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return "item/itemRsForm.tiles";
	}

}
