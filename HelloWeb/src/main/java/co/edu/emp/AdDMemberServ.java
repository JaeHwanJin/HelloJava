package co.edu.emp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdDMemberServ
 */
@WebServlet({ "/addMemberServlet", "/addMember" })
public class AdDMemberServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AdDMemberServ() {
        super();
    }

    // get방식의 요청.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		
		// content 타입을 지정
		response.setContentType("text/html;charset = UTF-8");
		
		System.out.println("/addMemberSer 페이지입니다.");
		String empId = request.getParameter("employee_id");
		String Lname = request.getParameter("last_name");
		String Email = request.getParameter("email");
		String Hdate = request.getParameter("hire_date");
		String Jid = request.getParameter("job_id");

		
		
		System.out.println(empId);
		
		// 입력
		EmpDAO dao = new EmpDAO();
		dao.insertEmp(new EmployeeVO(0, null, Lname, Email, Hdate, Jid));
		
		System.out.println("입력 완료");
		
		PrintWriter out = response.getWriter(); //출력스트림
		out.print("<h3>completed</h3>");
	}

	// post 방식의 요청 시 실행
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
		doGet(request, response);
		PrintWriter out = response.getWriter(); // 사용자의 브라우저(출력스트림 생성)
		out.print("<h3>Post 방식의 요청</h3>");
	}
	

}
