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

@WebServlet("/view.do")
public class ViewController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num = req.getParameter("num");
        if (num == null) {
            resp.sendRedirect("list.do");
            return;
        }

        BoardDAO dao = new BoardDAO();
        BoardDTO dto = dao.selectView(num);

        // 게시글 조회수 증가
        dao.updateVisitCount(num);

        // 세션에서 로그인 사용자 정보 가져오기
        HttpSession session = req.getSession();
        UserDTO loginUser = (UserDTO) session.getAttribute("loginUser");

        // 로그인된 사용자와 게시글 작성자가 동일한지 확인
        boolean isAuthor = loginUser != null && loginUser.getId().equals(dto.getId());

        // DTO와 isAuthor 값을 JSP로 전달
        req.setAttribute("dto", dto);
        req.setAttribute("isAuthor", isAuthor);

        req.getRequestDispatcher("view.jsp").forward(req, resp);
    }
}
