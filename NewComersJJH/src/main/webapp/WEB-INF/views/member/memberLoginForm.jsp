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
					<h1>Login / Register</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="main.do">Home</a></li>
              <li class="breadcrumb-item active" aria-current="page">Login/Register</li>
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
							<h4>New to our website?</h4>
							<p>There are advances being made in science and technology everyday, and a good example of this is the</p>
							<a class="button button-account" href="memberSignUpForm.do">Create an Account</a>
						</div>
					</div>
				</div>
				<div class="col-lg-6">
				
	<!-- =============Login ========================== -->
					<div class="login_form_inner">	
						<h3>Log in to enter</h3>
						<form class="row login_form" action="memberLogin.do" id="contactForm" method="post">
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="id" name="id" value="${id }" placeholder="ID" 
								onfocus="this.placeholder = ''" onblur="this.placeholder = 'ID'" >
							</div>
							<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="password" name="password" placeholder="Password" 
								onfocus="this.placeholder = ''" onblur="this.placeholder = 'Password'">
							</div>
							<div class="col-md-12 form-group">
								<div class="creat_account">
									<input type="checkbox" id="f-option2" name="selector">
									<label for="f-option2">Keep me logged in</label>
								</div>
							</div>
							<div class="col-md-12 form-group">
								<button type="submit" value="submit" class="button button-login w-100" onclick="isCheck();">Log In</button>
								<a href="#">비밀번호를 잊으셨습니까?</a>
							</div>
						</form>
						<form action="main.do" method="post">
						<ul>
							<li onclick="kakaoLogin();">
							<a href="javascript:void(0)">
								<image src="img/kakaoLogin.png">		
							</a>
							</li>
						</ul>
						</form>
			
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================End Login Box Area =================-->



  <!--================ Start footer Area  =================-->	
	
	<!--================ End footer Area  =================-->

<script>
	function isCheck(){
		let id = document.getElementById('id').value;
		let password = document.getElementById('password').value;
		let checked = id&&password;
		
		if(!checked){
			alert("아이디를 입력하세요.")
			
		}else if(!password){
			alert("비밀번호를 입력하세요.")
		} else {
			return location.href='meberLogin.do';
		}
	}
</script>
<!-- ======카카오 스크립트====== -->
 <script src="https://developers.kakao.com/sdk/js/kakao.js"></script>

 <script type="text/javascript">
Kakao.init('e9786fac7663d9ccaeb89ec24478acae');
console.log(Kakao.isInitialized());

function kakaoLogin(){
	Kakao.Auth.login({
		success: function (authObj){
			Kakao.Auth.setAccessToken(authObj.access_token);

					getInfo();//얘가 오브젝트
					//return location.href = "kakaoLogin.do";
				},
				fail: function (err){
					console.log(err);
				}
			});
		}

		function getInfo(){
			Kakao.API.request({
				url: '/v2/user/me',
				success: function (res){
					console.log(res);

					var email = res.kakao_account.email;
					var gender = res.kakao_account.gender;
					var nickname = res.kakao_account.profile.nickname;
					var profile_image = res.kakao_account.profile.thumbnail_image_url;
					
					var nickname2 = decodeURIComponent(nickname);
					
					console.log(email+nickname);
					let user = "kakaoLogin.do?email="+email+"&nickname="+nickname2;
					
						location.href = user;
						
					//fetch(user);
					
/* 						.then(response => response.text())
						.then(data => {
							if(data ==1){
								alert("로그인 성공!");
							}else{
								alert("로그인 실패! 회원가입 창으로 이동합니다.")
								
							}
						}) */
					
				}, 
				fail: function (error){
					alert('카카오 로그인에 실패했습니다. 관리자에게 문의하세요.' + JSON.stringify(error));
				}
			});
		}

		function kakaoLogout(){
			if(Kakao.Auth.getAccessToken()){
				Kakao.API.request({
					url: '/v1/user/unlink',
					success: function (response){
						console.log(response)
						alert('로그아웃 되었습니다.');
					},
					fail: function (error){
						console.log(error)
					},
				})
				Kakao.Auth.setAccessToken(undefined)
			}

/* 			 if(Kakao.Auth.getAccessToken()){
			 	alert('Not logged in.');
			 	return;
			 }
			 Kakao.Auth.logout(function(){
			 	alert('logout ok\naccess token ->' + Kakao.Auth.getAccessToken());
			 }); */
		}

</script>



<!-- <script>
Kakao.init('f9313f235009fec346afaecd1532dd88');
console.log(Kakao.isInitialized());

	function kakaoLogin(){
		Kakao.Auth.login({
			success: function (response){
				Kakao.API.request({
					url: '/v2/user/me',
					success: function (response){
						console.log(response)
						alert("로그인 성공")
						return location.href= "main.do";
					},
					fail: function (error){
						console.log(error)
					},
				})
			},
			fail: function (error) {
				console.log(error)
			},
		})
	}
	
	function kakaoLogout(){
		if (Kakao.Auth.getAccessToken()){
			Kakao.API.request({
				url: '/v1/user/unlink',
				success: function (response){
					console.log(response)
				},
				fail: function (error) {
					console.log(error)
				},
			})
			Kakao.Auth.setAccessToken(undefiend)
		}
	} 
</script> -->

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