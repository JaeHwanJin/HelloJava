<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Aroma Shop - Login</title>
<link rel="icon" href="img/Fevicon.png" type="image/png">
<link rel="stylesheet" href="vendors/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="vendors/fontawesome/css/all.min.css">
<link rel="stylesheet" href="vendors/themify-icons/themify-icons.css">
<link rel="stylesheet" href="vendors/linericon/style.css">
<link rel="stylesheet"
	href="vendors/owl-carousel/owl.theme.default.min.css">
<link rel="stylesheet" href="vendors/owl-carousel/owl.carousel.min.css">
<link rel="stylesheet" href="vendors/nice-select/nice-select.css">
<link rel="stylesheet" href="vendors/nouislider/nouislider.min.css">

<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<!--================Single Product Area =================-->
	<div class="product_image_area">
		<div class="container">
			<div class="row s_product_inner">
				<div class="col-lg-6">
					<div class="owl-carousel owl-theme s_Product_carousel">
						<div class="single-prd-item">
                    <img class="card-img" src="upload/item/${detail_item.itemImage }" alt="" width="200px" height="200px">
							<img src="img/product/review-1.png" alt="">
							
						</div>
					</div>
				</div>
				<div class="col-lg-5 offset-lg-1">
					<div class="s_product_text">

						<h3>${item.itemTitle}</h3>
						<h2>${item.itemPrice}</h2>
						<p style="font-size: 10px">${item.itemContent}</p>
						<div class="product_count">
							<label for="qty">Quantity:</label>
							<button
								onclick="var result = document.getElementById('sst'); var sst = result.value; if( !isNaN( sst )) result.value++;return false;"
								class="increase items-count" type="button">
								<i class="ti-angle-left"></i>
							</button>
							<input type="text" name="qty" id="sst" size="2" maxlength="12"
								value="1" title="Quantity:" class="input-text qty">
							<button
								onclick="var result = document.getElementById('sst'); var sst = result.value; if( !isNaN( sst ) &amp;&amp; sst > 0 ) result.value--;return false;"
								class="reduced items-count" type="button">
								<i class="ti-angle-right"></i>
							</button>
							<a class="button primary-btn" href="#">Add to Cart</a>
						</div>
						<div class="card_area d-flex align-items-center">
							<a class="icon_btn" href="#"><i class="lnr lnr lnr-diamond"></i></a>
							<a class="icon_btn" href="#"><i class="lnr lnr lnr-heart"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--================End Single Product Area =================-->

	<!--================Product Description Area =================-->
	<section class="product_description_area">
		<div class="container">
			<ul class="nav nav-tabs" id="myTab" role="tablist">
				<li class="nav-item"><a class="nav-link active" id="review-tab"
					data-toggle="tab" href="#review" role="tab" aria-controls="review"
					aria-selected="false">Reviews</a></li>
			</ul>
			<div class="tab-content" id="myTabContent">

				<div class="tab-pane fade" id="contact" role="tabpanel"
					aria-labelledby="contact-tab">
					<div class="row">
						<div class="col-lg-6">
							<div class="comment_list">
								<div class="review_item">
									<div class="media">
										<div class="d-flex">
											<img src="img/product/review-1.png" alt="">
										</div>
										<div class="media-body">
											<h4>${review.reviewWriter }</h4>
											<h5>${review.reviewDate }</h5>
											<a class="reply_btn" href="#">Reply</a>
										</div>
									</div>
									<p>${review.reviewContent }</p>
								</div>
								<div class="review_item">
									<div class="media">
										<div class="d-flex">
											<img src="img/product/review-1.png" alt="">
										</div>
										<div class="media-body">
											<h4>${review.reviewWriter }</h4>
											<h5>${review.reviewDate }</h5>
											<a class="reply_btn" href="#">Reply</a>
										</div>
									</div>
									<p>${review.reviewContent }</p>
								</div>
								<div class="review_item">
									<div class="media">
										<div class="d-flex">
											<img src="img/product/review-1.png" alt="">
										</div>
										<div class="media-body">
											<h4>${review.reviewWriter }</h4>
											<h5>${review.reviewDate }</h5>
											<a class="reply_btn" href="#">Reply</a>
										</div>
									</div>
									<p>${review.reviewContent }</p>
								</div>

							</div>
						</div>
						<div class="col-lg-6">
							<div class="review_box">
								<h4>Post a comment</h4>
								<form class="row contact_form" action="contact_process.php"
									method="post" id="contactForm" novalidate="novalidate">
									<div class="col-md-12">
										<div class="form-group">
											<input type="text" class="form-control" id="name" name="name"
												placeholder="Your Full name">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<input type="email" class="form-control" id="email"
												name="email" placeholder="Email Address">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<input type="text" class="form-control" id="number"
												name="number" placeholder="Phone Number">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<textarea class="form-control" name="message" id="message"
												rows="1" placeholder="Message"></textarea>
										</div>
									</div>
									<div class="col-md-12 text-right">
										<button type="submit" value="submit" class="btn primary-btn">Submit
											Now</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				<div class="tab-pane fade show active" id="review" role="tabpanel"
					aria-labelledby="review-tab">
					<div class="row">
						<div class="col-lg-6">
							<div class="row total_rate">
								<div class="col-6">
									<div class="box_total">
										<h5>Overall</h5>
										<h4>4.0</h4>
										<h6>(03 Reviews)</h6>
									</div>
								</div>
								<div class="col-6">
									<div class="rating_list">
										<h3 style="text-align: left">Based on 3 Reviews</h3>
										<ul class="list" style="text-align: left">
											<li>5점 : 아주 좋아요<i class="review"></i>
											<li>4점 : 좋아요<i class="review"></i> 
											<li>3점 : 평범해요<i class="review"></i>
											<li>2점 : 별로에요<i class="review"></i>
											<li>1점 : 아주 별로에요<i class="review"></i>
										</ul>
									</div>
								</div>
							</div>
							<div class="review_list">
								<div class="review_item">
									<div class="media">
										<div class="media-body">
											<h4>${review.reviewWriter }</h4>
											<h5>${review.reviewDate }</h5>
											<h5>${review.reviewStar }점</h5>
											<!-- <a class="reply_btn" href="#">Reply</a> -->
										</div>
									</div>
									<p>${review.reviewContent }</p>
								</div>
								<div class="review_item">
									<div class="media">								
										<div class="media-body">
											<h4>${review.reviewWriter }</h4>
											<h5>${review.reviewDate }</h5>
											<h5>${review.reviewStar }점</h5>
											<!-- <a class="reply_btn" href="#">Reply</a> -->
										</div>
									</div>
									<p>${review.reviewContent }</p>
								</div>
								<div class="review_item">
									<div class="media">										
										<div class="media-body">
											<h4>${review.reviewWriter }</h4>
											<h5>${review.reviewDate }</h5>
											<h5>${review.reviewStar }점</h5>
											<!-- <a class="reply_btn" href="#">Reply</a> -->
										</div>
									</div>
									<p>${review.reviewContent }</p>
								</div>

							</div>
						</div>
						<div class="col-lg-6">
							<div class="review_box">
								<h4>Add a Review</h4>							
								<form action="reviewRs.do" class="form-contact form-review mt-3">
									<div class="form-group">
										<input type="text" class="form-control" id="reviewWriter"
											name="reviewWriter" placeholder="Please write down the your name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter your name'">
									</div>
									<div class="form-group">
										<textarea  class="form-control different-control w-100" name="reviewContent"
											id="reviewContent" cols="50" rows="10"
											placeholder="Enter Message"></textarea>
									</div>
									<div class="form-group">
									<select class="form-control" name="reviewStar" id="reviewStar" style="width:509px">
										<option value="">점수 선택</option>
										<option value="">1점</option>
										<option value="">2점</option>
										<option value="">3점</option>
										<option value="">4점</option>
										<option value="">5점</option>
									</select>
									</div>
									<div class="form-group text-center text-md-right mt-3">
										<button type="submit" class="button button--active button-review">Submit Now</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!--================End Product Description Area =================-->

	<script type="text/javascript">

</script>
	<!--================ Start footer Area  =================-->

	<!--================ End footer Area  =================-->


	<script src="vendors/jquery/jquery-3.2.1.min.js"></script>
	<script src="vendors/bootstrap/bootstrap.bundle.min.js"></script>
	<script src="vendors/skrollr.min.js"></script>
	<script src="vendors/owl-carousel/owl.carousel.min.js"></script>
	<script src="vendors/nice-select/jquery.nice-select.min.js"></script>
	<script src="vendors/jquery.ajaxchimp.min.js"></script>
	<script src="vendors/mail-script.js"></script>
	<script src="js/main.js"></script>
</body>
</html>