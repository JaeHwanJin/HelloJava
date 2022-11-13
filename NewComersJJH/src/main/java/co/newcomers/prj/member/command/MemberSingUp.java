package co.newcomers.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import co.newcomers.prj.common.Command;
import co.newcomers.prj.member.service.MemberService;
import co.newcomers.prj.member.service.impl.MemberServiceImpl;
import co.newcomers.prj.member.vo.MemberVO;

public class MemberSingUp implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 회원가입 처리
//		String saveFolder = request.getSession().getServletContext().getRealPath("/upload/"); //실제 파일을 저장하는 곳을 설정해주기. (굳이 안쓰긴함)
//		try {
//			MultipartRequest multi = new MultipartRequest(request, saveFolder, 1024*1024*100, "utf-8", new DefaultFileRenamePolicy());
//			String pfile = multi.getFilesystemName("ufile");
//			String ofile = multi.get("ufile") >>???
//		}
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		HttpSession session = request.getSession();
		
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo.setNickname(request.getParameter("nickname"));
		vo.setName(request.getParameter("name"));
		vo.setAddress(request.getParameter("address"));
		vo.setEmail(request.getParameter("email"));
		
		String id = request.getParameter("id");
		System.out.println(id);
		session.setAttribute("id", id);
		System.out.println(vo);
		
		int n = dao.memberInsert(vo);
		if(n > 0) {
			System.out.println("회원가입 완료!");
		}else {
			System.out.println("회원가입 실패");
		}
		return "member/memberLoginForm.tiles";
	}

}
