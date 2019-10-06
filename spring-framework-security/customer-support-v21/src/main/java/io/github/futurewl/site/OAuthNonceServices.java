package io.github.futurewl.site;

public interface OAuthNonceServices {
    void recordNonceOrFailIfDuplicate(String nonce, long timestamp);
}
