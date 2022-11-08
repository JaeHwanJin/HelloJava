package co.micol.prj.member.service;

import java.util.List;

import co.micol.prj.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo); //한명의 데이터 또는 로그인처리. 이것만으로도 로그인까지가능.
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	
	MemberVO memberLogin(String id, String password); //이거없어도됨 왜 service ,interface 두개만드는지 보여주기위한 예시.
	boolean isMemberIdCheck(String id); //id 존재하면 false, 없으면 true, boolean 초기타입은 대부분 false씀.;

}
