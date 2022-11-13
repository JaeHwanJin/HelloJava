package co.newcomers.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.newcomers.prj.common.Command;
import co.newcomers.prj.member.service.MemberService;
import co.newcomers.prj.member.service.impl.MemberServiceImpl;
import co.newcomers.prj.member.vo.MemberVO;

public class MemberDelete implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		//회원 탈퇴
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		vo.setId(id);
		

		System.out.println(id);

		int n = dao.memberDelete(vo);
		if(n > 0) {
			session.invalidate();
			System.out.println("회원탈퇴 완료!");
		}else {
			System.out.println("회원탈퇴 실패!");
		}

		return "main/main.tiles";
	}

}
