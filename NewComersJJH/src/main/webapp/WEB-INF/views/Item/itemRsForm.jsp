<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	
<!-- ================ end banner area ================= -->
  
<!--================ Item register Area =================-->
	<section class="Item_register_area section-margin">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="Item_register_img">
						<div class="hover">
							<h4>뭐하지</h4>
							<p>뭐하지</p>
						</div>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="Item_form_inner register_form_inner">
						<h3>Register a item</h3>
						<form class="row Item_register" action="ItemRs.do" id="register_form" >
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="itemName" name="itemName" placeholder="Item Name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Item Name'">
              				</div>
              				<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="itemPrice" name="itemPrice" placeholder="Item Price" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Item Price'">
              				</div>
              				<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="itemId" name="itemId" placeholder="Item Id" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Item Id'">
              				</div>
							<div class="col-md-12 form-group">
								<button type="submit" value="submit" class="button button-register w-100">Register</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
<!--================End Item register Area =================-->


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