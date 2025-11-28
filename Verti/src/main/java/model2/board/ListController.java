package model2.board;

import java.io.IOException;
import java.util.List;

import User.UserDTO;
import board.BoardDAO;
import board.BoardDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/list.do")
public class ListController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserDTO loginUser = (UserDTO) session.getAttribute("loginUser");

        if (loginUser == null) {
            session.setAttribute("returnURL", "/list.do");
            request.setAttribute("alertMessage", "로그인 후 게시판을 이용할 수 있습니다.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;
        }

        String searchWord = request.getParameter("searchWord");

        if (searchWord == null || searchWord.trim().isEmpty()) {
            searchWord = " ";  
        }

        BoardDAO dao = new BoardDAO();
        
        List<BoardDTO> boardLists = dao.selectList(searchWord);
        
        request.setAttribute("boardLists", boardLists);
        
        int totalCount = dao.selectCount(searchWord);
        request.setAttribute("totalCount", totalCount);

        if (totalCount == 0) {
            request.setAttribute("noResultsMessage", "게시물이 없습니다.");
        }

        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}
