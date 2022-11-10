package co.newcomers.prj.item.service;

import java.util.List;

import co.newcomers.prj.item.vo.ItemVO;

public interface ItemService {
	List<ItemVO> itemSelectList();  
	List<ItemVO> itemSelect();	
	ItemVO itemSearch(ItemVO vo);
	int itemInsert(ItemVO vo);		
	int itemDelete(ItemVO vo);		
	int itemUpdate(ItemVO vo);		
}
