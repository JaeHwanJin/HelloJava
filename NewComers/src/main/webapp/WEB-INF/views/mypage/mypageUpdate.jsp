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
  <link rel="stylesheet" href="vendors/owl-carousel/owl.theme.default.min.css">
  <link rel="stylesheet" href="vendors/owl-carousel/owl.carousel.min.css">
  <link rel="stylesheet" href="vendors/nice-select/nice-select.css">
  <link rel="stylesheet" href="vendors/nouislider/nouislider.min.css">

  <link rel="stylesheet" href="css/style.css">
</head>
<body>
	<!--================ Start Header Menu Area =================-->
	<!--================ End Header Menu Area =================-->
  
  <!-- ================ start banner area ================= -->	
	<section class="blog-banner-area" id="category">
		<div class="container h-100">
			<div class="blog-banner">
				<div class="text-center">
					<h1>회원정보 수정입니다.</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
            
          </nav>
				</div>
			</div>
    </div>
	</section>
	<!-- ================ end banner area ================= -->
  
  <!--================Login Box Area =================-->
	<section class="login_box_area section-margin">
		<div class="container" >
			<div class="row" ailgn = "center">
				<div class="col-lg-4">
					<div class="blog_right_sidebar">
							
							<aside class="single_sidebar_widget author_widget">
									<img class="author_img rounded-circle" src="img/blog/author.png" alt="">
									<h4>이름</h4>
									<p>코멘트</p>
									<div class="social_icon">
											<a href="#">
											<i class="fab fa-facebook-f"></i>
											</a>
											<a href="#">
											<i class="fab fa-twitter"></i>
											</a>
											<a href="#">
											<i class="fab fa-github"></i>
											</a>
											<a href="#">
											<i class="fab fa-behance"></i>
										</a>
										</div>
									<p>코멘트
									</p>
									<div class="br"></div>
							</aside>
							
						
							<aside class="single_sidebar_widget post_category_widget">
									<h4 class="widget_title">My 쇼핑</h4>
									<ul class="list cat-list">
											<li>
													<a class="d-flex justify-content-between">
															<p><h2>My 쇼핑</h2></p>
													</a><br>

													<a href="#" class="d-flex justify-content-between">
														<p>주문목록/배송조회</p>
													</a><br>

													<a href="#" class="d-flex justify-content-between">
														<p>주문목록/배송조회</p>
													</a><br>

													<a href="#" class="d-flex justify-content-between">
														<p>주문목록/배송조회</p>
													</a><br>

													<a href="#" class="d-flex justify-content-between">
														<p>주문목록/배송조회</p>
													</a><br>
											</li>
											<li>
												<a class="d-flex justify-content-between">
													<p><h2>My 정보</h2></p>
											</a><br>

											<a href="#" class="d-flex justify-content-between">
												<p>개인정보 수정</p>
											</a><br>

											<a href="#" class="d-flex justify-content-between">
												<p>주문목록/배송조회</p>
											</a><br>

											<a href="#" class="d-flex justify-content-between">
												<p>주문목록/배송조회</p>
											</a><br>

											<a href="#" class="d-flex justify-content-between">
												<p>주문목록/배송조회</p>
											</a><br>
											</li>
											
									</ul>
									<div class="br"></div>
							</aside>
							
							
					</div>
				</div>
				<div class="col-lg-6">
					<div class="login_form_inner register_form_inner" > 

						<h3>회원정보 수정</h3>
						<form class="row login_form" action="myinfoUpdate.do" id="register_form" method="post" >
							<div class="col-md-12 form-group">
								<!-- 나중에 input타입 아니라 세션으로 받아온 아이디값을 넣어주기.-->
								<a>아이디 : ${updateid }</a>
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="password" name="password" placeholder="비밀번호 입력" onfocus="this.placeholder = ''" onblur="this.placeholder = '비밀번호 입력'">
             	  			 </div>
             				 <div class="col-md-12 form-group">
								<input type="text" class="form-control" id="changepassword" name="changepassword" placeholder="변경할 비밀번호" onfocus="this.placeholder = ''" onblur="this.placeholder = '변경할 비밀번호'">
            				  </div>
            				  <div class="col-md-12 form-group">
								<input type="text" class="form-control" id="changepassword2" name="changepassword2" placeholder="비밀번호 확인" onfocus="this.placeholder = ''" onblur="this.placeholder = '비밀번호 확인'">
							  </div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="name" placeholder="이름" onfocus="this.placeholder = ''" onblur="this.placeholder = '이름'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="address" name="address" placeholder="주소" onfocus="this.placeholder = ''" onblur="this.placeholder = '주소'">
							</div>
						
							<div class="col-md-12 form-group">
								<button type="submit" value="submit" class="button button-register w-100">변경</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================End Login Box Area =================-->



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