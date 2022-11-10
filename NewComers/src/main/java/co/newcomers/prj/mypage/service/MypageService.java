package co.newcomers.prj.mypage.service;

import co.newcomers.prj.member.vo.MemberVO;

public interface MypageService {
	int mycartCount(MemberVO vo); //카트에 담긴갯수 확인
	int myselfDelete(MemberVO vo); //회원 탈퇴
	int myselfUpdate(MemberVO vo); //회원 정보수정.
	
}
