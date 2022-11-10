package co.newcomers.prj.mypage.service.impl;

import org.apache.ibatis.session.SqlSession;

import co.newcomers.prj.common.DataSource;
import co.newcomers.prj.member.mapper.MemberMapper;
import co.newcomers.prj.member.vo.MemberVO;
import co.newcomers.prj.mypage.mapper.MypageMapper;
import co.newcomers.prj.mypage.service.MypageService;

public class MypageServiceImpl implements MypageService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MypageMapper map = sqlSession.getMapper(MypageMapper.class);

	@Override
	public int myselfDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int myselfUpdate(MemberVO vo) {
		return map.myselfUpdate(vo);
	}

	@Override
	public int mycartCount(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
