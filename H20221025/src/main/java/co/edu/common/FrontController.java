package co.edu.common;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.control.BulletinControl;
import co.edu.control.MainControl;
import co.edu.control.MemberList;
import co.edu.control.SearchBoard;
import co.edu.control.SignIn;
import co.edu.control.SignInForm;
import co.edu.control.SignUp;
import co.edu.control.SignUpForm;
import co.edu.control.WriteBoard;
import co.edu.control.WriteForm;

public class FrontController extends HttpServlet{
	
	HashMap<String, Control> controlList ;
	String charset;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		charset = config.getInitParameter("chareset");
		controlList = new HashMap<String, Control>();
		
		controlList.put("/main.do", new MainControl());
		controlList.put("/bulletin.do", new BulletinControl());
		controlList.put("/searchBoard.do",  new SearchBoard());
		controlList.put("/writeBoardForm.do", new WriteForm());
		controlList.put("/writeBoard.do", new WriteBoard());
		
		// 회원가입
		controlList.put("/signUpForm.do", new SignUpForm()); // 회원가입화면
		controlList.put("/signUp.do", new SignUp());	// 회원가입처리 게시판목록으로 이동
		
		// 회원 상세보기
		controlList.put("/memberList.do", new MemberList());
		
		controlList.put("/signInForm.do", new SignInForm()); // 로그인화면
		controlList.put("/signIn.do", new SignIn()); // 로그인 처리

	}
	
	
	// service()
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String url = req.getRequestURI(); // http://localhost:8081/H20221025/main.do
		String context = req.getContextPath(); //H20221025
		String path = url.substring(context.length());
		
		System.out.println(path);
		Control subControl = controlList.get(path);
		subControl.exec(req, resp);
	}
	
	
}
