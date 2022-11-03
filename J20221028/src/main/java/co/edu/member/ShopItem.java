package co.edu.member;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShopItem {
	private String itemCode;
	private String itemName;
	private String originPrice;
	private String salePrice;
	private double likeIt;
	private String image;
}
 