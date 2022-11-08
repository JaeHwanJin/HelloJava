package co.micol.prj.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.book.command.BookList;
import co.micol.prj.common.Command;
import co.micol.prj.main.MainCommand;
import co.micol.prj.member.command.AjaxIdCheck;
import co.micol.prj.member.command.Logout;
import co.micol.prj.member.command.MemberJoinForm;
import co.micol.prj.member.command.MemberLogin;
import co.micol.prj.member.command.MemberLoginForm;

/**
 * 모든요청을 받아들이는 컨트롤러
 */
@WebServlet("*.do") //어노테이션을 이용한 Mapping.
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, Command> map = new HashMap<String, Command>(); 
    
    public FrontController() {
        super();
    }
    
    //요청한 것을 실행하는 명령을 모아 두는 곳.
	public void init(ServletConfig config) throws ServletException {
		map.put("/main.do", new MainCommand()); //처음 보여줄 페이지 명령.
		map.put("/bookList.do", new BookList());
		map.put("/memberLoginForm.do", new MemberLoginForm()); //로그인 폼 호출
		map.put("/memberLogin.do", new MemberLogin()); // 멤버로그인 처리.
		map.put("/Logout.do", new Logout()); // 로그아웃
		map.put("/memberJoinForm.do", new MemberJoinForm()); // 회원가입 폼 호출
		map.put("/ajaxIdCheck.do", new AjaxIdCheck());
	}
	
	//요청을 분석하고 실행, 결과를 돌려주는 곳
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //한글깨짐 방지.
		String uri = request.getRequestURI(); //요청한 uri를 구함. 도메인네임을 제외한 부분을 uri, 전체주소는 url 첫번쨰 디렉토리가 contextpath, contextepath뒤 나머지를 요청함.
		String contextPath = request.getContextPath(); //루트를 구함.정확하게는 contextPath를 구함.
		String page = uri.substring(contextPath.length()); //contextPath만큼빼고 실제 수행할 요청을 구함.
		
		Command command = map.get(page); // init 메소드에서 수행할 명령을 가져온다.
		
//		Command command = new MainCommand(); 위와 같은 코드임.
		String viewPage = command.exec(request, response); //명령을 수행하고 결과를 돌려받음.
		
		//viewReslove 파트
		if(!viewPage.endsWith(".do") && viewPage != null) { //문자열의 마지막이 .do가 아니고 null이 아니면..
			//ajax(요청한페이지에 결과를 주는것) 처리.
			if(viewPage.startsWith("ajax:")) {
				response.setContentType("text/html; charset=UTF-8");
				response.getWriter().append(viewPage.substring(5));
				return;
			}
			// 타일즈 돌아가는곳.(if!변수명.endswith(".tiles")
			if(!viewPage.endsWith(".tiles"))
			viewPage = "/WEB-INF/views/" + viewPage + ".jsp"; //여기는 서버이기때문에 WEB-INF안의 페이지에 접근가능.
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response); // request 객체에 값을 다시 전달해줌. 내가가진값을 전달해주는게 dispatcher
		} else {
			response.sendRedirect(viewPage); // .do 로 들어오면 돌아가는 곳. //권한을 위임하나 그냥갔다옴(값이없음?) 값을 안전달해주는게 snedredirect, forward로 같음.
		}	
	}
}
