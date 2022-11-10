package co.newcomers.prj.detailorder.service;

import java.util.List;

import co.newcomers.prj.detailorder.vo.DetailOrderVO;

public interface DetailOrderService {
	List<DetailOrderVO> myShipping(String id); //배송완료를 제외한 목록을 띄우기 위한애..
	List<DetailOrderVO> myEndShippnig(String id); //배송완료를 한 목록 띄우기 위한애..

}
