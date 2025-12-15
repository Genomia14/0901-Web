<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../../assets/css/main.css" />

<style>
/* 기본적인 스타일 초기화 */
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

/* 페이지 타이틀 */
#coffee-title {
	text-align: center;
	margin-top: 60px;
}

#coffee-title h2 {
	font-size: 48px;
	margin-bottom: 10px;
	font-family: 'Arial', sans-serif;
}

#coffee-title p {
	color: #aaa;
	font-size: 18px;
	font-family: 'Arial', sans-serif;
}

.coffee-container {
	max-width: 1200px;
	margin: 0 auto;
	padding: 0 20px;
}

.coffee-grid {
	display: grid;
	grid-template-columns: repeat(4, 1fr);
	gap: 30px;
	margin-top: 40px;
}

.coffee-card {
	background: #2b2b2b;
	border-radius: 15px;
	padding: 20px;
	text-align: center;
	color: #fff;
	transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.coffee-card:hover {
	transform: translateY(-10px);
	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
}

.coffee-card img {
	width: 100%;
	height: 220px;
	object-fit: cover;
	border-radius: 10px;
}

.coffee-card h3 {
	margin-top: 15px;
	font-size: 26px;
	font-family: 'Arial', sans-serif;
}

.coffee-card p {
	color: #ccc;
	font-family: 'Arial', sans-serif;
}

.coffee-price {
	margin-top: 10px;
	font-size: 22px;
	font-weight: bold;
	font-family: 'Arial', sans-serif;
}

.coffee-btn {
	display: inline-block;
	margin-top: 15px;
	padding: 10px 18px;
	background: #e59f3c;
	color: #fff !important;
	border-radius: 5px;
	text-decoration: none;
	transition: background 0.3s ease;
}

.coffee-btn:hover {
	background: #d68c2c;
	transform: scale(1.05);
}

/* 반응형 디자인 */
@media ( max-width : 1024px) {
	.coffee-grid {
		grid-template-columns: repeat(3, 1fr);
	}
}

@media ( max-width : 768px) {
	.coffee-grid {
		grid-template-columns: repeat(2, 1fr);
	}
	.coffee-card {
		padding: 15px;
	}
	#coffee-title h2 {
		font-size: 36px;
	}
}

@media ( max-width : 480px) {
	.coffee-grid {
		grid-template-columns: 1fr;
	}
	#coffee-title h2 {
		font-size: 28px;
	}
}
</style>

<title>Coffee</title>
</head>
<body>
	<div id="page-wrapper">
		<jsp:include page="header.jsp" />

		<!-- 페이지 제목 -->
		<section id="coffee-title">
			<h2>커피 메뉴</h2>
			<p>저희 카페에서 제공하는 다양한 커피 음료를 만나보세요.</p>
		</section>

		<div class="coffee-container">

			<!-- 1. 에스프레소 기반 -->
			<h2 class="coffee-section-title">☕ 에스프레소 기반</h2>
			<div class="coffee-grid">

				<div class="coffee-card">
					<img src="../../images/Coffee_americano.jpg" alt="Americano" />
					<h3>아메리카노</h3>
					<p>진한 에스프레소의 맛을 그대로 담은 커피</p>
					<div class="coffee-price">₩4,500</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

				<div class="coffee-card">
					<img src="../../images/Coffee_macchiato.jpg" alt="Macchiato" />
					<h3>마키아토</h3>
					<p>에스프레소 위에 소량의 스팀 밀크를 얹은 진한 커피</p>
					<div class="coffee-price">₩4,800</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

				<div class="coffee-card">
					<img src="../../images/Coffee_cappuccino.jpg" alt="Cappuccino" />
					<h3>카푸치노</h3>
					<p>부드러운 우유 거품과 에스프레소가 어우러진 클래식한 맛</p>
					<div class="coffee-price">₩5,200</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

				<div class="coffee-card">
					<img src="../../images/Coffee_mocha.jpg" alt="Mocha" />
					<h3>모카</h3>
					<p>초콜릿과 에스프레소, 우유의 달콤한 조화</p>
					<div class="coffee-price">₩5,500</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>
			</div>
				<br>

			<!-- 2. 라떼 & 우유 -->
			<h2 class="coffee-section-title">🥛 라떼 & 우유</h2>
			<div class="coffee-grid">

				<div class="coffee-card">
					<img src="../../images/Coffee_latte.jpg" alt="Latte" />
					<h3>카페 라떼</h3>
					<p>부드러운 스팀 밀크와 에스프레소의 조화</p>
					<div class="coffee-price">₩5,000</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

				<div class="coffee-card">
					<img src="../../images/Coffee_cappuccino.jpg" alt="Cappuccino" />
					<h3>카푸치노</h3>
					<p>부드러운 우유 거품과 에스프레소의 조화</p>
					<div class="coffee-price">₩5,200</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

				<div class="coffee-card">
					<img src="../../images/Coffee_macchiato.jpg" alt="Macchiato" />
					<h3>플랫 화이트</h3>
					<p>라떼보다 진하고 부드러운 우유의 조화</p>
					<div class="coffee-price">₩5,300</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

				<div class="coffee-card">
					<img src="../../images/Coffee_mocha.jpg" alt="Mocha" />
					<h3>화이트 모카</h3>
					<p>화이트 초콜릿과 에스프레소의 부드러운 조화</p>
					<div class="coffee-price">₩5,700</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>
			</div>
			<br>


			<!-- 3. 아이스 커피 -->
			<h2 class="coffee-section-title">❄ 아이스 커피</h2>
			<div class="coffee-grid">

				<div class="coffee-card">
					<img src="images/Coffee_iced.jpg" alt="Iced Coffee" />
					<h3>아이스 아메리카노</h3>
					<p>시원하고 깔끔한 에스프레소 기반 아이스 커피</p>
					<div class="coffee-price">₩4,800</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

				<div class="coffee-card">
					<img src="images/Coffee_iced.jpg" alt="Iced Latte" />
					<h3>아이스 라떼</h3>
					<p>시원한 우유와 에스프레소의 조화</p>
					<div class="coffee-price">₩5,300</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

				<div class="coffee-card">
					<img src="images/Coffee_iced.jpg" alt="Vanilla Iced" />
					<h3>바닐라 아이스 라떼</h3>
					<p>달콤한 바닐라 향과 시원한 라떼</p>
					<div class="coffee-price">₩5,800</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

				<div class="coffee-card">
					<img src="images/Coffee_iced.jpg" alt="Iced Mocha" />
					<h3>아이스 모카</h3>
					<p>초콜릿과 에스프레소의 시원한 콜라보</p>
					<div class="coffee-price">₩5,900</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

			</div>
			<br>

			<!-- 4. 스페셜 메뉴 -->
			<h2 class="coffee-section-title">🍫 스페셜 메뉴</h2>
			<div class="coffee-grid">

				<div class="coffee-card">
					<img src="../../images/Coffee_mocha.jpg" alt="Mocha" />
					<h3>카라멜 마키아토</h3>
					<p>카라멜 시럽과 에스프레소의 달콤한 조화</p>
					<div class="coffee-price">₩5,800</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

				<div class="coffee-card">
					<img src="../../images/Coffee_mocha.jpg" alt="Mocha" />
					<h3>바닐라 빈 라떼</h3>
					<p>리얼 바닐라 향이 살아있는 스페셜 라떼</p>
					<div class="coffee-price">₩6,000</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

				<div class="coffee-card">
					<img src="../../images/Coffee_mocha.jpg" alt="Mocha" />
					<h3>돌체 라떼</h3>
					<p>진하고 달콤한 연유 라떼</p>
					<div class="coffee-price">₩6,200</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

				<div class="coffee-card">
					<img src="../../images/Coffee_mocha.jpg" alt="Mocha" />
					<h3>콜드 브루</h3>
					<p>장시간 추출해 깊고 깔끔한 풍미</p>
					<div class="coffee-price">₩6,500</div>
					<a href="#" class="coffee-btn">구매하기</a>
				</div>

			</div>

		</div>



		<jsp:include page="footer.jsp" />
	</div>
</body>
</html>
