package io.github.futurewl.site;

import io.github.futurewl.site.entities.UserPrincipal;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultUserRepository
        extends GenericJpaRepository<Long, UserPrincipal>
        implements UserRepository {
    @Override
    public UserPrincipal getByUsername(String username) {
        return this.entityManager.createQuery(
                "SELECT u FROM UserPrincipal u WHERE u.username = :username",
                UserPrincipal.class
        ).setParameter("username", username).getSingleResult();
    }
}
