package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Control;

public class SignIn implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// 아이디, 패스워드 => 검증 맞으면 session객체에 id값을 저장.
			// 로그인성공했습니다. signIn.jsp(로그인성공페이지)
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");

	}

}