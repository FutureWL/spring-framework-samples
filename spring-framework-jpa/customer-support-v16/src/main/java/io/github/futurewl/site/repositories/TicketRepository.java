package io.github.futurewl.site.repositories;

import io.github.futurewl.site.entities.TicketEntity;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<TicketEntity, Long> {

}
