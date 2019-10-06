package io.github.futurewl.site;

import io.github.futurewl.site.entities.UserPrincipal;

public interface UserRepository extends GenericRepository<Long, UserPrincipal> {
    UserPrincipal getByUsername(String username);
}
