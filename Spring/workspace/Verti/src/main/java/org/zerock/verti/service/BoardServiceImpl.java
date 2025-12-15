package org.zerock.verti.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zerock.verti.dto.BoardDTO;
import org.zerock.verti.mappers.BoardMapper;
import org.zerock.verti.vo.BoardVO;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getList(String searchWord) {
        return boardMapper.selectList(searchWord)
                .stream()
                .map(BoardDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public BoardDTO getOne(int num) {
        BoardVO vo = boardMapper.selectOne(num);
        if (vo == null) return null;
        return new BoardDTO(vo);
    }

    @Override
    public void register(BoardDTO boardDTO) {
        boardMapper.insert(boardDTO.convertVO());
    }

    @Override
    public void modify(BoardDTO boardDTO) {
        boardMapper.update(boardDTO.convertVO());
    }

    @Override
    public void remove(int num) {
        boardMapper.delete(num);
    }

    @Override
    public void increaseVisitCount(int num) {
        boardMapper.incrementVisitCount(num);
    }
}
