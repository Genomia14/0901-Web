package model2.board;

import java.io.IOException;

import User.UserDTO;
import board.BoardDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		BoardDAO dao = new BoardDAO();
		UserDTO user = dao.getUserById(id);

		if (user != null && user.getPassword().equals(password)) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);

			String returnURL = (String) session.getAttribute("returnURL");
			if (returnURL != null) {
				session.removeAttribute("returnURL"); 
				response.sendRedirect(returnURL); 
			} else {
				response.sendRedirect(request.getContextPath() + "/Index.jsp");
			}
		} else {
			request.setAttribute("alertMessage", "아이디 또는 비밀번호가 잘못되었습니다.");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
}
