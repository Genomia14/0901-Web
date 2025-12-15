package org.zerock.verti.dto;

import lombok.Data;
import org.zerock.verti.vo.BoardVO;

@Data
public class BoardDTO {
    private int num;
    private String title;
    private String content;
    private String id;
    private String postdate;
    private int visitcount;

    public BoardDTO() {}

    public BoardDTO(BoardVO vo) {
        this.num = vo.getNum();
        this.title = vo.getTitle();
        this.content = vo.getContent();
        this.id = vo.getId();
        this.postdate = vo.getPostdate();
        this.visitcount = vo.getVisitcount();
    }

    public BoardVO convertVO() {
        BoardVO vo = new BoardVO();
        vo.setNum(this.num);
        vo.setTitle(this.title);
        vo.setContent(this.content);
        vo.setId(this.id);
        vo.setPostdate(this.postdate);
        vo.setVisitcount(this.visitcount);
        return vo;
    }
}
