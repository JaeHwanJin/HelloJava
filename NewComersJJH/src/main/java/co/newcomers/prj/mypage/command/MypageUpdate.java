package co.newcomers.prj.mypage.command;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.newcomers.prj.common.Command;

public class MypageUpdate implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		String password = (String) session.getAttribute("password");
		String pwvalue = request.getParameter("password");
		System.out.println("현재 로그인된 유저 " + id);
		System.out.println("로그인된 유저의 비밀번호 " + password);
		System.out.println("값을 넣었던 비밀번호 페이지의 값" + pwvalue);
		if(pwvalue.equals(password)) {
			session.setAttribute("updateid", id);
			
			return "mypage/mypageUpdate.tiles";
		}
		return "mypage/mypage.tiles";
	}

}
