package co.newcomers.prj.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.newcomers.prj.common.Command;
import co.newcomers.prj.detailorder.command.MydetailOrderList;
import co.newcomers.prj.itemlist.command.Category;
import co.newcomers.prj.main.MainCommand;
import co.newcomers.prj.member.command.MemberLogin;
import co.newcomers.prj.member.command.MemberLoginForm;
import co.newcomers.prj.member.command.MemberSignUp;
import co.newcomers.prj.mypage.command.MyPageForm;
import co.newcomers.prj.mypage.command.MyinfoUpdate;
import co.newcomers.prj.mypage.command.MyorderlistForm;
import co.newcomers.prj.mypage.command.MypageUpdate;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();
    public FrontController() {
        super();

    }

	public void init(ServletConfig config) throws ServletException {
		map.put("/main.do", new MainCommand()); // 처음 보여줄 페이지 명령.
		//나
		map.put("/myPageForm.do", new MyPageForm());
		map.put("/mypageUpdate.do", new MypageUpdate());
		map.put("/myinfoUpdate.do", new MyinfoUpdate());
		map.put("/myorderlistform.do", new MyorderlistForm());
		map.put("/mydetailorderlist.do", new MydetailOrderList());
		//MydetailOrderList
		//미현씨
		map.put("/memberLoginForm.do", new MemberLoginForm());
		map.put("/memberSignUp.do", new MemberSignUp());
		map.put("/memberLogin.do", new MemberLogin());
		//경미씨
		map.put("/category.do", new Category());
		
		// 상품등록 진재환
		map.put("/itemRsForm.do", new co.newcomers.prj.itemlist.command.ItemRsForm());
		map.put("/ItemRs.do", new co.newcomers.prj.itemlist.command.ItemRs());
		
		// 상품상세보기 진재환
		map.put("/itemDetailForm.do", new co.newcomers.prj.itemlist.command.ItemDetailForm());
		
		
		
		//헤더부분 메뉴이동 명령
		
		
		//로그인..등등..알아서
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // 한글깨짐방지
		String uri = request.getRequestURI(); // 요청한 uri를 구함
		String contextPath = request.getContextPath(); // 루트를 구함, context path
		String page = uri.substring(contextPath.length()); // 실제 수행할 요청을 구함

		Command command = map.get(page); // init 메소드에서 수행할 명령을 가져온다
		String viewPage = command.exec(request, response); // 명령을 수행하고 결과를 돌려받음

		// viewResolve 파트
		if (!viewPage.endsWith(".do") && viewPage != null) {
			// ajax 처리
			if(viewPage.startsWith("ajax:")){
				response.setContentType("text/html; charset=UTF-8");
				response.getWriter().append(viewPage.substring(5));
				return;
			}
			// 타일즈 돌아가는 곳
			if (!viewPage.endsWith(".tiles")) {
				viewPage = "/WEB-INF/views/" + viewPage + ".jsp"; //타일즈를 안태움
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect(viewPage); // *.do로 들어올때 돌아가는 곳
		}
	}

}
