package co.newcomers.prj.itemlist.mapper;

import java.util.List;

import co.newcomers.prj.itemlist.vo.ItemVO;

public interface ItemMapper {
	List<ItemVO> itemSelectList();  
	ItemVO itemSelect(ItemVO vo);
	ItemVO itemSearch(ItemVO vo);
	int itemInsert(ItemVO vo);		
	int itemDelete(ItemVO vo);		
	int itemUpdate(ItemVO vo);		
}
