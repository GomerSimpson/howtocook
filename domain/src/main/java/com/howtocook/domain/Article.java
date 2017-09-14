package com.howtocook.domain;

import javax.persistence.Entity;
import java.time.LocalDate;

/**
 * @author Viktar Kolbik
 * @since 6/19/17
 */
@Entity
public class Article {
    private int articleId;
    private String header;
    private String text;
    private LocalDate date;
    private boolean isChecked;

    public Article() {
    }

    public Article(int articleId, String header, String text, LocalDate date, boolean isChecked) {
        this.articleId = articleId;
        this.header = header;
        this.text = text;
        this.date = date;
        this.isChecked = isChecked;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
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

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (articleId != article.articleId) return false;
        if (isChecked != article.isChecked) return false;
        if (!header.equals(article.header)) return false;
        if (!text.equals(article.text)) return false;
        return date.equals(article.date);
    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 16 * result + header.hashCode();
        result = 17 * result + text.hashCode();
        result = 18 * result + date.hashCode();
        result = 19 * result + (isChecked ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", header='" + header + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", isChecked=" + isChecked +
                '}';
    }
}
