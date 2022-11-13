package co.newcomers.prj.item.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewVO {
	private String reviewCode;
	private String itemCode;
	private String reviewContent;
	private String reviewWriter;
	private String reviewStar;
	private String reviewDate;
	
}
