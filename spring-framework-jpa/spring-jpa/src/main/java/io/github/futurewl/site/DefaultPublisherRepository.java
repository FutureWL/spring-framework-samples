package io.github.futurewl.site;

import io.github.futurewl.site.entities.Publisher;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultPublisherRepository
        extends GenericJpaRepository<Long, Publisher>
        implements PublisherRepository {

}
