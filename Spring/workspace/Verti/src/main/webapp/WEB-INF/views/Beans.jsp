<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
#beans-title {
    text-align: center;
    margin-top: 60px;
}

#beans-title h2 {
    font-size: 48px;
    margin-bottom: 10px;
    font-family: 'Arial', sans-serif;
}

#beans-title p {
    color: #aaa;
    font-size: 18px;
    font-family: 'Arial', sans-serif;
}

.container {
    max-width: 1200px;
    margin: 0 auto;
    padding: 0 20px;
}

/* 원두 그리드 */
.beans-grid {
    display: grid;
    grid-template-columns: repeat(4, 1fr);
    grid-gap: 30px;
    margin-top: 40px;
}

.bean-card {
    background: #1a1a1a; /* 연한 검정 */
    border-radius: 15px;
    padding: 20px;
    text-align: center;
    color: #fff;
    transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.bean-card:hover {
    transform: translateY(-10px);
    box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
}

.bean-card img {
    width: 100%;
    height: 220px;
    object-fit: cover;
    border-radius: 10px;
}

.bean-card h3 {
    margin-top: 15px;
    font-size: 26px;
    font-family: 'Arial', sans-serif;
}

.bean-card p {
    color: #ccc;
    font-family: 'Arial', sans-serif;
}

.bean-price {
    margin-top: 10px;
    font-size: 22px;
    font-weight: bold;
}

.bean-btn {
    display: inline-block;
    margin-top: 15px;
    padding: 10px 18px;
    background: #e59f3c;
    color: #fff !important;
    border-radius: 5px;
    text-decoration: none;
    transition: background 0.3s ease, transform 0.3s ease;
}

.bean-btn:hover {
    background: #d68c2c;
    transform: scale(1.05);
}

/* 반응형 디자인 */
@media (max-width: 1024px) {
    .beans-grid {
        grid-template-columns: repeat(3, 1fr);
    }
}

@media (max-width: 768px) {
    .beans-grid {
        grid-template-columns: repeat(2, 1fr);
    }

    .bean-card {
        padding: 15px;
    }

    #beans-title h2 {
        font-size: 36px;
    }
}

@media (max-width: 480px) {
    .beans-grid {
        grid-template-columns: 1fr;
    }

    #beans-title h2 {
        font-size: 28px;
    }
}
</style>

<title>Beans</title>
</head>
<body>
    <div id="page-wrapper">
        <jsp:include page="header.jsp" />

        <!-- 페이지 제목 -->
        <section id="beans-title">
            <h2>원두</h2>
            <p>저희 카페에서 판매하는 신선한 스페셜티 원두입니다.</p>
        </section>

        <!-- 원두 그리드 영역 -->
        <div class="container">
            <div class="beans-grid">

                <!-- 원두 카드 1 -->
                <div class="bean-card">
                    <img src="../../images/Bean_Ethiopia.jpg" alt="Ethiopia Bean" />
                    <h3>에티오피아 예가체프</h3>
                    <p>과일향과 플로럴 향이 돋보이는<br>밝은 산미의 원두</p>
                    <div class="bean-price">₩12,000</div>
                    <a href="#" class="bean-btn">구매하기</a>
                </div>

                <!-- 원두 카드 2 -->
                <div class="bean-card">
                    <img src="../../images/Bean_Brazil.jpg" alt="Brazil Bean" />
                    <h3>브라질 산토스</h3>
                    <p>고소하고 묵직한 바디감<br>누구나 즐기기 좋은 부드러운 맛</p>
                    <div class="bean-price">₩10,000</div>
                    <a href="#" class="bean-btn">구매하기</a>
                </div>

                <!-- 원두 카드 3 -->
                <div class="bean-card">
                    <img src="../../images/Bean_Kenya.jpg" alt="Kenya Bean" />
                    <h3>케냐 AA</h3>
                    <p>싱그러운 산미와 강렬한 풍미가<br>특징인 스페셜티 원두</p>
                    <div class="bean-price">₩13,000</div>
                    <a href="#" class="bean-btn">구매하기</a>
                </div>

                <!-- 원두 카드 4 -->
                <div class="bean-card">
                    <img src="../../images/Bean_Colombia.jpg" alt="Colombia Bean" />
                    <h3>콜롬비아 수프리모</h3>
                    <p>균형 잡힌 바디감과 산미<br>누구나 좋아하는 클래식한 맛</p>
                    <div class="bean-price">₩11,000</div>
                    <a href="#" class="bean-btn">구매하기</a>
                </div>
                
                <!-- 원두 카드 5 -->
                <div class="bean-card">
                    <img src="../../images/Bean_Guatemala.jpg" alt="Guatemala Bean" />
                    <h3>과테말라 산타모니카</h3>
                    <p>깊고 선명한 달콤함과<br>기분 좋은 스모키함의 만남</p>
                    <div class="bean-price">₩13,200</div>
                    <a href="#" class="bean-btn">구매하기</a>
                </div>

                <!-- 원두 카드 6 -->
                <div class="bean-card">
                    <img src="../../images/Bean_Yemen.jpg" alt="Yemen Bean" />
                    <h3>예멘 모카</h3>
                    <p>깊은 아로마의 고소함을 가진<br>특별함, 커피의 여왕</p>
                    <div class="bean-price">₩23,000</div>
                    <a href="#" class="bean-btn">구매하기</a>
                </div>

                <!-- 원두 카드 7 -->
                <div class="bean-card">
                    <img src="../../images/Bean_Indonesia.jpg" alt="Indonesia Bean" />
                    <h3>인도네시아 만델링</h3>
                    <p>풍부한 바디감과 짙은 흙내음<br> 견과류의 구수함</p>
                    <div class="bean-price">₩9,600</div>
                    <a href="#" class="bean-btn">구매하기</a>
                </div>

                <!-- 원두 카드 8 -->
                <div class="bean-card">
                    <img src="../../images/Bean_arabica.jpg" alt="arabica Bean" />
                    <h3>커피원두콩 아라비카</h3>
                    <p>구수한 깊은 바디감의 단맛<br> 카페용 도매가격 에스프레소</p>
                    <div class="bean-price">₩8,400</div>
                    <a href="#" class="bean-btn">구매하기</a>
                </div>

            </div>
        </div>

        <jsp:include page="footer.jsp" />
    </div>
</body>
</html>
