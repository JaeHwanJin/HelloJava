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
					<h1>Register</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active" aria-current="page">Register</li>
            </ol>
          </nav>
				</div>
			</div>
    </div>
	</section>
	<!-- ================ end banner area ================= -->
  
  <!--================Login Box Area =================-->
	<section class="login_box_area section-margin">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="login_box_img">
						<div class="hover">
							<h4>Already have an account?</h4>
							<p>There are advances being made in science and technology everyday, and a good example of this is the</p>
							<a class="button button-account" href="memberLogin.do">Login Now</a>
						</div>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="login_form_inner register_form_inner">
						<h3>Create an account</h3>
				<!--  ==============????????????????????? ???????????? ================= -->
						<c:if test="${not empty id }">
						<form class="row login_form" action="memberSingUp.do" onsubmit="return formSubmit()" id="register_form" method="post">
						<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="id" name="id" value="${id }" placeholder="${id }" onfocus="this.placeholder = ''" onblur="this.placeholder = 'ID'" readonly>
								<button type="button" id="btn" value="No" onclick="idCheck()">Check</button>
						</div>
						 <div class="col-md-12 form-group">
								<input type="password" class="form-control" id="password" name="password" placeholder="Password" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Password'">
              			</div>
             			<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="Confirm Password" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Confirm Password'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="nickname" name="nickname" value="${nickname }" placeholder="${nickname }" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Nickname'" >
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="name" value="${name }" placeholder="${name }" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Username'" readonly>
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="address" name="address" placeholder="address" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Address'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="email" name="email" value="${email }" placeholder="${email } " onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email'" readonly>
           			   </div>
           	  
							<div class="col-md-12 form-group">
								<div class="creat_account">
									<input type="checkbox" id="f-option2" name="selector">
									<label for="f-option2">Keep me logged in</label>
								</div>
							</div>
							<div class="col-md-12 form-group">
								<button type="submit" value="submit" class="button button-register w-100">Register</button>
							</div>
						</form>
						</c:if>
						
				<!--  ==============?????? ???????????? ================= -->
						<c:if test="${empty id }">
						<form class="row login_form" action="memberSingUp.do" onsubmit="return formSubmit()" id="register_form" method="post">
						<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="id" name="id" placeholder="ID" onfocus="this.placeholder = ''" onblur="this.placeholder = 'ID'">
								<button type="button" id="btn" value="No" onclick="idCheck()">Check</button>
						</div>
						 <div class="col-md-12 form-group">
								<input type="password" class="form-control" id="password" name="password" placeholder="Password" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Password'">
              			</div>
             			<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="Confirm Password" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Confirm Password'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="nickname" name="nickname" placeholder="Nickname" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Nickname'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="name" placeholder="Username" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="id" name="address" placeholder="address" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Address'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="email" name="email" placeholder="Email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email'">
           			   </div>
           	  
							<div class="col-md-12 form-group">
								<div class="creat_account">
									<input type="checkbox" id="f-option2" name="selector">
									<label for="f-option2">Keep me logged in</label>
								</div>
							</div>
							<div class="col-md-12 form-group">
								<button type="submit" value="submit" class="button button-register w-100">Register</button>
							</div>
						</form>
						</c:if>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================End Login Box Area =================-->



  <!--================ Start footer Area  =================-->	
	
	<!--================ End footer Area  =================-->

 <script type="text/javascript">
  //Id, Passwd ?????? ??? ??????
  	function formSubmit(){
  		if(document.getElementById('btn').value == 'No'){
  			alert("????????? ?????? ????????? ????????????.");
  			return false;
  		}
  		if(document.getElementById('password').value != document.getElementById('confirmPassword').value){
  			alert("??????????????? ???????????? ????????????.")
  			document.getElementById('password').value ="";
  			document.getElementById('confirmPassword').value ="";
  			document.getElementById('password').focus();
  			return false;
  		}
  		return true;
  	}
  	
  //Id ?????? ??????.
  	function idCheck(){
	  
	  let id = document.getElementById('id').value;
	  console.log(id)
	  let url = "ajaxIdCheck.do?id="+id;
	  fetch(url)
	  	.then(response => response.text())
	  	.then(data => {
	  		if(data ==1){
	  			alert(id + "??? ??????????????? ??????????????????.");
	  			document.getElementById('btn').value = "Yes";
	  		} else {
	  			alert(id + "??? ???????????? ??????????????????.")
	  			document.getElementById('id').value ="";
	  			document.getElementById('id').focus();
	  		}
	  	})
  }
  	
  </script>

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