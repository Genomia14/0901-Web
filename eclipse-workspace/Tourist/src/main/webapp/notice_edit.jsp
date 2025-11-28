<%@page import="board.BoardDTO"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String num = request.getParameter("num");
	BoardDAO dao = new BoardDAO();
	BoardDTO dto = dao.selectView(num);
	/* String sessionId = session.getAttribute("id").toString();
	if(!sessionId.equals(dto.getId())){
		JSFunction.alertBack("작성자 본인만 수정할 수 있습니다.", out);
		return;  */

	request.setAttribute("dto", dto);
	request.setAttribute("num", num);
	request.getRequestDispatcher("notice_editResult.jsp").forward(request, response);

%>  


