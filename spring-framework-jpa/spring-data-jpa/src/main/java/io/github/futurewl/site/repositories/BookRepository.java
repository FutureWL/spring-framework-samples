package io.github.futurewl.site.repositories;

import io.github.futurewl.site.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    Book getOneByIsbn(String isbn);
}
