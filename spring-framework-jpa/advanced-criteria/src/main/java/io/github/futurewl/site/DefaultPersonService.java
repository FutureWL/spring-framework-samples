package io.github.futurewl.site;

import io.github.futurewl.site.entities.Person;
import io.github.futurewl.site.repositories.PersonRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Service
public class DefaultPersonService implements PersonService {
    @Inject
    PersonRepository repository;

    @Override
    @Transactional
    public void savePerson(Person person) {
        this.repository.save(person);
    }

    @Override
    @Transactional
    public Page<Person> searchPeople(SearchCriteria searchCriteria, Pageable pageable) {
        return this.repository.search(searchCriteria, pageable);
    }
}
