package io.github.futurewl.site;

public class LoginEvent extends AuthenticationEvent {
    public LoginEvent(String username) {
        super(username);
    }
}
