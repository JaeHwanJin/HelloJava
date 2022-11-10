package co.newcomers.prj.item.mapper;

import java.util.List;

import co.newcomers.prj.item.vo.ItemVO;

public interface ItemMapper {
	List<ItemVO> itemSelectList();  
	List<ItemVO> itemSelect();	
	int itemInsert(ItemVO vo);		
	int itemDelete(ItemVO vo);		
	int itemUpdate(ItemVO vo);		
}
