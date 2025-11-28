package board.service;

import java.util.List;
import java.util.Map;

import model1.BoardDAO;
import model1.BoardDTO;

public class BoardService {

	// 출력하는 리스트 전체 개수를 출력
	// 서비스의 경우 데이터를 변경하지 않는다면 작성할 내용이 거의 없음
	// 중간 연결 클래스로 생각하고 반드시 작성해야함
	public int getListCount(Map<String, Object> param) {
		BoardDAO dao = new BoardDAO();
		int totalCount = dao.selectCount(param);
		// DB연결 종료
		dao.close();
		return totalCount;
	}

	public List<BoardDTO> getList(Map<String, Object> param) {
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> dtoList = dao.selectList(param);
		// DB연결 종료
		dao.close();
		return dtoList;
	}

	// 조회수 1증가 서비스
	public void editVisitCount(String num) {
		BoardDAO dao = new BoardDAO();
		dao.updateVisitCount(num);
		dao.close();
	}

	// 1건 조회 서비스
	public BoardDTO getBoard(String num) {
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.selectView(num);
		dto.setContent(dto.getContent());
		dao.close();
		return dto;
	}

	public int write(BoardDTO dto) {
		BoardDAO dao = new BoardDAO();
		int result = dao.insertWrite(dto);
		dao.close();
		return result;
	}

	public int deletePost(BoardDTO dto) {
		BoardDAO dao = new BoardDAO();
		int result = dao.deletePost(dto);
		dao.close();
		return result;
	}
	public int updateEdit(BoardDTO dto) {
		BoardDAO dao = new BoardDAO();
		int result = dao.updateEdit(dto);
		dao.close();
		return result;
	}

}
