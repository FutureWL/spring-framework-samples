package io.github.futurewl.site.repositories;

import io.github.futurewl.site.entities.WebServiceClient;
import org.springframework.data.repository.CrudRepository;

public interface WebServiceClientRepository
        extends CrudRepository<WebServiceClient, Long> {
    WebServiceClient getByClientId(String clientId);
}
