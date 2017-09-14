package com.howtocook.domain;

import java.time.LocalDate;

/**
 * @author Viktar Kolbik
 * @since 6/19/17
 */
public class Comment {
    private int commentId;
    private String text;
    private LocalDate date;
    private boolean isHidden;

    public Comment() {
    }

    public Comment(int commentId, String text, LocalDate date, boolean isHidden) {
        this.commentId = commentId;
        this.text = text;
        this.date = date;
        this.isHidden = isHidden;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (commentId != comment.commentId) return false;
        if (isHidden != comment.isHidden) return false;
        if (!text.equals(comment.text)) return false;
        return date.equals(comment.date);
    }

    @Override
    public int hashCode() {
        int result = commentId;
        result = 13 * result + text.hashCode();
        result = 14 * result + date.hashCode();
        result = 15 * result + (isHidden ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", isHidden=" + isHidden +
                '}';
    }
}
