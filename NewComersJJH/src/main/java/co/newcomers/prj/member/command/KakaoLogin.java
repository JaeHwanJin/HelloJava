package co.newcomers.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.newcomers.prj.common.Command;
import co.newcomers.prj.member.service.MemberService;
import co.newcomers.prj.member.service.impl.MemberServiceImpl;
import co.newcomers.prj.member.vo.MemberVO;

public class KakaoLogin implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 카카오 로그인
		System.out.println("확인");
		MemberService dao = new MemberServiceImpl();
		MemberVO member = new MemberVO();
		HttpSession session = request.getSession();

		String email = request.getParameter("email");
		System.out.println("1.이메일="+email);
		String nickname = request.getParameter("nickname");
		System.out.println("2.닉네임="+nickname);
		member = dao.memberSelect2(email);
		
		System.out.println(member);
		String result = "0";
		
		if(member != null) {
		
		session.setAttribute("id", email);
		session.setAttribute("password", member.getPassword());
		session.setAttribute("nickname", nickname);
		session.setAttribute("name", nickname);
		session.setAttribute("email", email);
		session.setAttribute("address", member.getAddress());
		session.setAttribute("grade", member.getGrade());
		result = "1";
		System.out.println("로그인 완료!");
		
		}else {
			session.setAttribute("id", email);
			session.setAttribute("email", email);
			session.setAttribute("nickname", nickname);
			session.setAttribute("name", nickname);
			System.out.println("등록된 정보가 없습니다.");
			
			return "memberSignUpForm.do";
		}
		return "main.do";
	}

}
