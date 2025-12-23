package me.shinsunyoung.springbootdeveloper.dto;

import lombok.Getter;
import me.shinsunyoung.springbootdeveloper.domain.Article;

import java.time.LocalDateTime;

@Getter
public class ArticleResponse {
    private final String title;
    private final String content;
    private final String user_id;
    // DTO를 Entity로 변경하는 메서드
    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
        this.user_id = article.getUserId();
    }
}