package io.github.futurewl.site.repositories;

import io.github.futurewl.site.entities.UserPrincipal;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserPrincipal, Long> {
    UserPrincipal getByUsername(String username);
}
