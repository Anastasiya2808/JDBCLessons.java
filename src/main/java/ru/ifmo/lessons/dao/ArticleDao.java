package ru.ifmo.lessons.dao;

import ru.ifmo.lessons.pool.C3P0DataSource;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ArticleDao implements Dao <Article, Integer> {

    @Override
    public Article add(Article article) {
        return null;
    }

    @Override
    public void update(Article article) {

    }

    @Override
    public void deleteByPK(Integer integer) {

    }

    @Override
    public void delete(Article article) {

    }

    @Override
    public Article getByPK(Integer integer) {
        String sql = "SELECT title, text, created_on, author_id " +
                "FROM article WHERE article_id = ?";
        Article article = new Article();
        try (PreparedStatement statement = C3P0DataSource
                .getConnection().prepareStatement(sql)){
            statement.setInt(1, integer);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                article = new Article();
                article.setId(integer);
                article.setTitle(resultSet.getString("title"));
                article.setText(resultSet.getString("text"));
                article.setAuthorId(resultSet.getInt("author_id"));
                article.setCreatedOn(resultSet.getTimestamp("created_on").toLocalDateTime());
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Article> getAll() {
        return null;
    }
}
