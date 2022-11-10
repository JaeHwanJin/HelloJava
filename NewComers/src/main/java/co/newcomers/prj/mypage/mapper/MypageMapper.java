package co.newcomers.prj.mypage.mapper;

import co.newcomers.prj.member.vo.MemberVO;

public interface MypageMapper {
	int myselfDelete(MemberVO vo); //회원 탈퇴
	int myselfUpdate(MemberVO vo); //회원 정보수정.
	int mycartCount(MemberVO vo); // 내 카트에 담긴 숫자;
}
