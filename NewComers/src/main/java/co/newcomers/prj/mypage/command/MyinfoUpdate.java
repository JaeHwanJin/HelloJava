package co.newcomers.prj.mypage.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.newcomers.prj.common.Command;
import co.newcomers.prj.member.vo.MemberVO;
import co.newcomers.prj.mypage.service.MypageService;
import co.newcomers.prj.mypage.service.impl.MypageServiceImpl;

public class MyinfoUpdate implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		String id = (String) session.getAttribute("id");
		System.out.println(id);
		String pass = (String) session.getAttribute("password");
		System.out.println("현재 로그인된 아이디 비밀번호 : "+ pass);
		String email = (String) session.getAttribute("email");
		
//확인용		
		String password = (String) request.getParameter("password");
		System.out.println("password " + password );		
		String changepassword = (String) request.getParameter("changepassword");
		System.out.println("changepassword " + changepassword);
		String changepassword2 = (String) request.getParameter("changepassword2");
		System.out.println("changepassword2 " + changepassword2);
		String name = (String) request.getParameter("name");
		System.out.println("name " + name);
		String address = (String) request.getParameter("address");
		System.out.println("address " + address);

		if(session.getAttribute("password").equals(password)&&changepassword.equals(changepassword2)) {
			MypageService dao = new MypageServiceImpl();
			MemberVO vo = new MemberVO();
			
			vo.setId(id);
			vo.setEmail(email);
			vo.setPassword(changepassword);
			vo.setName(name);
			vo.setAddress(address);
			dao.myselfUpdate(vo);
			return "main/main.tiles";			
		}
		return "mypage/mypageUpdate.tiles";
	}

}
