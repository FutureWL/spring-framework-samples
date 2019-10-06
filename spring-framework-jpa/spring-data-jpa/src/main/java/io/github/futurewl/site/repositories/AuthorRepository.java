package io.github.futurewl.site.repositories;

import io.github.futurewl.site.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
