package com.howtocook.dao.interfeices;

import com.howtocook.domain.Comment;
import com.howtocook.domain.Recipe;

/**
 * @author Viktar Kolbik
 * @since 7/31/17
 */
public interface CommentDao {
    int add(Comment comment);
    void update(Comment comment);
    void remove(int commentId);
}
