package org.zerock.verti.service;

import org.zerock.verti.dto.BoardDTO;
import java.util.List;

public interface BoardService {
    List<BoardDTO> getList(String searchWord);
    BoardDTO getOne(int num);
    void register(BoardDTO boardDTO);
    void modify(BoardDTO boardDTO);
    void remove(int num);
    void increaseVisitCount(int num);
}
