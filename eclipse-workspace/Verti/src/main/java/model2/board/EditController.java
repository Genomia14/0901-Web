package model2.board;

import java.io.IOException;

import board.BoardDAO;
import board.BoardDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/edit.do")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String num = request.getParameter("num");
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.selectView(num);

		request.setAttribute("dto", dto);
		request.getRequestDispatcher("edit.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String num = request.getParameter("num");
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		BoardDTO dto = new BoardDTO();
		dto.setNum(num);
		dto.setTitle(title);
		dto.setContent(content);

		BoardDAO dao = new BoardDAO();
		int result = dao.updateEdit(dto);

		if (result == 1) {
			response.sendRedirect("view.do?num=" + num);
		} else {
			request.setAttribute("errorMessage", "게시물 수정에 실패했습니다.");
			request.getRequestDispatcher("edit.jsp").forward(request, response);
		}
	}
}
