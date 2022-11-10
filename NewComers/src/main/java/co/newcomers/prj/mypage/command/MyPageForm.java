package co.newcomers.prj.mypage.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.newcomers.prj.common.Command;

public class MyPageForm implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
	
		return "mypage/mypage.tiles";
	}

}
