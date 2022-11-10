package co.newcomers.prj.item.service.impl;



import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.newcomers.prj.common.DataSource;
import co.newcomers.prj.item.mapper.ItemMapper;
import co.newcomers.prj.item.service.ItemService;
import co.newcomers.prj.item.vo.ItemVO;

public class ItemServiceImpl implements ItemService{
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private ItemMapper map = sqlSession.getMapper(ItemMapper.class);
	@Override
	public List<ItemVO> itemSelectList() {
		return map.itemSelectList();
	}

	@Override
	public ItemVO itemSelect(ItemVO vo) {
		return map.itemSelect(vo);
	}

	@Override
	public ItemVO itemSearch(ItemVO vo) {
		return null;
	}
	
	@Override
	public int itemInsert(ItemVO vo) {
		return map.itemInsert(vo);
	}

	@Override
	public int itemDelete(ItemVO vo) {
		return map.itemDelete(vo);
	}

	@Override
	public int itemUpdate(ItemVO vo) {
		return map.itemUpdate(vo);
	}


}
