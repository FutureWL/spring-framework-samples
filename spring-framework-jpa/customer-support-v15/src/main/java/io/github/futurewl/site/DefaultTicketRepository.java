package io.github.futurewl.site;

import io.github.futurewl.site.entities.TicketEntity;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultTicketRepository
        extends GenericJpaRepository<Long, TicketEntity>
        implements TicketRepository {
}
