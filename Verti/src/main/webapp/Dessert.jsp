<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="assets/css/main.css" />

<style>
/* 기본적인 스타일 초기화 */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

/* 페이지 타이틀 */
#dessert-title {
    text-align: center;
    margin-top: 60px;
}

#dessert-title h2 {
    font-size: 48px;
    margin-bottom: 10px;
    font-family: 'Arial', sans-serif;
}

#dessert-title p {
    color: #aaa;
    font-size: 18px;
    font-family: 'Arial', sans-serif;
}

/* 컨테이너 */
.dessert-container {
    max-width: 1200px;
    margin: 0 auto;
    padding: 0 20px;
}

/* 그리드 */
.dessert-grid {
    display: grid;
    grid-template-columns: repeat(4, 1fr);
    gap: 30px;
    margin-top: 40px;
}

/* 카드 */
.dessert-card {
    background: #2b2b2b;
    border-radius: 15px;
    padding: 20px;
    text-align: center;
    color: #fff;
    transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.dessert-card:hover {
    transform: translateY(-10px);
    box-shadow: 0 10px 20px rgba(0,0,0,0.1);
}

.dessert-card img {
    width: 100%;
    height: 220px;
    object-fit: cover;
    border-radius: 10px;
}

.dessert-card h3 {
    margin-top: 15px;
    font-size: 26px;
    font-family: 'Arial', sans-serif;
}

.dessert-card p {
    color: #ccc;
    font-family: 'Arial', sans-serif;
}

.dessert-price {
    margin-top: 10px;
    font-size: 22px;
    font-weight: bold;
}

.dessert-btn {
    display: inline-block;
    margin-top: 15px;
    padding: 10px 18px;
    background: #e59f3c;
    color: #fff !important;
    border-radius: 5px;
    text-decoration: none;
    transition: background 0.3s ease;
}

.dessert-btn:hover {
    background: #d68c2c;
    transform: scale(1.05);
}

/* 섹션 제목 */
.dessert-section-title {
    margin-top: 60px;
    font-size: 34px;
    color: #fff;
    padding-left: 8px;
    border-left: 6px solid #e59f3c;
}

/* 반응형 */
@media (max-width: 1024px) {
    .dessert-grid {
        grid-template-columns: repeat(3, 1fr);
    }
}

@media (max-width: 768px) {
    .dessert-grid {
        grid-template-columns: repeat(2, 1fr);
    }
    #dessert-title h2 {
        font-size: 36px;
    }
}

@media (max-width: 480px) {
    .dessert-grid {
        grid-template-columns: 1fr;
    }
    #dessert-title h2 {
        font-size: 28px;
    }
}
</style>

<title>Dessert</title>
</head>
<body>
<div id="page-wrapper">
    <jsp:include page="header.jsp" />

    <!-- 페이지 제목 -->
    <section id="dessert-title">
        <h2>디저트 메뉴</h2>
        <p>저희 카페에서 제공하는 다양한 디저트를 만나보세요.</p>
    </section>

    <div class="dessert-container">

        <!-- 1. 케이크 -->
        <h2 class="dessert-section-title">🍰 케이크</h2>
        <div class="dessert-grid">

            <div class="dessert-card">
                <img src="images/Dessert_cheesecake.jpg" alt="Cheesecake">
                <h3>뉴욕 치즈케이크</h3>
                <p>진하고 부드러운 클래식 치즈케이크</p>
                <div class="dessert-price">₩6,500</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

            <div class="dessert-card">
                <img src="images/Dessert_redvelvet.jpg" alt="Red Velvet">
                <h3>레드벨벳 케이크</h3>
                <p>달콤한 크림과 촉촉한 레드 시트</p>
                <div class="dessert-price">₩6,800</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

            <div class="dessert-card">
                <img src="images/Dessert_choco.jpg" alt="Chocolate Cake">
                <h3>초코 케이크</h3>
                <p>진한 초코와 촉촉한 크림의 조화</p>
                <div class="dessert-price">₩6,700</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

            <div class="dessert-card">
                <img src="images/Dessert_tiramisu.jpg" alt="Tiramisu">
                <h3>티라미수</h3>
                <p>마스카포네 크림과 커피의 부드러운 만남</p>
                <div class="dessert-price">₩6,900</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

        </div><br>

        <!-- 2. 쿠키 & 스콘 -->
        <h2 class="dessert-section-title">🍪 쿠키 & 스콘</h2>
        <div class="dessert-grid">

            <div class="dessert-card">
                <img src="images/Dessert_cookie.jpg" alt="Cookie">
                <h3>초코칩 쿠키</h3>
                <p>바삭하고 달콤한 초코칩 가득</p>
                <div class="dessert-price">₩3,000</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

            <div class="dessert-card">
                <img src="images/Dessert_scone.jpg" alt="Scone">
                <h3>플레인 스콘</h3>
                <p>부드럽고 담백한 클래식 스콘</p>
                <div class="dessert-price">₩3,500</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

            <div class="dessert-card">
                <img src="images/Dessert_matcha_cookie.jpg" alt="Matcha Cookie">
                <h3>말차 쿠키</h3>
                <p>고소한 말차향과 달콤함의 조화</p>
                <div class="dessert-price">₩3,200</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

            <div class="dessert-card">
                <img src="images/Dessert_cranberry_scone.jpg" alt="Cranberry Scone">
                <h3>크랜베리 스콘</h3>
                <p>새콤달콤한 크랜베리의 풍미</p>
                <div class="dessert-price">₩3,800</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

        </div><br>

        <!-- 3. 브레드 -->
        <h2 class="dessert-section-title">🥐 브레드</h2>
        <div class="dessert-grid">

            <div class="dessert-card">
                <img src="images/Dessert_croissant.jpg" alt="Croissant">
                <h3>크루아상</h3>
                <p>겹겹이 살아있는 바삭한 식감</p>
                <div class="dessert-price">₩4,000</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

            <div class="dessert-card">
                <img src="images/Dessert_garlicbread.jpg" alt="Garlic Bread">
                <h3>마늘 바게트</h3>
                <p>향긋한 갈릭 버터의 풍미</p>
                <div class="dessert-price">₩4,500</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

            <div class="dessert-card">
                <img src="images/Dessert_cream_bread.jpg" alt="Cream Bread">
                <h3>생크림 브레드</h3>
                <p>달콤하고 부드러운 생크림 가득</p>
                <div class="dessert-price">₩4,200</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

            <div class="dessert-card">
                <img src="images/Dessert_butterroll.jpg" alt="Butter Roll">
                <h3>버터롤</h3>
                <p>고소한 버터향이 가득한 롤브레드</p>
                <div class="dessert-price">₩3,900</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

        </div><br>

        <!-- 4. 시즌 디저트 -->
        <h2 class="dessert-section-title">🍓 시즌 디저트</h2>
        <div class="dessert-grid">

            <div class="dessert-card">
                <img src="images/Dessert_strawberry.jpg" alt="Strawberry Cake">
                <h3>딸기 생크림 케이크</h3>
                <p>신선한 딸기와 부드러운 크림</p>
                <div class="dessert-price">₩7,000</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

            <div class="dessert-card">
                <img src="images/Dessert_mango.jpg" alt="Mango Tart">
                <h3>망고 타르트</h3>
                <p>달콤한 망고가 듬뿍!</p>
                <div class="dessert-price">₩7,200</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

            <div class="dessert-card">
                <img src="images/Dessert_blueberry.jpg" alt="Blueberry Tart">
                <h3>블루베리 타르트</h3>
                <p>상큼한 블루베리의 향미</p>
                <div class="dessert-price">₩7,200</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

            <div class="dessert-card">
                <img src="images/Dessert_injeolmi.jpg" alt="Injeolmi">
                <h3>인절미 크림떡</h3>
                <p>달콤한 콩고물과 쫀득한 식감</p>
                <div class="dessert-price">₩6,000</div>
                <a href="#" class="dessert-btn">구매하기</a>
            </div>

        </div>

    </div>

    <jsp:include page="footer.jsp" />
</div>
</body>
</html>
