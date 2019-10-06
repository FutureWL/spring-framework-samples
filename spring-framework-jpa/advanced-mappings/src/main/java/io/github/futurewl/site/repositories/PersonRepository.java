package io.github.futurewl.site.repositories;

import io.github.futurewl.site.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
