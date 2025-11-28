package member.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout.do")
public class LogoutController extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		session.removeAttribute("User_Id");
		session.removeAttribute("User_Name");

		// 세션의 전체 데이터 삭제
		session.invalidate();
		// 세션 데이터 삭제 후로그인 페이지로 이동
		resp.sendRedirect("/MustHaveJSP/login.do");
	}
}
