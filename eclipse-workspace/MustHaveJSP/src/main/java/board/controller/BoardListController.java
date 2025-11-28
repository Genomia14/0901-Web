package board.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import board.service.BoardService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model1.BoardDTO;

@WebServlet("/boardlist.do")
public class BoardListController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private BoardService service = new BoardService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		Map<String, Object> param = new HashMap<>();
		String searchField = req.getParameter("searchField");
		String searchWord = req.getParameter("searchWord");
		if(searchWord != null){
			param.put("searchField", searchField);
			param.put("searchWord", searchWord);
		}
		int totalCount = service.getListCount(param);
		List<BoardDTO> boardLists = service.getList(param);
		
		req.setAttribute("totalCount",totalCount);
		req.setAttribute("boardLists", boardLists);
		req.getRequestDispatcher("/12_1/ListResult.jsp")
		.forward(req, resp);
	}
	
}










