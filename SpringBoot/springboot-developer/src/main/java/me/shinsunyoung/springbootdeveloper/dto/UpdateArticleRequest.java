package me.shinsunyoung.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class UpdateArticleRequest {
    private String title;
    private String content;
    private List<MultipartFile> files;
}
