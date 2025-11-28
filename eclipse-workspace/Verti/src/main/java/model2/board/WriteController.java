package model2.board;

import java.io.IOException;

import User.UserDTO;
import board.BoardDAO;
import board.BoardDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/write.do")
public class WriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("write.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");

		HttpSession session = req.getSession();
		UserDTO loginUser = (UserDTO) session.getAttribute("loginUser");

		if (loginUser == null) {
			session.setAttribute("returnURL", "/write.do"); // 로그인 후 돌아오도록
			req.setAttribute("alertMessage", "글쓰기는 로그인이 필요합니다."); // 알림 메시지 설정
			req.getRequestDispatcher("login.jsp").forward(req, resp); // 로그인 페이지로 리다이렉트
			return;
		}

		String id = loginUser.getId();

		String title = req.getParameter("title");
		String content = req.getParameter("content");

		BoardDTO dto = new BoardDTO();
		dto.setTitle(title);
		dto.setContent(content);
		dto.setId(id);

		BoardDAO dao = new BoardDAO();
		int result = dao.insertWrite(dto);

		if (result > 0) {
			resp.sendRedirect("list.do");
		} else {
			req.setAttribute("alertMessage", "작성에 실패하였습니다.");
			req.getRequestDispatcher("write.jsp").forward(req, resp);
		}
	}
}