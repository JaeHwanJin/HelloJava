package co.newcomers.prj.itemlist.service;

import java.util.List;

import co.newcomers.prj.itemlist.vo.ItemVO;

public interface ItemService {
	List<ItemVO> itemSelectList();  
	List<ItemVO> itemDetailList();  
	ItemVO itemSelect(ItemVO vo);	
	ItemVO itemSearch(ItemVO vo);
	int itemInsert(ItemVO vo);		
	int itemDelete(ItemVO vo);		
	int itemUpdate(ItemVO vo);		
}
