package io.github.futurewl.site;

import io.github.futurewl.site.entities.SigningAccessToken;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

public interface SigningAccessTokenServices
        extends AuthorizationServerTokenServices, ResourceServerTokenServices {
    SigningAccessToken getAccessToken(String key);
}
