<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>Verti</title>

<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<style>
</style>
</head>
<body class="is-preload homepage">
	<div id="page-wrapper">

		<!-- Header -->
		<jsp:include page="header.jsp" />

		<!-- Banner -->

		<!-- Features -->
		<div id="features-wrapper">
			<div class="container">
				<div class="row">
					<div class="col-4 col-12-medium">

						<!-- Box -->
						<section class="box feature">
							<a href="Beans.jsp" class="image featured"><img
								src="<%=request.getContextPath()%>/images/Beans.jpg"
								style="height: 300px; object-fit: cover;" /></a>
							<div class="inner">
								<header>
									<h2 style="font-size: 40px; text-align: center;">원두</h2>
									<p style="text-align: center">Beans</p>
								</header>
								<p>
									저희 카페에서는 다양한 원두를 제공합니다.<br>각각의 원두가 가진 특성과 맛을 설명하며, 커피에 대한
									깊은 이해를 돕습니다.
								</p>
							</div>
						</section>

					</div>
					<div class="col-4 col-12-medium">

						<!-- Box -->
						<section class="box feature">
							<a href="Coffee.jsp" class="image featured"><img
								src="images/cof_1.jpg" style="height: 300px; object-fit: cover;" /></a>
							<div class="inner">
								<header>
									<h2 style="font-size: 40px; text-align: center;">커피</h2>
									<p style="text-align: center">Coffee</p>
								</header>
								<p>
									당신의 입맛에 맞는 커피를 찾을 수 있습니다.<br>우리 카페의 인기 메뉴와 커피 전문가가 추천하는
									음료를 소개합니다.
								</p>
							</div>
						</section>

					</div>
					<div class="col-4 col-12-medium">

						<!-- Box -->
						<section class="box feature">
							<a href="Dessert.jsp" class="image featured"><img
								src="images/Dessert.jpg"
								style="height: 300px; object-fit: cover;" /></a>
							<div class="inner">
								<header>
									<h2 style="font-size: 40px; text-align: center;">디저트</h2>
									<p style="text-align: center">Dessert</p>
								</header>
								<p>
									커피와 함께 즐길 수 있는 디저트를 만나보세요.<br>소소한 간식부터 특별한 날 즐기는 디저트까지<br>커피
									타임을 더욱 특별하게 만들어줍니다.
								</p>
							</div>
						</section>

					</div>
				</div>
			</div>
		</div>

		<!-- Main -->
		<div id="main-wrapper">
			<div class="container">
				<div class="row gtr-200">
					<div class="col-4 col-12-medium">

						<!-- Sidebar -->
						<div id="sidebar">
							<section class="widget thumbnails">
								<h3>카페 소개</h3>
								<div class="grid">
									<div class="row gtr-50">
										<div class="col-6">
											<a href="#" class="image fit"><img
												src="images/Caffe Latte.png" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img
												src="images/cafe_inside.jpg" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img
												src="images/Beans_make.jpg" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img
												src="images/dessert_1.jpg" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img
												src="images/bari.jpg" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img
												src="images/bean.png" alt="" /></a>
										</div>
									</div>
								</div>
							</section>
						</div>

					</div>
					<div class="col-8 col-12-medium imp-medium">

						<!-- Content -->
						<div id="content">
							<section class="last" id="intro">
								<h2>The Heart of Coffee</h2>

								<p>
									저희 카페는 한 잔의 커피가 하루의 기분을 바꿀 수 있다고 믿습니다.<br> 매일 신선하게 로스팅한
									원두와 정성 가득한 한 잔을 통해<br> 고객에게 가장 편안한 시간을 선물하고자 합니다.<br>
								</p>

								<p>
									향기로운 커피, 따뜻한 공간, 그리고 좋은 사람들.<br> 작은 순간들이 쌓여 특별해지는 곳,<br>
									그 중심에 언제나 당신이 있었으면 합니다.<br>
								</p>

								<h3 style="margin-top: 25px;">Signature Menu</h3>
								<ul style="line-height: 1.8; color: #666;">
									<li>✨ 바닐라 라떼 — 달콤하고 부드러운 시그니처 메뉴</li>
									<li>☕ 드립 커피 — 신선한 원두의 향미를 그대로</li>
									<li>🍰 레몬 치즈케이크 — 상큼한 맛의 조화</li>
								</ul>


							</section>

						</div>

					</div>
				</div>
			</div>
		</div>

		<!-- Footer -->
		<jsp:include page="footer.jsp" />

	</div>

	<!-- Scripts -->

	<!-- <script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.dropotron.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script> -->

</body>
</html>