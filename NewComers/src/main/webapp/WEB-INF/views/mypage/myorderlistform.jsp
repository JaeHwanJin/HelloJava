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
 <section class="order_details section-margin--small">
    <div class="container">
      <p class="text-center billing-alert">상품 조회..</p>
      <div class="row mb-5">
        <table class="table">
          <thead>
              <tr>
                  <th scope="col">Product</th>
                  <th scope="col">Price</th>
                  <th scope="col">Quantity</th>
                  <th scope="col">Total</th>
              </tr>
          </thead>
          <tbody>
              <tr>
                  <td>
                      <div class="media">
                          <div class="d-flex">
                              <img src="img/cart/cart2.png" alt="">
                          </div>
                          <div class="media-body">
                              <p>Minimalistic shop for multipurpose use</p>
                          </div>
                      </div>
                  </td>
                  <td>
                      <h5>item 테이블의 item_price</h5>
                  </td>
                  <td>
                      <h5>이전페이지에서 넘어온 수량.value의 값</h5>
                  </td>
                  <td>
                      <h5>토탈값</h5>
                  </td>
              </tr>
              <tr>
                  <td>
                      <div class="media">
                          <div class="d-flex">
                              <img src="img/cart/cart3.png" alt="">
                          </div>
                          <div class="media-body">
                              <p>Minimalistic shop for multipurpose use</p>
                          </div>
                      </div>
                  </td>
                  <td>
                      <h5>$360.00</h5>
                  </td>
                  <td>
                      <div class="product_count">
                          <input type="text" name="qty" id="sst" maxlength="12" value="1" title="Quantity:"
                              class="input-text qty">
                          <button onclick="var result = document.getElementById('sst'); var sst = result.value; if( !isNaN( sst )) result.value++;return false;"
                              class="increase items-count" type="button"><i class="lnr lnr-chevron-up"></i></button>
                          <button onclick="var result = document.getElementById('sst'); var sst = result.value; if( !isNaN( sst ) &amp;&amp; sst > 0 ) result.value--;return false;"
                              class="reduced items-count" type="button"><i class="lnr lnr-chevron-down"></i></button>
                      </div>
                  </td>
                  <td>
                      <h5>total 넘어온*</h5>
                  </td>
              </tr>
              
          </tbody>
      </table>
    </div>
    
    <p class="text-center billing-alert">배송완료 물품..</p>
      <div class="row mb-5">
        <table class="table">
          <thead>
              <tr>
                  <th scope="col">Product</th>
                  <th scope="col">Price</th>
                  <th scope="col">Quantity</th>
                  <th scope="col">Total</th>
              </tr>
          </thead>
          <tbody>
              <tr>
                  <td>
                      <div class="media">
                          <div class="d-flex">
                              <img src="img/cart/cart2.png" alt="">
                          </div>
                          <div class="media-body">
                              <p>Minimalistic shop for multipurpose use</p>
                          </div>
                      </div>
                  </td>
                  <td>
                      <h5>item 테이블의 item_price</h5>
                  </td>
                  <td>
                      <h5>이전페이지에서 넘어온 수량.value의 값</h5>
                  </td>
                  <td>
                      <h5>토탈값</h5>
                  </td>
              </tr>
              <tr>
                  <td>
                      <div class="media">
                          <div class="d-flex">
                              <img src="img/cart/cart3.png" alt="">
                          </div>
                          <div class="media-body">
                              <p>Minimalistic shop for multipurpose use</p>
                          </div>
                      </div>
                  </td>
                  <td>
                      <h5>$360.00</h5>
                  </td>
                  <td>
                      <div class="product_count">
                          <input type="text" name="qty" id="sst" maxlength="12" value="1" title="Quantity:"
                              class="input-text qty">
                          <button onclick="var result = document.getElementById('sst'); var sst = result.value; if( !isNaN( sst )) result.value++;return false;"
                              class="increase items-count" type="button"><i class="lnr lnr-chevron-up"></i></button>
                          <button onclick="var result = document.getElementById('sst'); var sst = result.value; if( !isNaN( sst ) &amp;&amp; sst > 0 ) result.value--;return false;"
                              class="reduced items-count" type="button"><i class="lnr lnr-chevron-down"></i></button>
                      </div>
                  </td>
                  <td>
                      <h5>total 넘어온*</h5>
                  </td>
              </tr>
              
          </tbody>
      </table>
    </div>
  </section>
  <script>
 	console.log('안녕');
  </script>
</body>
</html>