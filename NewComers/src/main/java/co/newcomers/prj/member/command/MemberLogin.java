package co.newcomers.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.newcomers.prj.cart.service.CartService;
import co.newcomers.prj.cart.service.impl.CartServiceImpl;
import co.newcomers.prj.common.Command;
import co.newcomers.prj.member.service.MemberService;
import co.newcomers.prj.member.service.impl.MemberServiceImpl;
import co.newcomers.prj.member.vo.MemberVO;

public class MemberLogin implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 로그인 처리
		MemberService dao = new MemberServiceImpl();
		CartService cartdao = new CartServiceImpl();
		MemberVO member = new MemberVO();
		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		String message = "아이디 또는 패스워드가 틀립니다.";
			
		member = dao.memberLogin(id, password);
		
		System.out.println(member);
		if(member != null) {
			session.setAttribute("id", member.getId());
			session.setAttribute("password", member.getPassword());
			session.setAttribute("name", member.getName());
			session.setAttribute("email", member.getEmail());
			session.setAttribute("address", member.getAddress());
			session.setAttribute("grade", member.getGrade());
			
			MemberVO vo = new MemberVO();
			vo.setId(member.getId());
			vo.setPassword(member.getPassword());
			vo.setName(member.getName());
			vo.setEmail(member.getEmail());
			vo.setAddress(member.getAddress());
			vo.setGrade(member.getGrade());
			int cart = cartdao.mycartCount(vo);
			System.out.println(vo.getId());
			System.out.println(cart);
			
			session.setAttribute("cartcount", cart);
			System.out.println("로그인 완료!");
			
		} else {
			System.out.println("등록된 정보가 없습니다.");
			return "member/memberLoginForm.tiles";
		}
		return "main/main.tiles";
	}

}
