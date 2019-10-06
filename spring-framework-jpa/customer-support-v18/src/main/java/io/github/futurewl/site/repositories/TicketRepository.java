package io.github.futurewl.site.repositories;

import io.github.futurewl.site.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long>,
        SearchableRepository<Ticket> {

}
