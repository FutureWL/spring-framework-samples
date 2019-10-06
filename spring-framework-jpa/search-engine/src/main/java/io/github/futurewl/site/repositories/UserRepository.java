package io.github.futurewl.site.repositories;

import io.github.futurewl.site.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User getByUsername(String username);
}
