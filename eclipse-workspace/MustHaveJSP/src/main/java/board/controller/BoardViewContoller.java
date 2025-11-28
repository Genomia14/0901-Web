package board.controller;

import java.io.IOException;

import board.service.BoardService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model1.BoardDTO;


@WebServlet("/board.do")
public class BoardViewContoller extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private BoardService service = new BoardService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	String num = req.getParameter("num");

	service.editVisitCount(num);
	
	BoardDTO dto = service.getBoard(num);
	req.setAttribute("dto", dto);
	req.getRequestDispatcher("/12_1/ViewResult.jsp").forward(req, resp);
	}
}