package co.newcomers.prj.mypage.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.newcomers.prj.common.Command;

public class MyinfoUpdate implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		String id = (String) request.getAttribute("id");
		System.out.println(id);
		String password = (String) request.getAttribute("password");
		System.out.println(password);
		String changepassword = (String) request.getAttribute("changepassword");
		System.out.println(changepassword);
		String changepassword2 = (String) request.getAttribute("changepassword2");
		System.out.println(changepassword2);
		String name = (String) request.getAttribute("name");
		System.out.println(name);
		String address = (String) request.getAttribute("address");
		System.out.println(name);
		String message = id +"님의 정보가 변경되었습니다";
		if(session.getAttribute("password").equals(password)&&changepassword.equals(changepassword2)) {
			session.setAttribute("message", message);
			return "main/main.tiles";
			
		}
		return null;
	}

}
