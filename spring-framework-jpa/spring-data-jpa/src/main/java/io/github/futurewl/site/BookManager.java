package io.github.futurewl.site;

import io.github.futurewl.site.entities.Author;
import io.github.futurewl.site.entities.Book;
import io.github.futurewl.site.entities.Publisher;

import java.util.List;

public interface BookManager {
    List<Author> getAuthors();

    List<Book> getBooks();

    List<Publisher> getPublishers();

    void saveAuthor(Author author);

    void saveBook(Book book);

    void savePublisher(Publisher publisher);
}
