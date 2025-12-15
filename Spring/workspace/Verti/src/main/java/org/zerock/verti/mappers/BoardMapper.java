package org.zerock.verti.mappers;

import org.zerock.verti.vo.BoardVO;
import java.util.List;

public interface BoardMapper {
    List<BoardVO> selectList(String searchWord);
    BoardVO selectOne(int num);
    void insert(BoardVO boardVO);
    void update(BoardVO boardVO);
    void delete(int num);
    void incrementVisitCount(int num);
}
