package org.zerock.verti.vo;

import lombok.Data;

@Data
public class BoardVO {
    private int num;
    private String title;
    private String content;
    private String id;
    private String postdate;
    private int visitcount;
}
