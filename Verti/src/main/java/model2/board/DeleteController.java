package model2.board;

import java.io.IOException;

import board.BoardDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete.do")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

		@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String num = request.getParameter("num");

        BoardDAO
        dao = new BoardDAO();
        int result = dao.deleteBoard(num);
        dao.close();

        if (result == 1) {
            response.sendRedirect("../list.do");
        } else {
            request.setAttribute("errorMessage", "삭제에 실패했습니다.");
            request.getRequestDispatcher("/board/view.do?num=" + num).forward(request, response);
        }
    }
}
