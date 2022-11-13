package co.newcomers.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.newcomers.prj.common.Command;

public class Logout implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 로그아웃 처리
		
		HttpSession session = request.getSession();;
		session.invalidate();
		return "main/main.tiles";
	}

}
