package io.github.futurewl.site;

import io.github.futurewl.site.entities.WebServiceClient;
import org.springframework.security.oauth2.provider.ClientDetailsService;

public interface WebServiceClientService extends ClientDetailsService {
    @Override
    WebServiceClient loadClientByClientId(String clientId);
}
