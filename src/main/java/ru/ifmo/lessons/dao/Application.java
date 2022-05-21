package ru.ifmo.lessons.dao;

public class Application {
    public static void main(String[] args) {
        AuthorDao authorDao = new AuthorDao();

        Author author1 = new Author();
        author1.setName("автор1");
        author1.setAge(21);

        Author addAuthor1 = authorDao.add(author1);
        System.out.println(addAuthor1);

        addAuthor1.setName("новый автор");
        addAuthor1.setAge(22);

        authorDao.update(addAuthor1);
        // реализовать метод получения по первичному ключу getByPK

        ArticleDao articleDao = new ArticleDao();

        Article fromTable = articleDao.getByPK(1);
        System.out.println(fromTable);

        // реализовать метод добавления статьи:
        // Article add(Article article)

        // реализовать метод удаления автора по первичному ключу:
        // deleteByPK(Integer integer)

        // добавить в класс ArticleDao метод
        // получения статьи по названию *
    }
}
