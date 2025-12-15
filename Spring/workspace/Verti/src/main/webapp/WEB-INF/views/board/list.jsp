<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시판 목록</title>
    <link rel="stylesheet" href="/resources/assets/css/main.css" />
    <style>
        table { width:100%; border-collapse:collapse; margin-top:20px; }
        table, th, td { border:1px solid #ccc; }
        th, td { padding:10px; text-align:center; color:black; }
        th { background-color:#f2f2f2; }
    </style>
</head>
<body>
<div id="page-wrapper">
    <jsp:include page="/WEB-INF/views/header.jsp" />

    <form method="get" action="${pageContext.request.contextPath}/board/list">
        <table>
            <tr>
                <td>
                    <input type="text" name="searchWord" placeholder="검색어를 입력하세요" value="${param.searchWord}" />
                    <input type="submit" value="검색" />
                </td>
            </tr>
        </table>
    </form>

    <div class="content">
        <h2>게시판 목록</h2>
        <p>총 게시물 수: ${totalCount}</p>
        <c:if test="${not empty noResultsMessage}"><p>${noResultsMessage}</p></c:if>

        <table>
            <thead>
            <tr>
                <th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회수</th><th>상세보기</th>
            </tr>
            </thead>
            <tbody>
            <c:choose>
                <c:when test="${empty boardLists}">
                    <tr><td colspan="6">등록된 게시물이 없습니다.</td></tr>
                </c:when>
                <c:otherwise>
                    <c:forEach var="board" items="${boardLists}">
                        <tr>
                            <td>${board.num}</td>
                            <td>${board.title}</td>
                            <td>${board.id}</td>
                            <td>${board.postdate}</td>
                            <td>${board.visitcount}</td>
                            <td><a href="${pageContext.request.contextPath}/board/view?num=${board.num}">상세보기</a></td>
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
            </tbody>
        </table>

        <c:url var="writeUrl" value="/board/write"/>
        <button type="button" onclick="location.href='${writeUrl}'">글쓰기</button>

    </div>

    <jsp:include page="/WEB-INF/views/footer.jsp" />
</div>
</body>
</html>
