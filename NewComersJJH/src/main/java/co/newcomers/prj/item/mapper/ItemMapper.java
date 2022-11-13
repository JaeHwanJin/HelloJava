package co.newcomers.prj.item.mapper;

import co.newcomers.prj.item.vo.ItemDetailVO;
import co.newcomers.prj.item.vo.ItemVO;
import co.newcomers.prj.item.vo.ReviewVO;

public interface ItemMapper {
	ItemDetailVO itemSelect(ItemDetailVO vo);	
	int itemInsert(ItemVO vo);
	
	ReviewVO reviewSelect(ReviewVO vo);
	int reviewInsert(ReviewVO vo);		

}
