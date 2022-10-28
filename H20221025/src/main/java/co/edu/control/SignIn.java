package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edu.board.MemberVO;
import co.edu.common.Control;
import co.edu.common.HttpUtil;
import co.edu.service.BoardService;
import co.edu.service.BoardServiceImpl;

public class SignIn implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// 아이디, 패스워드 => 검증 맞으면 session객체에 id값을 저장.
			// 로그인성공했습니다. signIn.jsp(로그인성공페이지)
		HttpSession session = req.getSession();
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		BoardService service = new BoardServiceImpl();
		
		// 회원아이디와 비밀번호 => main.jsp이동.
				if (service.loginMember(id, pw).equals(id)) {
					session.setAttribute("id", id);
					HttpUtil.forward(req, resp, "member/singInCom.tiles");
					
				} else {
					HttpUtil.forward(req, resp, "member/singInForm.tiles");
					System.out.println("입력하신 ID 또는 PW가 올바르지 않습니다.");

				}
			}
	}

