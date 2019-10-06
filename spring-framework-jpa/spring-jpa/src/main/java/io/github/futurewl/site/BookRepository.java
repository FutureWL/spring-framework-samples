package io.github.futurewl.site;

import io.github.futurewl.site.entities.Book;

public interface BookRepository extends GenericRepository<Long, Book> {
    Book getByIsbn(String isbn);
}
