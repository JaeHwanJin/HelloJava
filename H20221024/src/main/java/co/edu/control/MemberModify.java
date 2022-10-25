package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Command;
import co.edu.common.HttpUtil;
import co.edu.service.MemberService;
import co.edu.service.MemberServiceImpl;
import co.edu.vo.MemberVO;

public class MemberModify implements Command {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 사용자입력정보를 parameter 읽어와야된다.
		String id = req.getParameter("id");
		String pass = req.getParameter("passwd");
		String name = req.getParameter("name");
		String mail = req.getParameter("email");
		String rs = req.getParameter("responsibility");

		MemberService service = new MemberServiceImpl();
		service.modifyMember(new MemberVO(id, pass, name, mail, rs));

		HttpUtil.forward(req, resp, "memberResult/memberUpdateOutput.jsp");
	}

}
