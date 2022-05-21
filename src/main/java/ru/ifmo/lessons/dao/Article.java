package ru.ifmo.lessons.dao;

import java.time.LocalDateTime;
import java.util.Objects;

public class Article {
    private int id; // первичный ключ PK
    private String title;
    private String text;
    private LocalDateTime createdOn;
    // связь между сущностями в программе может быть
    // 1) private int authorId;
    // 2) private Author author; при этом в классе
    // Author может быть ссылка на коллекцию,
    // которая хронит статьи авторов
    private int authorId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", createdOn=" + createdOn +
                ", authorId=" + authorId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return id == article.id && authorId == article.authorId && Objects.equals(title, article.title) &&
                Objects.equals(text, article.text) && Objects.equals(createdOn, article.createdOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, text, createdOn, authorId);
    }
}
