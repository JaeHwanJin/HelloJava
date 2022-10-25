package co.edu.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿이 되려면 HttpServlet 상속
// init() -> service()구현
// 제어의 흐름을 개발자가 아니라 서블릿컨테이너가 흐름을 제어 : 제어의 역전(IOC)

public class FirstServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init()호출."); // 인스턴스가 생성 될 때 한번만 실행
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service() 호출."); // FristServlet 호출될때마다 실행
		resp.setContentType("text.html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		// 사용자 paramet 가져와서 처리.
		
		String job = req.getParameter("job");
		EmpDAO dao = new EmpDAO();
		dao.empList(new EmployeeVO(job));
		
		if(req.getMethod().equals("GET")) {
			// 조회할 경우.
			List<EmployeeVO> list = dao.empList(new EmployeeVO(job));
			out.print("<table border='1'");
			out.print("<tr><th>사원번호</th><th>이름</th><th>직무</th></tr>");

			for(EmployeeVO emp : list) {
				out.print("<td>"+ emp.getEmployeeId() + ", " + emp.getLastName() + ", " + emp.getJobId() + "</td>");
				
			}
			
		}else if(req.getMethod().equals("POST")) {
			String empId = req.getParameter("employee_id");
			String lName = req.getParameter("last_name");
			String email = req.getParameter("email");
			String hDate = req.getParameter("hire_date");
			String job1 = req.getParameter("job_id");
			dao.insertEmp(new EmployeeVO(Integer.parseInt(empId) // 사원번호 : int라서
						,null	// first_name
						,lName	// last_name
						,email	// email
						,hDate	// hire_date
						,job1 	// job_id
						));
			
				out.print("<script>alert('입력완료');</script>");
			
		}
	}
	
	
	
	
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("destroy() 호출.");
	}

}
