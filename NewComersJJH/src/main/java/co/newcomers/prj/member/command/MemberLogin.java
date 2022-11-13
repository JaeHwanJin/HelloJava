package co.newcomers.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.newcomers.prj.common.Command;
import co.newcomers.prj.member.service.MemberService;
import co.newcomers.prj.member.service.impl.MemberServiceImpl;
import co.newcomers.prj.member.vo.MemberVO;

public class MemberLogin implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 로그인 처리
		MemberService dao = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		
	
		
		member = dao.memberLogin(id, password);
//		response.getWriter();
		
		System.out.println(member);
		if(member != null) {
			session.setAttribute("id", member.getId());
			session.setAttribute("password", member.getPassword());
			session.setAttribute("nickname", member.getNickname());
			session.setAttribute("name", member.getName());
			session.setAttribute("email", member.getEmail());
			session.setAttribute("address", member.getAddress());
			session.setAttribute("grade", member.getGrade());
			System.out.println("로그인 완료!");

		} else {
		
			System.out.println("등록된 정보가 없습니다.");
			return "member/memberLoginForm.tiles";
		}
		return "main/main.tiles";
	}

}
