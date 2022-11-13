package co.newcomers.prj.item.service;

import co.newcomers.prj.item.vo.ItemDetailVO;
import co.newcomers.prj.item.vo.ItemVO;
import co.newcomers.prj.item.vo.ReviewVO;

public interface ItemService {
	ItemDetailVO itemSelect(ItemDetailVO vo);	
	int itemInsert(ItemVO vo);		
	
	ReviewVO reviewSelect(ReviewVO vo);
	int reviewInsert(ReviewVO vo);		

}
