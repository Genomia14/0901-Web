<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>게시물 수정</title>
<link rel="stylesheet" href="../../assets/css/main.css" />
</head>
<body>
<div id="page-wrapper">
    <jsp:include page="header.jsp" />

    <h2>게시물 수정</h2>

    <form method="post" action="edit.do">
        <input type="hidden" name="num" value="${dto.num}" />

        <table>
            <tr>
                <th>제목</th>
                <td>
                    <input type="text" name="title" value="${dto.title}" required />
                </td>
            </tr>

            <tr>
                <th>내용</th>
                <td>
                    <textarea name="content" rows="10" required>${dto.content}</textarea>
                </td>
            </tr>

        </table>

        <input type="submit" value="수정 완료" />
        <button type="button" onclick="history.back()">뒤로가기</button>
    </form>

    <jsp:include page="footer.jsp" />
</div>
</body>
</html>
