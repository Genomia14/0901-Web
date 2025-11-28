package board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model1.BoardDAO;
import model1.BoardDTO;
import utils.JSFunction;

@WebServlet("/edit.do")
public class BoardEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String sessionId = req.getSession().getAttribute("UserId").toString();
		// out에 필요한 변수 선언
		PrintWriter out = resp.getWriter();
		// 한글 출력시 깨지지 않도록 인코딩 설정
		resp.setContentType("text/html;charset=UTF-8");
		// PK로 사용할 파라미터를 저장
		String num = req.getParameter("num");
		// SQL을 실행하여 DB에서 데이터 저장
		BoardDAO dao = new BoardDAO();
		// 세션에 저장되어있는 로그인한 유저의 ID를 저장
		BoardDTO dto = dao.selectView(num);
		// 세션에 저장된 ID와 작성자의 ID가 같은지 확인
		if (!sessionId.equals(dto.getId())) {
			JSFunction.alertBack("작성자 본인만 수정할 수 있습니다.", out);
			return;
		}
		dao.close();
		req.setAttribute("dto", dto);
		req.getRequestDispatcher("/12_1/EditResult.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html;charset=UTF-8");
		String num = req.getParameter("num");
		String title = req.getParameter("title");
		String content = req.getParameter("content");

		BoardDTO dto = new BoardDTO();

		dto.setNum(num);
		dto.setTitle(title);
		dto.setContent(content);

		BoardDAO dao = new BoardDAO();
		int affected = dao.updateEdit(dto);
		dao.close();

		if (affected == 1) {
			resp.sendRedirect(req.getContextPath() + "/board.do?num=" + dto.getNum());
		} else {
			JSFunction.alertBack("수정하기에 실패하였습니다.", out);
		}

	}
}
