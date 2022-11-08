package co.micol.prj.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	//모든요청을 담는곳이 request 객체, response는 내가 응답하는 객체.
	public String exec(HttpServletRequest request, HttpServletResponse response);
}
