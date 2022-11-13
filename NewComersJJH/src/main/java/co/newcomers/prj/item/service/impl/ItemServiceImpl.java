package co.newcomers.prj.item.service.impl;

import org.apache.ibatis.session.SqlSession;

import co.newcomers.prj.common.DataSource;
import co.newcomers.prj.item.mapper.ItemMapper;
import co.newcomers.prj.item.service.ItemService;
import co.newcomers.prj.item.vo.ItemDetailVO;
import co.newcomers.prj.item.vo.ItemVO;
import co.newcomers.prj.item.vo.ReviewVO;

public class ItemServiceImpl implements ItemService{
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private ItemMapper map = sqlSession.getMapper(ItemMapper.class);

	@Override
	public int itemInsert(ItemVO vo) {
		return map.itemInsert(vo);
	}

	@Override
	public ItemDetailVO itemSelect(ItemDetailVO vo) {
		// TODO Auto-generated method stub
		return map.itemSelect(vo);
	}

	@Override
	public ReviewVO reviewSelect(ReviewVO vo) {
		// TODO Auto-generated method stub
		return map.reviewSelect(vo);
	}

	@Override
	public int reviewInsert(ReviewVO vo) {
		// TODO Auto-generated method stub
		return map.reviewInsert(vo);
	}


}
