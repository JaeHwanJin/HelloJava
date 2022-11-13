package co.newcomers.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.newcomers.prj.common.Command;

public class MessageForm implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 메세지 창으로 이동.
		return "member/message";
	}

}
