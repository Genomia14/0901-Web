package me.shinsunyoung.springbootdeveloper.repository;

import me.shinsunyoung.springbootdeveloper.domain.Article;
import me.shinsunyoung.springbootdeveloper.repository.search.ArticleSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Article, Long>, ArticleSearch {
    List<Article> findByTitle(String title);
}
