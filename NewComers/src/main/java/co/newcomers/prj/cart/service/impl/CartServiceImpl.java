package co.newcomers.prj.cart.service.impl;

import org.apache.ibatis.session.SqlSession;

import co.newcomers.prj.cart.mapper.CartMapper;
import co.newcomers.prj.cart.service.CartService;
import co.newcomers.prj.common.DataSource;
import co.newcomers.prj.member.mapper.MemberMapper;
import co.newcomers.prj.member.vo.MemberVO;

public class CartServiceImpl implements CartService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private CartMapper map = sqlSession.getMapper(CartMapper.class);
	@Override
	public int mycartCount(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.mycartCount(vo);
	}

}
