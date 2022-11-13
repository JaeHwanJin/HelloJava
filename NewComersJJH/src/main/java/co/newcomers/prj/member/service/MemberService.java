package co.newcomers.prj.member.service;

import java.util.List;

import co.newcomers.prj.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberList(); //전체 회원 정보
	MemberVO memberSelect(MemberVO vo); //회원 한명의 정보
	MemberVO memberSelect2(String id);
	int memberInsert(MemberVO vo); //회원 가입
	int memberDelete(MemberVO vo); //회원 탈퇴
	int memberUpdate(MemberVO vo); //회원 정보수정.
	
	int memberApplySeller(MemberVO vo); //판매자격신청
	MemberVO memberLogin(String id, String password); //로그인
	boolean isMemberIdCheck(String id); //아이디 중복 체크

}
