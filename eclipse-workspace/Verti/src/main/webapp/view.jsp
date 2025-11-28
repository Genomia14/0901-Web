<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>게시글 보기</title>
<link rel="stylesheet" href="assets/css/main.css" />
<style>
#view-wrapper {
    max-width: 800px;
    margin: 40px auto;
    background: white;
    padding: 30px;
    border-radius: 8px;
    box-shadow: 0 3px 10px rgba(0, 0, 0, 0.1);
}

#view-title {
    font-size: 26px;
    font-weight: bold;
    margin-bottom: 20px;
}

#view-info {
    color: #777;
    font-size: 14px;
    margin-bottom: 20px;
}

#view-content {
    font-size: 16px;
    line-height: 1.6;
    white-space: pre-line; /* 개행 유지 */
    margin-bottom: 30px;
}

.view-buttons a {
    padding: 10px 18px;
    background: #3cadd4;
    color: white;
    text-decoration: none;
    border-radius: 4px;
    margin-right: 10px;
}

.view-buttons a:hover {
    background: #37a0c5;
}
</style>
</head>

<body class="is-preload homepage">
    <div id="page-wrapper">

        <!-- Header -->
        <jsp:include page="header.jsp" />

        <div id="view-wrapper">
            <!-- 제목 -->
            <div id="view-title">${dto.title}</div>

            <!-- 정보 -->
            <div id="view-info">작성자 : ${dto.id} &nbsp; | &nbsp; 작성일 : ${dto.postdate} &nbsp; | &nbsp; 조회수 : ${dto.visitcount}</div>

            <!-- 본문 내용 -->
            <div id="view-content">${dto.content}</div>

            <!-- 버튼 영역 -->
            <div class="view-buttons">
                <!-- 목록 -->
                <a href="list.do">목록</a>

                <!-- 본인 글일 때만 수정/삭제 표시 -->
                <c:if test="${isAuthor}">
                    <!-- 수정/삭제 버튼 -->
                    <a href="edit.do?num=${dto.num}">수정</a>
                    <a href="/delete.do?num=${dto.num}" onclick="return confirm('정말 삭제하시겠습니까?');">삭제</a>
                </c:if>

            </div>
        </div>

        <jsp:include page="footer.jsp" />
    </div>

    <!-- Scripts -->
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/browser.min.js"></script>
    <script src="assets/js/breakpoints.min.js"></script>
    <script src="assets/js/util.js"></script>
    <script src="assets/js/main.js"></script>

</body>
</html>
