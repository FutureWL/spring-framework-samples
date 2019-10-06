package io.github.futurewl.site;

import io.github.futurewl.site.entities.Author;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultAuthorRepository extends GenericJpaRepository<Long, Author>
        implements AuthorRepository {

}
