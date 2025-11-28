<%@page import="utils.BoardPage"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판</title>
</head>
<body>
	<jsp:include page="../common/Link.jsp"/>
	<h2>목록 보기(List) - 현재페이지 ${pageNum}(전체페이지 : ${totalPage} )</h2>
	<form method="get">
	<table border="1" width="90%">
	<tr>
		<td align="center">
			<select name="searchField">
				<option value="title">제목</option>
				<option value="content">내용</option>
			</select>
			<input type="text" name="searchWord" />					
			<input type="submit" value="검색하기" />					
		</td>
	</tr>
	</table>
	</form>
	
	<table border="1" width="90%">
		<tr>
			<th width="10%">번호</th>
			<th width="50%">제목</th>
			<th width="15%">작성자</th>
			<th width="10%">조회수</th>
			<th width="15%">작성일</th>
		</tr>
	<c:choose>
		<c:when test="${empty boardLists}">
			<tr>
				<td colspan="5" align="center">등록된 게시물이 없습니다^^*<td>
			</tr>
		</c:when>
		<c:otherwise>
			<c:forEach var="dto" items="${boardLists}" varStatus="status">
				<c:set var="virtualNum"
				value="${totalCount - ((pageNum - 1) * pageSize + status.index)}"/>
				<tr align="center">
					<td>${virtualNum}</td>
					<td>${dto.title}</td>
					<td>${dto.id}</td>
					<td>${dto.visitcount}</td>
					<td>${dto.postdate}</td>
				</tr>
			</c:forEach>
		</c:otherwise>			
	</c:choose>
</table>
	<table border="1" width="90%">
		<tr align="center">
			<td>
 				${BoardPage.pagingStr(totalCount, pageSize,
						blockPage, pageNum, request.getRequestURL().toString()) }
			</td>
			<!-- 글쓰기 버튼 -->
			<td><button type="button" onclick="location.href='Write.jsp';">글쓰기
			</button></td>
		</tr>
	</table>
</body>
</html>