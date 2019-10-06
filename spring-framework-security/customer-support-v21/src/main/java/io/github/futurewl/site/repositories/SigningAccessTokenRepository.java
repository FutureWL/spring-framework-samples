package io.github.futurewl.site.repositories;

import io.github.futurewl.site.entities.SigningAccessToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SigningAccessTokenRepository
        extends JpaRepository<SigningAccessToken, Long> {
    SigningAccessToken getByKey(String key);

    SigningAccessToken getByValue(String value);
}
