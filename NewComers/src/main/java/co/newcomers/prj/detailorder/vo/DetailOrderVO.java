package co.newcomers.prj.detailorder.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailOrderVO {
	private String orderCode;
	private String itemCode;
	private String itemCount;
	private String orderState;
}
