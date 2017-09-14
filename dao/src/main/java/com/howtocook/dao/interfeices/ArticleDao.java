package com.howtocook.dao.interfeices;

import com.howtocook.domain.Article;

/**
 * @author Viktar Kolbik
 * @since 7/31/17
 */
public interface ArticleDao {
    int add(Article article);
    void update(Article article);
    void remove(int articleId);
}